package com.noble.script.llvm.generator;

import com.noble.script.antlr.NobleScriptListener;
import com.noble.script.antlr.NobleScriptParser;
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

    public LLVMActions(LLVMGenerator generator) {
        this.generator = generator;
    }

    @Override

    public void enterProgram(NobleScriptParser.ProgramContext ctx) {

    }

    @Override
    public void exitProgram(NobleScriptParser.ProgramContext ctx) {

    }

    @Override
    public void enterStatement(NobleScriptParser.StatementContext ctx) {

    }

    @Override
    public void exitStatement(NobleScriptParser.StatementContext ctx) {

    }

    @Override
    public void enterAssign_statement(NobleScriptParser.Assign_statementContext ctx) {

    }

    @Override
    public void exitAssign_statement(NobleScriptParser.Assign_statementContext ctx) {

    }

    @Override
    public void enterReturn_statement(NobleScriptParser.Return_statementContext ctx) {

    }

    @Override
    public void exitReturn_statement(NobleScriptParser.Return_statementContext ctx) {

    }

    @Override
    public void enterDefinition(NobleScriptParser.DefinitionContext ctx) {

    }

    @Override
    public void exitDefinition(NobleScriptParser.DefinitionContext ctx) {

    }

    @Override
    public void enterStructure_definition(NobleScriptParser.Structure_definitionContext ctx) {

    }

    @Override
    public void exitStructure_definition(NobleScriptParser.Structure_definitionContext ctx) {

    }

    @Override
    public void enterFunction_definition(NobleScriptParser.Function_definitionContext ctx) {
    }

    @Override
    public void exitFunction_definition(NobleScriptParser.Function_definitionContext ctx) {

    }

    @Override
    public void enterVariable_definition(NobleScriptParser.Variable_definitionContext ctx) {

    }

    @Override
    public void exitVariable_definition(NobleScriptParser.Variable_definitionContext ctx) {

    }

    @Override
    public void enterExpression(NobleScriptParser.ExpressionContext ctx) {

    }

    @Override
    public void exitExpression(NobleScriptParser.ExpressionContext ctx) {

    }

    @Override
    public void enterValue(NobleScriptParser.ValueContext ctx) {

    }

    @Override
    public void exitValue(NobleScriptParser.ValueContext ctx) {

    }

    @Override
    public void enterFunction_call_stm(NobleScriptParser.Function_call_stmContext ctx) {

    }

    @Override
    public void exitFunction_call_stm(NobleScriptParser.Function_call_stmContext ctx) {

    }

    @Override
    public void enterPrint_stm(NobleScriptParser.Print_stmContext ctx) {

    }

    @Override
    public void exitPrint_stm(NobleScriptParser.Print_stmContext ctx) {

    }

    @Override
    public void enterLiteral(NobleScriptParser.LiteralContext ctx) {

    }

    @Override
    public void exitLiteral(NobleScriptParser.LiteralContext ctx) {

    }

    @Override
    public void enterPrimitive_literal(NobleScriptParser.Primitive_literalContext ctx) {

    }

    @Override
    public void exitPrimitive_literal(NobleScriptParser.Primitive_literalContext ctx) {

    }

    @Override
    public void enterArray_literal(NobleScriptParser.Array_literalContext ctx) {

    }

    @Override
    public void exitArray_literal(NobleScriptParser.Array_literalContext ctx) {

    }

    @Override
    public void enterType(NobleScriptParser.TypeContext ctx) {

    }

    @Override
    public void exitType(NobleScriptParser.TypeContext ctx) {

    }

    @Override
    public void enterArray_type(NobleScriptParser.Array_typeContext ctx) {

    }

    @Override
    public void exitArray_type(NobleScriptParser.Array_typeContext ctx) {

    }

    @Override
    public void enterPrimitive_type(NobleScriptParser.Primitive_typeContext ctx) {

    }

    @Override
    public void exitPrimitive_type(NobleScriptParser.Primitive_typeContext ctx) {

    }

    @Override
    public void enterOperator(NobleScriptParser.OperatorContext ctx) {

    }

    @Override
    public void exitOperator(NobleScriptParser.OperatorContext ctx) {

    }

    @Override
    public void enterCompound_statement(NobleScriptParser.Compound_statementContext ctx) {

    }

    @Override
    public void exitCompound_statement(NobleScriptParser.Compound_statementContext ctx) {

    }

    @Override
    public void enterLoop_statement(NobleScriptParser.Loop_statementContext ctx) {

    }

    @Override
    public void exitLoop_statement(NobleScriptParser.Loop_statementContext ctx) {

    }

    @Override
    public void enterIf_statement(NobleScriptParser.If_statementContext ctx) {

    }

    @Override
    public void exitIf_statement(NobleScriptParser.If_statementContext ctx) {

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
}
