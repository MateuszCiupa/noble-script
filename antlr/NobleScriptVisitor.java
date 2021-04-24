// Generated from C:/Users/Danie/Desktop/noble-script/src\NobleScript.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link NobleScriptParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface NobleScriptVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link NobleScriptParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(NobleScriptParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link NobleScriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(NobleScriptParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NobleScriptParser#assign_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_statement(NobleScriptParser.Assign_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NobleScriptParser#return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(NobleScriptParser.Return_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NobleScriptParser#definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition(NobleScriptParser.DefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NobleScriptParser#structure_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructure_definition(NobleScriptParser.Structure_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NobleScriptParser#function_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_definition(NobleScriptParser.Function_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NobleScriptParser#variable_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_definition(NobleScriptParser.Variable_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NobleScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(NobleScriptParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NobleScriptParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(NobleScriptParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link NobleScriptParser#function_call_stm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call_stm(NobleScriptParser.Function_call_stmContext ctx);
	/**
	 * Visit a parse tree produced by {@link NobleScriptParser#print_stm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_stm(NobleScriptParser.Print_stmContext ctx);
	/**
	 * Visit a parse tree produced by {@link NobleScriptParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(NobleScriptParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolean}
	 * labeled alternative in {@link NobleScriptParser#primitive_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean(NobleScriptParser.BooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link NobleScriptParser#primitive_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(NobleScriptParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code double}
	 * labeled alternative in {@link NobleScriptParser#primitive_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDouble(NobleScriptParser.DoubleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code string}
	 * labeled alternative in {@link NobleScriptParser#primitive_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(NobleScriptParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code null}
	 * labeled alternative in {@link NobleScriptParser#primitive_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull(NobleScriptParser.NullContext ctx);
	/**
	 * Visit a parse tree produced by {@link NobleScriptParser#array_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_literal(NobleScriptParser.Array_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link NobleScriptParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(NobleScriptParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link NobleScriptParser#array_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_type(NobleScriptParser.Array_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link NobleScriptParser#primitive_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitive_type(NobleScriptParser.Primitive_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link NobleScriptParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(NobleScriptParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link NobleScriptParser#compound_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_statement(NobleScriptParser.Compound_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NobleScriptParser#loop_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_statement(NobleScriptParser.Loop_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NobleScriptParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(NobleScriptParser.If_statementContext ctx);
}