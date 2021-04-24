import exceptions.IDAlreadyDefinedException;
import exceptions.IDNotDefinedException;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import types.DefinitionType;
import types.ValueType;
import types.VarType;

import java.util.*;

import static types.ValueType.*;


class Value {
    public String content;
    public ValueType type;

    public Value(String content, ValueType type) {
        this.content = content;
        this.type = type;
    }
}

class Definition {
    public String id;
    public VarType type;
    public DefinitionType defType;

    public Definition(String id, VarType type, DefinitionType defType) {
        this.id = id;
        this.type = type;
        this.defType = defType;
    }
}

public class LLVMActions implements NobleScriptListener {
    private final Map<String, Map<String, Definition>> functionDefs = new HashMap<>();
    private final Stack<String> functionStack = new Stack<>();
    private final Stack<Value> valueStack = new Stack<>();

    private final LLVMGenerator generator;

    private final int logLevel;

    private final String GLOBAL_SCOPE_STACK_ID = "";

    public LLVMActions(LLVMGenerator generator, int logLevel) {
        this.generator = generator;
        this.logLevel = logLevel;
        functionDefs.put(GLOBAL_SCOPE_STACK_ID, new HashMap<>());
    }

    @Override
    public void enterProgram(NobleScriptParser.ProgramContext ctx) {
        log("on enterProgram");
    }

    @Override
    public void exitProgram(NobleScriptParser.ProgramContext ctx) {
        log("on exitProgram");
    }

    @Override
    public void enterStatement(NobleScriptParser.StatementContext ctx) {
        log("on enterStatement");
    }

    @Override
    public void exitStatement(NobleScriptParser.StatementContext ctx) {
        log("on exitStatement");
    }

    @Override
    public void enterAssign_statement(NobleScriptParser.Assign_statementContext ctx) {
        log("on enterAssign_statement");
    }

    @Override
    public void exitAssign_statement(NobleScriptParser.Assign_statementContext ctx) {
        log("on exitAssign_statement");
    }

    @Override
    public void enterReturn_statement(NobleScriptParser.Return_statementContext ctx) {
        log("on enterReturn_statement");
    }

    @Override
    public void exitReturn_statement(NobleScriptParser.Return_statementContext ctx) {
        log("on exitReturn_statement");
    }

    @Override
    public void enterDefinition(NobleScriptParser.DefinitionContext ctx) {
        log("on enterDefinition");
    }

    @Override
    public void exitDefinition(NobleScriptParser.DefinitionContext ctx) {
        log("on exitDefinition");
    }

    @Override
    public void enterStructure_definition(NobleScriptParser.Structure_definitionContext ctx) {
        log("on enterStructure_definition");
    }

    @Override
    public void exitStructure_definition(NobleScriptParser.Structure_definitionContext ctx) {
        log("on exitStructure_definition");
    }

    @Override
    public void enterFunction_definition(NobleScriptParser.Function_definitionContext ctx) {
        log("on enterFunction_definition");
        final VarType newFunType = VarType.getType(ctx.type(0).getText());
        final String newFunId = ctx.ID(0).getText();
        final Definition newFunDef = new Definition(newFunId, newFunType, DefinitionType.FUNCTION);

        final String scopeId = functionStack.empty() ? "" : functionStack.peek();
        final String newScopeId = (scopeId.equals("") ? "" : scopeId + ".") + newFunId;

        // Check if there's a function of the same stackId
        if (functionDefs.containsKey(newScopeId)) {
            throw new IDAlreadyDefinedException(newFunId, scopeId);
        }

        // Add function definition to its scope
        if (functionDefs.containsKey(scopeId)) {
            // Check if the ID already exists in the scope
            if (functionDefs.get(scopeId).containsKey(newFunId)) {
                throw new IDAlreadyDefinedException(newFunId, scopeId);
            }

            functionDefs.get(scopeId).put(newFunId, newFunDef);
        } else {
            throw new IllegalStateException("Unable to check if ID {" + newFunId + "} was defined in scope P" + scopeId + "}");
        }

        functionDefs.put(newScopeId, new HashMap<>());
        functionStack.push(newScopeId);

        // TODO add LLVMGenerator actions
    }

    @Override
    public void exitFunction_definition(NobleScriptParser.Function_definitionContext ctx) {
        log("on exitFunction_definition");
        functionStack.pop();

        // TODO add LLVMGenerator actions
    }

