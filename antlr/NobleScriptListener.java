// Generated from C:/Users/Danie/Desktop/noble-script/src\NobleScript.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link NobleScriptParser}.
 */
public interface NobleScriptListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link NobleScriptParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(NobleScriptParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link NobleScriptParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(NobleScriptParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link NobleScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(NobleScriptParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NobleScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(NobleScriptParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NobleScriptParser#assign_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssign_statement(NobleScriptParser.Assign_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NobleScriptParser#assign_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssign_statement(NobleScriptParser.Assign_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NobleScriptParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(NobleScriptParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NobleScriptParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(NobleScriptParser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NobleScriptParser#definition}.
	 * @param ctx the parse tree
	 */
	void enterDefinition(NobleScriptParser.DefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NobleScriptParser#definition}.
	 * @param ctx the parse tree
	 */
	void exitDefinition(NobleScriptParser.DefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NobleScriptParser#structure_definition}.
	 * @param ctx the parse tree
	 */
	void enterStructure_definition(NobleScriptParser.Structure_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NobleScriptParser#structure_definition}.
	 * @param ctx the parse tree
	 */
	void exitStructure_definition(NobleScriptParser.Structure_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NobleScriptParser#function_definition}.
	 * @param ctx the parse tree
	 */
	void enterFunction_definition(NobleScriptParser.Function_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NobleScriptParser#function_definition}.
	 * @param ctx the parse tree
	 */
	void exitFunction_definition(NobleScriptParser.Function_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NobleScriptParser#variable_definition}.
	 * @param ctx the parse tree
	 */
	void enterVariable_definition(NobleScriptParser.Variable_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NobleScriptParser#variable_definition}.
	 * @param ctx the parse tree
	 */
	void exitVariable_definition(NobleScriptParser.Variable_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NobleScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(NobleScriptParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NobleScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(NobleScriptParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NobleScriptParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(NobleScriptParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link NobleScriptParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(NobleScriptParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link NobleScriptParser#function_call_stm}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call_stm(NobleScriptParser.Function_call_stmContext ctx);
	/**
	 * Exit a parse tree produced by {@link NobleScriptParser#function_call_stm}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call_stm(NobleScriptParser.Function_call_stmContext ctx);
	/**
	 * Enter a parse tree produced by {@link NobleScriptParser#print_stm}.
	 * @param ctx the parse tree
	 */
	void enterPrint_stm(NobleScriptParser.Print_stmContext ctx);
	/**
	 * Exit a parse tree produced by {@link NobleScriptParser#print_stm}.
	 * @param ctx the parse tree
	 */
	void exitPrint_stm(NobleScriptParser.Print_stmContext ctx);
	/**
	 * Enter a parse tree produced by {@link NobleScriptParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(NobleScriptParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link NobleScriptParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(NobleScriptParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolean}
	 * labeled alternative in {@link NobleScriptParser#primitive_literal}.
	 * @param ctx the parse tree
	 */
	void enterBoolean(NobleScriptParser.BooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolean}
	 * labeled alternative in {@link NobleScriptParser#primitive_literal}.
	 * @param ctx the parse tree
	 */
	void exitBoolean(NobleScriptParser.BooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link NobleScriptParser#primitive_literal}.
	 * @param ctx the parse tree
	 */
	void enterInt(NobleScriptParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link NobleScriptParser#primitive_literal}.
	 * @param ctx the parse tree
	 */
	void exitInt(NobleScriptParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code double}
	 * labeled alternative in {@link NobleScriptParser#primitive_literal}.
	 * @param ctx the parse tree
	 */
	void enterDouble(NobleScriptParser.DoubleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code double}
	 * labeled alternative in {@link NobleScriptParser#primitive_literal}.
	 * @param ctx the parse tree
	 */
	void exitDouble(NobleScriptParser.DoubleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string}
	 * labeled alternative in {@link NobleScriptParser#primitive_literal}.
	 * @param ctx the parse tree
	 */
	void enterString(NobleScriptParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string}
	 * labeled alternative in {@link NobleScriptParser#primitive_literal}.
	 * @param ctx the parse tree
	 */
	void exitString(NobleScriptParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code null}
	 * labeled alternative in {@link NobleScriptParser#primitive_literal}.
	 * @param ctx the parse tree
	 */
	void enterNull(NobleScriptParser.NullContext ctx);
	/**
	 * Exit a parse tree produced by the {@code null}
	 * labeled alternative in {@link NobleScriptParser#primitive_literal}.
	 * @param ctx the parse tree
	 */
	void exitNull(NobleScriptParser.NullContext ctx);
	/**
	 * Enter a parse tree produced by {@link NobleScriptParser#array_literal}.
	 * @param ctx the parse tree
	 */
	void enterArray_literal(NobleScriptParser.Array_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link NobleScriptParser#array_literal}.
	 * @param ctx the parse tree
	 */
	void exitArray_literal(NobleScriptParser.Array_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link NobleScriptParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(NobleScriptParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NobleScriptParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(NobleScriptParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NobleScriptParser#array_type}.
	 * @param ctx the parse tree
	 */
	void enterArray_type(NobleScriptParser.Array_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NobleScriptParser#array_type}.
	 * @param ctx the parse tree
	 */
	void exitArray_type(NobleScriptParser.Array_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NobleScriptParser#primitive_type}.
	 * @param ctx the parse tree
	 */
	void enterPrimitive_type(NobleScriptParser.Primitive_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NobleScriptParser#primitive_type}.
	 * @param ctx the parse tree
	 */
	void exitPrimitive_type(NobleScriptParser.Primitive_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NobleScriptParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(NobleScriptParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link NobleScriptParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(NobleScriptParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link NobleScriptParser#compound_statement}.
	 * @param ctx the parse tree
	 */
	void enterCompound_statement(NobleScriptParser.Compound_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NobleScriptParser#compound_statement}.
	 * @param ctx the parse tree
	 */
	void exitCompound_statement(NobleScriptParser.Compound_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NobleScriptParser#loop_statement}.
	 * @param ctx the parse tree
	 */
	void enterLoop_statement(NobleScriptParser.Loop_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NobleScriptParser#loop_statement}.
	 * @param ctx the parse tree
	 */
	void exitLoop_statement(NobleScriptParser.Loop_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NobleScriptParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(NobleScriptParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NobleScriptParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(NobleScriptParser.If_statementContext ctx);
}