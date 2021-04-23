import antlr.NobleScriptListener;
import antlr.NobleScriptParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;
import java.util.Stack;

class Value {
    public String name;
    public VarType type;

    public Value(String name, VarType type) {
        this.name = name;
        this.type = type;
    }
}

public class LLVMActions implements NobleScriptListener {

    private HashMap<String, VarType> variables = new HashMap<String, VarType>();
    private Stack<Value> stack = new Stack<>();
    private LLVMGenerator generator;

    private int logLevel;

    public LLVMActions(LLVMGenerator generator, int logLevel) {
        this.generator = generator;
        this.logLevel = logLevel;
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
    }

    @Override
    public void exitFunction_definition(NobleScriptParser.Function_definitionContext ctx) {
        log("on exitFunction_definition");
    }

    @Override
    public void enterVariable_definition(NobleScriptParser.Variable_definitionContext ctx) {
        log("on enterVariable_definition");
    }

    @Override
    public void exitVariable_definition(NobleScriptParser.Variable_definitionContext ctx) {
        log("on exitVariable_definition");

        String varId = ctx.assign_statement().ID().getText();
        String value = ctx.assign_statement().expression().value().getText();

        generator.declare_i32(varId);
        generator.assign_i32(varId, value);
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
    public void enterPrimitive_literal(NobleScriptParser.Primitive_literalContext ctx) {
        log("on enterPrimitive_literal");
    }

    @Override
    public void exitPrimitive_literal(NobleScriptParser.Primitive_literalContext ctx) {
        log("on exitPrimitive_literal");
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

    private void log(String msg) {
        if (logLevel > 0) System.out.println(msg);
    }
}