    @Override
    public void enterVariable_definition(NobleScriptParser.Variable_definitionContext ctx) {
        log("on enterVariable_definition");
        final VarType newVarType = VarType.getType(ctx.type().getText());
        final String newVarId = ctx.assign_statement().ID().getText();
        final Definition newVarDef = new Definition(newVarId, newVarType, DefinitionType.VARIABLE);

        // Check function scope
        final String scopeId = functionStack.empty() ? "" : functionStack.peek();
        if (functionDefs.containsKey(scopeId)) {
            if (functionDefs.get(scopeId).containsKey(newVarId)) {
                throw new IDAlreadyDefinedException(newVarId, scopeId);
            }
        } else {
            throw new IllegalStateException("Cannot define variable: " + newVarId + " for function: " + scopeId);
        }

        functionDefs.get(scopeId).put(newVarId, newVarDef);
    }

    @Override
    public void exitVariable_definition(NobleScriptParser.Variable_definitionContext ctx) {
        log("on exitVariable_definition");
        final boolean isGlobal = functionStack.empty();
        final String id = ctx.assign_statement().ID().getText();
        final String value = valueStack.pop().content;

        // TODO add more types
        switch (VarType.getType(ctx.type().getText())) {
            case INT:
                generator.declare_i32(id, isGlobal);
                generator.assign_i32(id, value, isGlobal);
                break;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override
    public void enterExpression(NobleScriptParser.ExpressionContext ctx) {
        log("on enterExpression");
    }

    @Override
    public void exitExpression(NobleScriptParser.ExpressionContext ctx) {
        log("on exitExpression");
    }

    @Override
    public void enterValue(NobleScriptParser.ValueContext ctx) {
        log("on enterValue");
    }

    @Override
    public void exitValue(NobleScriptParser.ValueContext ctx) {
        log("on exitValue");
        if (ctx.ID() != null) {
            final String valueID = ctx.ID().getText();

            Definition variableDefinition = null;
            boolean isGlobal = false;

            // Check if variable was defined in function scopes
            final String scopeId = functionStack.empty() ? "" : functionStack.peek();
            String[] scopes = scopeId.split("\\.");
            for (int i = 1; i < scopes.length; i++) {
                scopes[i] = scopes[i - 1] + "." + scopes[i];
            }
            for (int i = scopes.length - 1; i >= 0; i--) {
                if (functionDefs.get(scopes[i]).containsKey(valueID)) {
                    variableDefinition = functionDefs.get(scopes[i]).get(valueID);
                    isGlobal = false;
                    break;
                }
            }

            // Check if variable was defined in global scope
            if (variableDefinition == null){
                if(functionDefs.get(GLOBAL_SCOPE_STACK_ID).containsKey(ctx.ID().getText())){
                    variableDefinition = functionDefs.get(GLOBAL_SCOPE_STACK_ID).get(valueID);
                    isGlobal=true;
                }
            }

            if (variableDefinition == null){
                throw new IDNotDefinedException(valueID);
            }

            Value value = new Value(getValueContent(variableDefinition, isGlobal), VALUE_ID);
            valueStack.push(value);
        } else if (ctx.function_call_stm() != null) {
            // TODO implement functions calls
            throw new UnsupportedOperationException();
        }
    }

    @Override
    public void enterFunction_call_stm(NobleScriptParser.Function_call_stmContext ctx) {
        log("on enterFunction_call_stm");
    }

    @Override
    public void exitFunction_call_stm(NobleScriptParser.Function_call_stmContext ctx) {
        log("on exitFunction_call_stm");
    }

    @Override
    public void enterPrint_stm(NobleScriptParser.Print_stmContext ctx) {
        log("on enterPrint_stm");
    }

    @Override
    public void exitPrint_stm(NobleScriptParser.Print_stmContext ctx) {
        log("on exitPrint_stm");
        generator.print_i32(ctx.expression().value().ID().getText());
    }

    @Override
    public void enterLiteral(NobleScriptParser.LiteralContext ctx) {
        log("on enterLiteral");
    }

    @Override
    public void exitLiteral(NobleScriptParser.LiteralContext ctx) {
        log("on exitLiteral");
    }

    @Override
    public void enterBoolean(NobleScriptParser.BooleanContext ctx) {
        log("on enterBoolean");
    }

    @Override
    public void exitBoolean(NobleScriptParser.BooleanContext ctx) {
        log("on exitBoolean");
        valueStack.push(new Value(ctx.getText(), VALUE_BOOLEAN));
    }

    @Override
    public void enterInt(NobleScriptParser.IntContext ctx) {
        log("on enterInt");
    }

    @Override
    public void exitInt(NobleScriptParser.IntContext ctx) {
        log("on exitInt");
        valueStack.push(new Value(ctx.getText(), VALUE_INT));
    }

    @Override
    public void enterDouble(NobleScriptParser.DoubleContext ctx) {
        log("on enterDouble");
    }

    @Override
    public void exitDouble(NobleScriptParser.DoubleContext ctx) {
        log("on exitDouble");
        valueStack.push(new Value(ctx.getText(), VALUE_BOOLEAN));
    }

    @Override
    public void enterString(NobleScriptParser.StringContext ctx) {
        log("on enterString");
    }

    @Override
    public void exitString(NobleScriptParser.StringContext ctx) {
        log("on exitString");
        valueStack.push(new Value(ctx.getText(), VALUE_STRING));
    }

    @Override
    public void enterNull(NobleScriptParser.NullContext ctx) {
        log("on enterNull");
    }

    @Override
    public void exitNull(NobleScriptParser.NullContext ctx) {
        log("on exitNull");
        valueStack.push(new Value(ctx.getText(), VALUE_NULL));
    }

    @Override
    public void enterArray_literal(NobleScriptParser.Array_literalContext ctx) {
        log("on enterArray_literal");
    }

    @Override
    public void exitArray_literal(NobleScriptParser.Array_literalContext ctx) {
        log("on exitArray_literal");
    }

    @Override
    public void enterType(NobleScriptParser.TypeContext ctx) {
        log("on enterType");
    }

    @Override
    public void exitType(NobleScriptParser.TypeContext ctx) {
        log("on exitType");
    }

    @Override
    public void enterArray_type(NobleScriptParser.Array_typeContext ctx) {
        log("on enterArray_type");
    }

    @Override
    public void exitArray_type(NobleScriptParser.Array_typeContext ctx) {
        log("on exitArray_type");
    }

    @Override
    public void enterPrimitive_type(NobleScriptParser.Primitive_typeContext ctx) {
        log("on enterPrimitive_type");
    }

    @Override
    public void exitPrimitive_type(NobleScriptParser.Primitive_typeContext ctx) {
        log("on exitPrimitive_type");
    }

    @Override
    public void enterOperator(NobleScriptParser.OperatorContext ctx) {
        log("on enterOperator");
    }

    @Override
    public void exitOperator(NobleScriptParser.OperatorContext ctx) {
        log("on exitOperator");
    }

    @Override
    public void enterCompound_statement(NobleScriptParser.Compound_statementContext ctx) {
        log("on enterCompound_statement");
    }

    @Override
    public void exitCompound_statement(NobleScriptParser.Compound_statementContext ctx) {
        log("on exitCompound_statement");
    }

    @Override
    public void enterLoop_statement(NobleScriptParser.Loop_statementContext ctx) {
        log("on enterLoop_statement");
    }

    @Override
    public void exitLoop_statement(NobleScriptParser.Loop_statementContext ctx) {
        log("on exitLoop_statement");
    }

    @Override
    public void enterIf_statement(NobleScriptParser.If_statementContext ctx) {
        log("on enterIf_statement");
    }

    @Override
    public void exitIf_statement(NobleScriptParser.If_statementContext ctx) {
        log("on exitIf_statement");
    }

    @Override
    public void visitTerminal(TerminalNode terminalNode) {
    }

    @Override
    public void visitErrorNode(ErrorNode errorNode) {
    }

    @Override
    public void enterEveryRule(ParserRuleContext parserRuleContext) {
    }

    @Override
    public void exitEveryRule(ParserRuleContext parserRuleContext) {
    }

    private String getValueContent(Definition definition, boolean isGlobal) {
        if (definition.type == VarType.INT) {
            generator.load_i32(definition.id, isGlobal);
            return "%" + (generator.getRegister() - 1);
        } else {
            // TODO function call, load double etc
            throw new UnsupportedOperationException();
        }
    }

    private void log(String msg) {
        if (logLevel > 0) System.out.println(msg);
    }
}
