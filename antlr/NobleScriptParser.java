// Generated from //wsl$/Ubuntu-20.04/home/ciupam/repos/noble-script/src\NobleScript.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class NobleScriptParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, READ_DOUBLE=4, READ_INT=5, RETURN=6, WHILE=7, 
		IF=8, ELIF=9, ELSE=10, PAR_OPEN=11, PAR_CLOSE=12, BRACES_OPEN=13, BRACES_CLOSE=14, 
		BRACKET_OPEN=15, BRACKET_CLOSE=16, NULL=17, INT_LITERAL=18, DOUBLE_LITERAL=19, 
		BOOLEAN_LITERAL=20, STRING_LITERAL=21, BOOLEAN_TYPE=22, INT_TYPE=23, DOUBLE_TYPE=24, 
		STRING_TYPE=25, ID=26, SEMICOL=27, ASSIGN_OP=28, LESSER_THAN_OP=29, LESSER_THAN_OR_EQUAL_OP=30, 
		GREATER_THAN_OP=31, GREATER_THAN_OR_EQUAL_OP=32, EQUAL_OP=33, NOT_EQUAL_OP=34, 
		PLUS_OP=35, MINUS_OP=36, POW_OP=37, DIV_OP=38, MUL_OP=39, WHITESPACE=40, 
		NEWLINE=41;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_assign_statement = 2, RULE_return_statement = 3, 
		RULE_definition = 4, RULE_structure_definition = 5, RULE_function_definition = 6, 
		RULE_variable_definition = 7, RULE_array_definition = 8, RULE_expression = 9, 
		RULE_expression0 = 10, RULE_expression1 = 11, RULE_expression2 = 12, RULE_expression3 = 13, 
		RULE_value = 14, RULE_array_index = 15, RULE_function_call_stm = 16, RULE_print_stm = 17, 
		RULE_literal = 18, RULE_primitive_literal = 19, RULE_type = 20, RULE_primitive_type = 21, 
		RULE_operator2 = 22, RULE_operator1 = 23, RULE_operator0 = 24, RULE_compound_statement = 25, 
		RULE_loop_statement = 26, RULE_if_statement = 27, RULE_elif_statement = 28, 
		RULE_else_statement = 29, RULE_block_open = 30, RULE_block_close = 31, 
		RULE_read_op = 32;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "assign_statement", "return_statement", "definition", 
			"structure_definition", "function_definition", "variable_definition", 
			"array_definition", "expression", "expression0", "expression1", "expression2", 
			"expression3", "value", "array_index", "function_call_stm", "print_stm", 
			"literal", "primitive_literal", "type", "primitive_type", "operator2", 
			"operator1", "operator0", "compound_statement", "loop_statement", "if_statement", 
			"elif_statement", "else_statement", "block_open", "block_close", "read_op"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'struct'", "','", "'print('", "'readDouble()'", "'readInt()'", 
			"'return'", "'while'", "'if'", "'elif'", "'else'", "'('", "')'", "'{'", 
			"'}'", "'['", "']'", "'null'", null, null, null, null, "'boolean'", "'int'", 
			"'double'", "'string'", null, "';'", "'='", "'<'", "'<='", "'>'", "'>='", 
			"'=='", "'!='", "'+'", "'-'", "'^'", "'/'", "'*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "READ_DOUBLE", "READ_INT", "RETURN", "WHILE", 
			"IF", "ELIF", "ELSE", "PAR_OPEN", "PAR_CLOSE", "BRACES_OPEN", "BRACES_CLOSE", 
			"BRACKET_OPEN", "BRACKET_CLOSE", "NULL", "INT_LITERAL", "DOUBLE_LITERAL", 
			"BOOLEAN_LITERAL", "STRING_LITERAL", "BOOLEAN_TYPE", "INT_TYPE", "DOUBLE_TYPE", 
			"STRING_TYPE", "ID", "SEMICOL", "ASSIGN_OP", "LESSER_THAN_OP", "LESSER_THAN_OR_EQUAL_OP", 
			"GREATER_THAN_OP", "GREATER_THAN_OR_EQUAL_OP", "EQUAL_OP", "NOT_EQUAL_OP", 
			"PLUS_OP", "MINUS_OP", "POW_OP", "DIV_OP", "MUL_OP", "WHITESPACE", "NEWLINE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "NobleScript.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public NobleScriptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(NobleScriptParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NobleScriptVisitor ) return ((NobleScriptVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << READ_DOUBLE) | (1L << READ_INT) | (1L << RETURN) | (1L << WHILE) | (1L << IF) | (1L << NULL) | (1L << BOOLEAN_TYPE) | (1L << INT_TYPE) | (1L << DOUBLE_TYPE) | (1L << STRING_TYPE) | (1L << ID))) != 0)) {
				{
				{
				setState(66);
				statement();
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public DefinitionContext definition() {
			return getRuleContext(DefinitionContext.class,0);
		}
		public Function_call_stmContext function_call_stm() {
			return getRuleContext(Function_call_stmContext.class,0);
		}
		public TerminalNode SEMICOL() { return getToken(NobleScriptParser.SEMICOL, 0); }
		public Assign_statementContext assign_statement() {
			return getRuleContext(Assign_statementContext.class,0);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NobleScriptVisitor ) return ((NobleScriptVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				compound_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				definition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(76);
				function_call_stm();
				setState(77);
				match(SEMICOL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(79);
				assign_statement();
				setState(80);
				match(SEMICOL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(82);
				return_statement();
				setState(83);
				match(SEMICOL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assign_statementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(NobleScriptParser.ID, 0); }
		public TerminalNode ASSIGN_OP() { return getToken(NobleScriptParser.ASSIGN_OP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode BRACKET_OPEN() { return getToken(NobleScriptParser.BRACKET_OPEN, 0); }
		public TerminalNode INT_LITERAL() { return getToken(NobleScriptParser.INT_LITERAL, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(NobleScriptParser.BRACKET_CLOSE, 0); }
		public Assign_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).enterAssign_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).exitAssign_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NobleScriptVisitor ) return ((NobleScriptVisitor<? extends T>)visitor).visitAssign_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_statementContext assign_statement() throws RecognitionException {
		Assign_statementContext _localctx = new Assign_statementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assign_statement);
		try {
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				match(ID);
				setState(88);
				match(ASSIGN_OP);
				setState(89);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				match(ID);
				setState(91);
				match(BRACKET_OPEN);
				setState(92);
				match(INT_LITERAL);
				setState(93);
				match(BRACKET_CLOSE);
				setState(94);
				match(ASSIGN_OP);
				setState(95);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_statementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(NobleScriptParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).enterReturn_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).exitReturn_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NobleScriptVisitor ) return ((NobleScriptVisitor<? extends T>)visitor).visitReturn_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_return_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(RETURN);
			setState(99);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefinitionContext extends ParserRuleContext {
		public Variable_definitionContext variable_definition() {
			return getRuleContext(Variable_definitionContext.class,0);
		}
		public TerminalNode SEMICOL() { return getToken(NobleScriptParser.SEMICOL, 0); }
		public Structure_definitionContext structure_definition() {
			return getRuleContext(Structure_definitionContext.class,0);
		}
		public Function_definitionContext function_definition() {
			return getRuleContext(Function_definitionContext.class,0);
		}
		public Array_definitionContext array_definition() {
			return getRuleContext(Array_definitionContext.class,0);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).enterDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).exitDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NobleScriptVisitor ) return ((NobleScriptVisitor<? extends T>)visitor).visitDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_definition);
		try {
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				variable_definition();
				setState(102);
				match(SEMICOL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				structure_definition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(105);
				function_definition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(106);
				array_definition();
				setState(107);
				match(SEMICOL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Structure_definitionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(NobleScriptParser.ID, 0); }
		public Block_openContext block_open() {
			return getRuleContext(Block_openContext.class,0);
		}
		public Block_closeContext block_close() {
			return getRuleContext(Block_closeContext.class,0);
		}
		public List<Variable_definitionContext> variable_definition() {
			return getRuleContexts(Variable_definitionContext.class);
		}
		public Variable_definitionContext variable_definition(int i) {
			return getRuleContext(Variable_definitionContext.class,i);
		}
		public List<TerminalNode> SEMICOL() { return getTokens(NobleScriptParser.SEMICOL); }
		public TerminalNode SEMICOL(int i) {
			return getToken(NobleScriptParser.SEMICOL, i);
		}
		public Structure_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structure_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).enterStructure_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).exitStructure_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NobleScriptVisitor ) return ((NobleScriptVisitor<? extends T>)visitor).visitStructure_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Structure_definitionContext structure_definition() throws RecognitionException {
		Structure_definitionContext _localctx = new Structure_definitionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_structure_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(T__0);
			setState(112);
			match(ID);
			setState(113);
			block_open();
			setState(117); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(114);
				variable_definition();
				setState(115);
				match(SEMICOL);
				}
				}
				setState(119); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NULL) | (1L << BOOLEAN_TYPE) | (1L << INT_TYPE) | (1L << DOUBLE_TYPE) | (1L << STRING_TYPE))) != 0) );
			setState(121);
			block_close();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_definitionContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(NobleScriptParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(NobleScriptParser.ID, i);
		}
		public TerminalNode PAR_OPEN() { return getToken(NobleScriptParser.PAR_OPEN, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(NobleScriptParser.PAR_CLOSE, 0); }
		public Block_openContext block_open() {
			return getRuleContext(Block_openContext.class,0);
		}
		public Block_closeContext block_close() {
			return getRuleContext(Block_closeContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Function_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).enterFunction_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).exitFunction_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NobleScriptVisitor ) return ((NobleScriptVisitor<? extends T>)visitor).visitFunction_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_definitionContext function_definition() throws RecognitionException {
		Function_definitionContext _localctx = new Function_definitionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_function_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			type();
			setState(124);
			match(ID);
			setState(125);
			match(PAR_OPEN);
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NULL) | (1L << BOOLEAN_TYPE) | (1L << INT_TYPE) | (1L << DOUBLE_TYPE) | (1L << STRING_TYPE))) != 0)) {
				{
				setState(126);
				type();
				setState(127);
				match(ID);
				}
			}

			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(131);
				match(T__1);
				setState(132);
				type();
				setState(133);
				match(ID);
				}
				}
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(140);
			match(PAR_CLOSE);
			setState(141);
			block_open();
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << READ_DOUBLE) | (1L << READ_INT) | (1L << RETURN) | (1L << WHILE) | (1L << IF) | (1L << NULL) | (1L << BOOLEAN_TYPE) | (1L << INT_TYPE) | (1L << DOUBLE_TYPE) | (1L << STRING_TYPE) | (1L << ID))) != 0)) {
				{
				{
				setState(142);
				statement();
				}
				}
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(148);
			block_close();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_definitionContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(NobleScriptParser.ID, 0); }
		public TerminalNode ASSIGN_OP() { return getToken(NobleScriptParser.ASSIGN_OP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Variable_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).enterVariable_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).exitVariable_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NobleScriptVisitor ) return ((NobleScriptVisitor<? extends T>)visitor).visitVariable_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_definitionContext variable_definition() throws RecognitionException {
		Variable_definitionContext _localctx = new Variable_definitionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variable_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			type();
			setState(151);
			match(ID);
			setState(152);
			match(ASSIGN_OP);
			setState(153);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_definitionContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(NobleScriptParser.ID, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(NobleScriptParser.BRACKET_OPEN, 0); }
		public TerminalNode INT_LITERAL() { return getToken(NobleScriptParser.INT_LITERAL, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(NobleScriptParser.BRACKET_CLOSE, 0); }
		public Array_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).enterArray_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).exitArray_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NobleScriptVisitor ) return ((NobleScriptVisitor<? extends T>)visitor).visitArray_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_definitionContext array_definition() throws RecognitionException {
		Array_definitionContext _localctx = new Array_definitionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_array_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			type();
			setState(156);
			match(ID);
			setState(157);
			match(BRACKET_OPEN);
			setState(158);
			match(INT_LITERAL);
			setState(159);
			match(BRACKET_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public Expression0Context expression0() {
			return getRuleContext(Expression0Context.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NobleScriptVisitor ) return ((NobleScriptVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			expression0(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expression0Context extends ParserRuleContext {
		public Expression1Context expression1() {
			return getRuleContext(Expression1Context.class,0);
		}
		public List<Expression0Context> expression0() {
			return getRuleContexts(Expression0Context.class);
		}
		public Expression0Context expression0(int i) {
			return getRuleContext(Expression0Context.class,i);
		}
		public Operator0Context operator0() {
			return getRuleContext(Operator0Context.class,0);
		}
		public Expression0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression0; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).enterExpression0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).exitExpression0(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NobleScriptVisitor ) return ((NobleScriptVisitor<? extends T>)visitor).visitExpression0(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression0Context expression0() throws RecognitionException {
		return expression0(0);
	}

	private Expression0Context expression0(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expression0Context _localctx = new Expression0Context(_ctx, _parentState);
		Expression0Context _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expression0, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(164);
			expression1(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(172);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expression0Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression0);
					setState(166);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(167);
					operator0();
					setState(168);
					expression0(2);
					}
					} 
				}
				setState(174);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Expression1Context extends ParserRuleContext {
		public Expression2Context expression2() {
			return getRuleContext(Expression2Context.class,0);
		}
		public List<Expression1Context> expression1() {
			return getRuleContexts(Expression1Context.class);
		}
		public Expression1Context expression1(int i) {
			return getRuleContext(Expression1Context.class,i);
		}
		public Operator1Context operator1() {
			return getRuleContext(Operator1Context.class,0);
		}
		public Expression1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).enterExpression1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).exitExpression1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NobleScriptVisitor ) return ((NobleScriptVisitor<? extends T>)visitor).visitExpression1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression1Context expression1() throws RecognitionException {
		return expression1(0);
	}

	private Expression1Context expression1(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expression1Context _localctx = new Expression1Context(_ctx, _parentState);
		Expression1Context _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expression1, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(176);
			expression2(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(184);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expression1Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression1);
					setState(178);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(179);
					operator1();
					setState(180);
					expression1(2);
					}
					} 
				}
				setState(186);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Expression2Context extends ParserRuleContext {
		public Expression3Context expression3() {
			return getRuleContext(Expression3Context.class,0);
		}
		public List<Expression2Context> expression2() {
			return getRuleContexts(Expression2Context.class);
		}
		public Expression2Context expression2(int i) {
			return getRuleContext(Expression2Context.class,i);
		}
		public Operator2Context operator2() {
			return getRuleContext(Operator2Context.class,0);
		}
		public Expression2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).enterExpression2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).exitExpression2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NobleScriptVisitor ) return ((NobleScriptVisitor<? extends T>)visitor).visitExpression2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression2Context expression2() throws RecognitionException {
		return expression2(0);
	}

	private Expression2Context expression2(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expression2Context _localctx = new Expression2Context(_ctx, _parentState);
		Expression2Context _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expression2, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(188);
			expression3();
			}
			_ctx.stop = _input.LT(-1);
			setState(196);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expression2Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression2);
					setState(190);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(191);
					operator2();
					setState(192);
					expression2(2);
					}
					} 
				}
				setState(198);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Expression3Context extends ParserRuleContext {
		public TerminalNode PAR_OPEN() { return getToken(NobleScriptParser.PAR_OPEN, 0); }
		public Expression0Context expression0() {
			return getRuleContext(Expression0Context.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(NobleScriptParser.PAR_CLOSE, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Expression3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).enterExpression3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).exitExpression3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NobleScriptVisitor ) return ((NobleScriptVisitor<? extends T>)visitor).visitExpression3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression3Context expression3() throws RecognitionException {
		Expression3Context _localctx = new Expression3Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_expression3);
		try {
			setState(204);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PAR_OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				match(PAR_OPEN);
				setState(200);
				expression0(0);
				setState(201);
				match(PAR_CLOSE);
				}
				break;
			case T__2:
			case READ_DOUBLE:
			case READ_INT:
			case NULL:
			case INT_LITERAL:
			case DOUBLE_LITERAL:
			case BOOLEAN_LITERAL:
			case STRING_LITERAL:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				value();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Function_call_stmContext function_call_stm() {
			return getRuleContext(Function_call_stmContext.class,0);
		}
		public TerminalNode ID() { return getToken(NobleScriptParser.ID, 0); }
		public Array_indexContext array_index() {
			return getRuleContext(Array_indexContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NobleScriptVisitor ) return ((NobleScriptVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_value);
		try {
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				function_call_stm();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(208);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(209);
				array_index();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_indexContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(NobleScriptParser.ID, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(NobleScriptParser.BRACKET_OPEN, 0); }
		public TerminalNode INT_LITERAL() { return getToken(NobleScriptParser.INT_LITERAL, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(NobleScriptParser.BRACKET_CLOSE, 0); }
		public Array_indexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).enterArray_index(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).exitArray_index(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NobleScriptVisitor ) return ((NobleScriptVisitor<? extends T>)visitor).visitArray_index(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_indexContext array_index() throws RecognitionException {
		Array_indexContext _localctx = new Array_indexContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_array_index);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(ID);
			setState(213);
			match(BRACKET_OPEN);
			setState(214);
			match(INT_LITERAL);
			setState(215);
			match(BRACKET_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_call_stmContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(NobleScriptParser.ID, 0); }
		public TerminalNode PAR_OPEN() { return getToken(NobleScriptParser.PAR_OPEN, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(NobleScriptParser.PAR_CLOSE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Read_opContext read_op() {
			return getRuleContext(Read_opContext.class,0);
		}
		public Print_stmContext print_stm() {
			return getRuleContext(Print_stmContext.class,0);
		}
		public Function_call_stmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_stm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).enterFunction_call_stm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).exitFunction_call_stm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NobleScriptVisitor ) return ((NobleScriptVisitor<? extends T>)visitor).visitFunction_call_stm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_call_stmContext function_call_stm() throws RecognitionException {
		Function_call_stmContext _localctx = new Function_call_stmContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_function_call_stm);
		int _la;
		try {
			setState(232);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				match(ID);
				setState(218);
				match(PAR_OPEN);
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << READ_DOUBLE) | (1L << READ_INT) | (1L << PAR_OPEN) | (1L << NULL) | (1L << INT_LITERAL) | (1L << DOUBLE_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << STRING_LITERAL) | (1L << ID))) != 0)) {
					{
					setState(219);
					expression();
					}
				}

				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(222);
					match(T__1);
					setState(223);
					expression();
					}
					}
					setState(228);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(229);
				match(PAR_CLOSE);
				}
				break;
			case READ_DOUBLE:
			case READ_INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				read_op();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(231);
				print_stm();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Print_stmContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(NobleScriptParser.PAR_CLOSE, 0); }
		public Print_stmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_stm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).enterPrint_stm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).exitPrint_stm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NobleScriptVisitor ) return ((NobleScriptVisitor<? extends T>)visitor).visitPrint_stm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_stmContext print_stm() throws RecognitionException {
		Print_stmContext _localctx = new Print_stmContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_print_stm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(T__2);
			setState(235);
			expression();
			setState(236);
			match(PAR_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public Primitive_literalContext primitive_literal() {
			return getRuleContext(Primitive_literalContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NobleScriptVisitor ) return ((NobleScriptVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			primitive_literal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Primitive_literalContext extends ParserRuleContext {
		public Primitive_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitive_literal; }
	 
		public Primitive_literalContext() { }
		public void copyFrom(Primitive_literalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BooleanContext extends Primitive_literalContext {
		public TerminalNode BOOLEAN_LITERAL() { return getToken(NobleScriptParser.BOOLEAN_LITERAL, 0); }
		public BooleanContext(Primitive_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).enterBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).exitBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NobleScriptVisitor ) return ((NobleScriptVisitor<? extends T>)visitor).visitBoolean(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringContext extends Primitive_literalContext {
		public TerminalNode STRING_LITERAL() { return getToken(NobleScriptParser.STRING_LITERAL, 0); }
		public StringContext(Primitive_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NobleScriptVisitor ) return ((NobleScriptVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NullContext extends Primitive_literalContext {
		public TerminalNode NULL() { return getToken(NobleScriptParser.NULL, 0); }
		public NullContext(Primitive_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).enterNull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).exitNull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NobleScriptVisitor ) return ((NobleScriptVisitor<? extends T>)visitor).visitNull(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleContext extends Primitive_literalContext {
		public TerminalNode DOUBLE_LITERAL() { return getToken(NobleScriptParser.DOUBLE_LITERAL, 0); }
		public DoubleContext(Primitive_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).enterDouble(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).exitDouble(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NobleScriptVisitor ) return ((NobleScriptVisitor<? extends T>)visitor).visitDouble(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends Primitive_literalContext {
		public TerminalNode INT_LITERAL() { return getToken(NobleScriptParser.INT_LITERAL, 0); }
		public IntContext(Primitive_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).exitInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NobleScriptVisitor ) return ((NobleScriptVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primitive_literalContext primitive_literal() throws RecognitionException {
		Primitive_literalContext _localctx = new Primitive_literalContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_primitive_literal);
		try {
			setState(245);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN_LITERAL:
				_localctx = new BooleanContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(240);
				match(BOOLEAN_LITERAL);
				}
				break;
			case INT_LITERAL:
				_localctx = new IntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(241);
				match(INT_LITERAL);
				}
				break;
			case DOUBLE_LITERAL:
				_localctx = new DoubleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(242);
				match(DOUBLE_LITERAL);
				}
				break;
			case STRING_LITERAL:
				_localctx = new StringContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(243);
				match(STRING_LITERAL);
				}
				break;
			case NULL:
				_localctx = new NullContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(244);
				match(NULL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public Primitive_typeContext primitive_type() {
			return getRuleContext(Primitive_typeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NobleScriptVisitor ) return ((NobleScriptVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			primitive_type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Primitive_typeContext extends ParserRuleContext {
		public TerminalNode BOOLEAN_TYPE() { return getToken(NobleScriptParser.BOOLEAN_TYPE, 0); }
		public TerminalNode INT_TYPE() { return getToken(NobleScriptParser.INT_TYPE, 0); }
		public TerminalNode DOUBLE_TYPE() { return getToken(NobleScriptParser.DOUBLE_TYPE, 0); }
		public TerminalNode STRING_TYPE() { return getToken(NobleScriptParser.STRING_TYPE, 0); }
		public TerminalNode NULL() { return getToken(NobleScriptParser.NULL, 0); }
		public Primitive_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitive_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).enterPrimitive_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).exitPrimitive_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NobleScriptVisitor ) return ((NobleScriptVisitor<? extends T>)visitor).visitPrimitive_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primitive_typeContext primitive_type() throws RecognitionException {
		Primitive_typeContext _localctx = new Primitive_typeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_primitive_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NULL) | (1L << BOOLEAN_TYPE) | (1L << INT_TYPE) | (1L << DOUBLE_TYPE) | (1L << STRING_TYPE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Operator2Context extends ParserRuleContext {
		public TerminalNode DIV_OP() { return getToken(NobleScriptParser.DIV_OP, 0); }
		public TerminalNode MUL_OP() { return getToken(NobleScriptParser.MUL_OP, 0); }
		public Operator2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).enterOperator2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).exitOperator2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NobleScriptVisitor ) return ((NobleScriptVisitor<? extends T>)visitor).visitOperator2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operator2Context operator2() throws RecognitionException {
		Operator2Context _localctx = new Operator2Context(_ctx, getState());
		enterRule(_localctx, 44, RULE_operator2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			_la = _input.LA(1);
			if ( !(_la==DIV_OP || _la==MUL_OP) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Operator1Context extends ParserRuleContext {
		public TerminalNode PLUS_OP() { return getToken(NobleScriptParser.PLUS_OP, 0); }
		public TerminalNode MINUS_OP() { return getToken(NobleScriptParser.MINUS_OP, 0); }
		public Operator1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).enterOperator1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).exitOperator1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NobleScriptVisitor ) return ((NobleScriptVisitor<? extends T>)visitor).visitOperator1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operator1Context operator1() throws RecognitionException {
		Operator1Context _localctx = new Operator1Context(_ctx, getState());
		enterRule(_localctx, 46, RULE_operator1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			_la = _input.LA(1);
			if ( !(_la==PLUS_OP || _la==MINUS_OP) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Operator0Context extends ParserRuleContext {
		public TerminalNode LESSER_THAN_OP() { return getToken(NobleScriptParser.LESSER_THAN_OP, 0); }
		public TerminalNode GREATER_THAN_OP() { return getToken(NobleScriptParser.GREATER_THAN_OP, 0); }
		public TerminalNode EQUAL_OP() { return getToken(NobleScriptParser.EQUAL_OP, 0); }
		public TerminalNode NOT_EQUAL_OP() { return getToken(NobleScriptParser.NOT_EQUAL_OP, 0); }
		public TerminalNode GREATER_THAN_OR_EQUAL_OP() { return getToken(NobleScriptParser.GREATER_THAN_OR_EQUAL_OP, 0); }
		public TerminalNode LESSER_THAN_OR_EQUAL_OP() { return getToken(NobleScriptParser.LESSER_THAN_OR_EQUAL_OP, 0); }
		public Operator0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator0; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).enterOperator0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).exitOperator0(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NobleScriptVisitor ) return ((NobleScriptVisitor<? extends T>)visitor).visitOperator0(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operator0Context operator0() throws RecognitionException {
		Operator0Context _localctx = new Operator0Context(_ctx, getState());
		enterRule(_localctx, 48, RULE_operator0);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESSER_THAN_OP) | (1L << LESSER_THAN_OR_EQUAL_OP) | (1L << GREATER_THAN_OP) | (1L << GREATER_THAN_OR_EQUAL_OP) | (1L << EQUAL_OP) | (1L << NOT_EQUAL_OP))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Compound_statementContext extends ParserRuleContext {
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Loop_statementContext loop_statement() {
			return getRuleContext(Loop_statementContext.class,0);
		}
		public Compound_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).enterCompound_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).exitCompound_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NobleScriptVisitor ) return ((NobleScriptVisitor<? extends T>)visitor).visitCompound_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compound_statementContext compound_statement() throws RecognitionException {
		Compound_statementContext _localctx = new Compound_statementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_compound_statement);
		try {
			setState(259);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				if_statement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				loop_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Loop_statementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(NobleScriptParser.WHILE, 0); }
		public TerminalNode PAR_OPEN() { return getToken(NobleScriptParser.PAR_OPEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(NobleScriptParser.PAR_CLOSE, 0); }
		public Block_openContext block_open() {
			return getRuleContext(Block_openContext.class,0);
		}
		public Block_closeContext block_close() {
			return getRuleContext(Block_closeContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Loop_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).enterLoop_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).exitLoop_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NobleScriptVisitor ) return ((NobleScriptVisitor<? extends T>)visitor).visitLoop_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Loop_statementContext loop_statement() throws RecognitionException {
		Loop_statementContext _localctx = new Loop_statementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_loop_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(WHILE);
			setState(262);
			match(PAR_OPEN);
			setState(263);
			expression();
			setState(264);
			match(PAR_CLOSE);
			setState(265);
			block_open();
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << READ_DOUBLE) | (1L << READ_INT) | (1L << RETURN) | (1L << WHILE) | (1L << IF) | (1L << NULL) | (1L << BOOLEAN_TYPE) | (1L << INT_TYPE) | (1L << DOUBLE_TYPE) | (1L << STRING_TYPE) | (1L << ID))) != 0)) {
				{
				{
				setState(266);
				statement();
				}
				}
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(272);
			block_close();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(NobleScriptParser.IF, 0); }
		public TerminalNode PAR_OPEN() { return getToken(NobleScriptParser.PAR_OPEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(NobleScriptParser.PAR_CLOSE, 0); }
		public Block_openContext block_open() {
			return getRuleContext(Block_openContext.class,0);
		}
		public Block_closeContext block_close() {
			return getRuleContext(Block_closeContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<Elif_statementContext> elif_statement() {
			return getRuleContexts(Elif_statementContext.class);
		}
		public Elif_statementContext elif_statement(int i) {
			return getRuleContext(Elif_statementContext.class,i);
		}
		public Else_statementContext else_statement() {
			return getRuleContext(Else_statementContext.class,0);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NobleScriptVisitor ) return ((NobleScriptVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(IF);
			setState(275);
			match(PAR_OPEN);
			setState(276);
			expression();
			setState(277);
			match(PAR_CLOSE);
			setState(278);
			block_open();
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << READ_DOUBLE) | (1L << READ_INT) | (1L << RETURN) | (1L << WHILE) | (1L << IF) | (1L << NULL) | (1L << BOOLEAN_TYPE) | (1L << INT_TYPE) | (1L << DOUBLE_TYPE) | (1L << STRING_TYPE) | (1L << ID))) != 0)) {
				{
				{
				setState(279);
				statement();
				}
				}
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(285);
			block_close();
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(286);
				elif_statement();
				}
				}
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(292);
				else_statement();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Elif_statementContext extends ParserRuleContext {
		public TerminalNode ELIF() { return getToken(NobleScriptParser.ELIF, 0); }
		public TerminalNode PAR_OPEN() { return getToken(NobleScriptParser.PAR_OPEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(NobleScriptParser.PAR_CLOSE, 0); }
		public Block_openContext block_open() {
			return getRuleContext(Block_openContext.class,0);
		}
		public Block_closeContext block_close() {
			return getRuleContext(Block_closeContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Elif_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elif_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).enterElif_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).exitElif_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NobleScriptVisitor ) return ((NobleScriptVisitor<? extends T>)visitor).visitElif_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Elif_statementContext elif_statement() throws RecognitionException {
		Elif_statementContext _localctx = new Elif_statementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_elif_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(ELIF);
			setState(296);
			match(PAR_OPEN);
			setState(297);
			expression();
			setState(298);
			match(PAR_CLOSE);
			setState(299);
			block_open();
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << READ_DOUBLE) | (1L << READ_INT) | (1L << RETURN) | (1L << WHILE) | (1L << IF) | (1L << NULL) | (1L << BOOLEAN_TYPE) | (1L << INT_TYPE) | (1L << DOUBLE_TYPE) | (1L << STRING_TYPE) | (1L << ID))) != 0)) {
				{
				{
				setState(300);
				statement();
				}
				}
				setState(305);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(306);
			block_close();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Else_statementContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(NobleScriptParser.ELSE, 0); }
		public Block_openContext block_open() {
			return getRuleContext(Block_openContext.class,0);
		}
		public Block_closeContext block_close() {
			return getRuleContext(Block_closeContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Else_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).enterElse_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).exitElse_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NobleScriptVisitor ) return ((NobleScriptVisitor<? extends T>)visitor).visitElse_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_statementContext else_statement() throws RecognitionException {
		Else_statementContext _localctx = new Else_statementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_else_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(ELSE);
			setState(309);
			block_open();
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << READ_DOUBLE) | (1L << READ_INT) | (1L << RETURN) | (1L << WHILE) | (1L << IF) | (1L << NULL) | (1L << BOOLEAN_TYPE) | (1L << INT_TYPE) | (1L << DOUBLE_TYPE) | (1L << STRING_TYPE) | (1L << ID))) != 0)) {
				{
				{
				setState(310);
				statement();
				}
				}
				setState(315);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(316);
			block_close();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Block_openContext extends ParserRuleContext {
		public TerminalNode BRACES_OPEN() { return getToken(NobleScriptParser.BRACES_OPEN, 0); }
		public Block_openContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_open; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).enterBlock_open(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).exitBlock_open(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NobleScriptVisitor ) return ((NobleScriptVisitor<? extends T>)visitor).visitBlock_open(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_openContext block_open() throws RecognitionException {
		Block_openContext _localctx = new Block_openContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_block_open);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(BRACES_OPEN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Block_closeContext extends ParserRuleContext {
		public TerminalNode BRACES_CLOSE() { return getToken(NobleScriptParser.BRACES_CLOSE, 0); }
		public Block_closeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_close; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).enterBlock_close(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).exitBlock_close(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NobleScriptVisitor ) return ((NobleScriptVisitor<? extends T>)visitor).visitBlock_close(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_closeContext block_close() throws RecognitionException {
		Block_closeContext _localctx = new Block_closeContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_block_close);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			match(BRACES_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Read_opContext extends ParserRuleContext {
		public TerminalNode READ_INT() { return getToken(NobleScriptParser.READ_INT, 0); }
		public TerminalNode READ_DOUBLE() { return getToken(NobleScriptParser.READ_DOUBLE, 0); }
		public Read_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).enterRead_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NobleScriptListener ) ((NobleScriptListener)listener).exitRead_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NobleScriptVisitor ) return ((NobleScriptVisitor<? extends T>)visitor).visitRead_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Read_opContext read_op() throws RecognitionException {
		Read_opContext _localctx = new Read_opContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_read_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			_la = _input.LA(1);
			if ( !(_la==READ_DOUBLE || _la==READ_INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return expression0_sempred((Expression0Context)_localctx, predIndex);
		case 11:
			return expression1_sempred((Expression1Context)_localctx, predIndex);
		case 12:
			return expression2_sempred((Expression2Context)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression0_sempred(Expression0Context _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression1_sempred(Expression1Context _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression2_sempred(Expression2Context _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u0147\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\7\2F\n\2\f\2\16\2I\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\5\3X\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5"+
		"\4c\n\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6p\n\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\6\7x\n\7\r\7\16\7y\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b"+
		"\u0084\n\b\3\b\3\b\3\b\3\b\7\b\u008a\n\b\f\b\16\b\u008d\13\b\3\b\3\b\3"+
		"\b\7\b\u0092\n\b\f\b\16\b\u0095\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00ad\n\f"+
		"\f\f\16\f\u00b0\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00b9\n\r\f\r\16"+
		"\r\u00bc\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00c5\n\16\f\16"+
		"\16\16\u00c8\13\16\3\17\3\17\3\17\3\17\3\17\5\17\u00cf\n\17\3\20\3\20"+
		"\3\20\3\20\5\20\u00d5\n\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\5\22"+
		"\u00df\n\22\3\22\3\22\7\22\u00e3\n\22\f\22\16\22\u00e6\13\22\3\22\3\22"+
		"\3\22\5\22\u00eb\n\22\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\25\5\25\u00f8\n\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32"+
		"\3\33\3\33\5\33\u0106\n\33\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u010e\n"+
		"\34\f\34\16\34\u0111\13\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\7\35"+
		"\u011b\n\35\f\35\16\35\u011e\13\35\3\35\3\35\7\35\u0122\n\35\f\35\16\35"+
		"\u0125\13\35\3\35\5\35\u0128\n\35\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u0130"+
		"\n\36\f\36\16\36\u0133\13\36\3\36\3\36\3\37\3\37\3\37\7\37\u013a\n\37"+
		"\f\37\16\37\u013d\13\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\2\5\26\30\32"+
		"#\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@B\2"+
		"\7\4\2\23\23\30\33\3\2()\3\2%&\3\2\37$\3\2\6\7\2\u0148\2G\3\2\2\2\4W\3"+
		"\2\2\2\6b\3\2\2\2\bd\3\2\2\2\no\3\2\2\2\fq\3\2\2\2\16}\3\2\2\2\20\u0098"+
		"\3\2\2\2\22\u009d\3\2\2\2\24\u00a3\3\2\2\2\26\u00a5\3\2\2\2\30\u00b1\3"+
		"\2\2\2\32\u00bd\3\2\2\2\34\u00ce\3\2\2\2\36\u00d4\3\2\2\2 \u00d6\3\2\2"+
		"\2\"\u00ea\3\2\2\2$\u00ec\3\2\2\2&\u00f0\3\2\2\2(\u00f7\3\2\2\2*\u00f9"+
		"\3\2\2\2,\u00fb\3\2\2\2.\u00fd\3\2\2\2\60\u00ff\3\2\2\2\62\u0101\3\2\2"+
		"\2\64\u0105\3\2\2\2\66\u0107\3\2\2\28\u0114\3\2\2\2:\u0129\3\2\2\2<\u0136"+
		"\3\2\2\2>\u0140\3\2\2\2@\u0142\3\2\2\2B\u0144\3\2\2\2DF\5\4\3\2ED\3\2"+
		"\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HJ\3\2\2\2IG\3\2\2\2JK\7\2\2\3K\3\3"+
		"\2\2\2LX\5\64\33\2MX\5\n\6\2NO\5\"\22\2OP\7\35\2\2PX\3\2\2\2QR\5\6\4\2"+
		"RS\7\35\2\2SX\3\2\2\2TU\5\b\5\2UV\7\35\2\2VX\3\2\2\2WL\3\2\2\2WM\3\2\2"+
		"\2WN\3\2\2\2WQ\3\2\2\2WT\3\2\2\2X\5\3\2\2\2YZ\7\34\2\2Z[\7\36\2\2[c\5"+
		"\24\13\2\\]\7\34\2\2]^\7\21\2\2^_\7\24\2\2_`\7\22\2\2`a\7\36\2\2ac\5\24"+
		"\13\2bY\3\2\2\2b\\\3\2\2\2c\7\3\2\2\2de\7\b\2\2ef\5\24\13\2f\t\3\2\2\2"+
		"gh\5\20\t\2hi\7\35\2\2ip\3\2\2\2jp\5\f\7\2kp\5\16\b\2lm\5\22\n\2mn\7\35"+
		"\2\2np\3\2\2\2og\3\2\2\2oj\3\2\2\2ok\3\2\2\2ol\3\2\2\2p\13\3\2\2\2qr\7"+
		"\3\2\2rs\7\34\2\2sw\5> \2tu\5\20\t\2uv\7\35\2\2vx\3\2\2\2wt\3\2\2\2xy"+
		"\3\2\2\2yw\3\2\2\2yz\3\2\2\2z{\3\2\2\2{|\5@!\2|\r\3\2\2\2}~\5*\26\2~\177"+
		"\7\34\2\2\177\u0083\7\r\2\2\u0080\u0081\5*\26\2\u0081\u0082\7\34\2\2\u0082"+
		"\u0084\3\2\2\2\u0083\u0080\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u008b\3\2"+
		"\2\2\u0085\u0086\7\4\2\2\u0086\u0087\5*\26\2\u0087\u0088\7\34\2\2\u0088"+
		"\u008a\3\2\2\2\u0089\u0085\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2"+
		"\2\2\u008b\u008c\3\2\2\2\u008c\u008e\3\2\2\2\u008d\u008b\3\2\2\2\u008e"+
		"\u008f\7\16\2\2\u008f\u0093\5> \2\u0090\u0092\5\4\3\2\u0091\u0090\3\2"+
		"\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094"+
		"\u0096\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0097\5@!\2\u0097\17\3\2\2\2"+
		"\u0098\u0099\5*\26\2\u0099\u009a\7\34\2\2\u009a\u009b\7\36\2\2\u009b\u009c"+
		"\5\24\13\2\u009c\21\3\2\2\2\u009d\u009e\5*\26\2\u009e\u009f\7\34\2\2\u009f"+
		"\u00a0\7\21\2\2\u00a0\u00a1\7\24\2\2\u00a1\u00a2\7\22\2\2\u00a2\23\3\2"+
		"\2\2\u00a3\u00a4\5\26\f\2\u00a4\25\3\2\2\2\u00a5\u00a6\b\f\1\2\u00a6\u00a7"+
		"\5\30\r\2\u00a7\u00ae\3\2\2\2\u00a8\u00a9\f\3\2\2\u00a9\u00aa\5\62\32"+
		"\2\u00aa\u00ab\5\26\f\4\u00ab\u00ad\3\2\2\2\u00ac\u00a8\3\2\2\2\u00ad"+
		"\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\27\3\2\2"+
		"\2\u00b0\u00ae\3\2\2\2\u00b1\u00b2\b\r\1\2\u00b2\u00b3\5\32\16\2\u00b3"+
		"\u00ba\3\2\2\2\u00b4\u00b5\f\3\2\2\u00b5\u00b6\5\60\31\2\u00b6\u00b7\5"+
		"\30\r\4\u00b7\u00b9\3\2\2\2\u00b8\u00b4\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba"+
		"\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\31\3\2\2\2\u00bc\u00ba\3\2\2"+
		"\2\u00bd\u00be\b\16\1\2\u00be\u00bf\5\34\17\2\u00bf\u00c6\3\2\2\2\u00c0"+
		"\u00c1\f\3\2\2\u00c1\u00c2\5.\30\2\u00c2\u00c3\5\32\16\4\u00c3\u00c5\3"+
		"\2\2\2\u00c4\u00c0\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6"+
		"\u00c7\3\2\2\2\u00c7\33\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00ca\7\r\2"+
		"\2\u00ca\u00cb\5\26\f\2\u00cb\u00cc\7\16\2\2\u00cc\u00cf\3\2\2\2\u00cd"+
		"\u00cf\5\36\20\2\u00ce\u00c9\3\2\2\2\u00ce\u00cd\3\2\2\2\u00cf\35\3\2"+
		"\2\2\u00d0\u00d5\5&\24\2\u00d1\u00d5\5\"\22\2\u00d2\u00d5\7\34\2\2\u00d3"+
		"\u00d5\5 \21\2\u00d4\u00d0\3\2\2\2\u00d4\u00d1\3\2\2\2\u00d4\u00d2\3\2"+
		"\2\2\u00d4\u00d3\3\2\2\2\u00d5\37\3\2\2\2\u00d6\u00d7\7\34\2\2\u00d7\u00d8"+
		"\7\21\2\2\u00d8\u00d9\7\24\2\2\u00d9\u00da\7\22\2\2\u00da!\3\2\2\2\u00db"+
		"\u00dc\7\34\2\2\u00dc\u00de\7\r\2\2\u00dd\u00df\5\24\13\2\u00de\u00dd"+
		"\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e4\3\2\2\2\u00e0\u00e1\7\4\2\2\u00e1"+
		"\u00e3\5\24\13\2\u00e2\u00e0\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3"+
		"\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e7\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7"+
		"\u00eb\7\16\2\2\u00e8\u00eb\5B\"\2\u00e9\u00eb\5$\23\2\u00ea\u00db\3\2"+
		"\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00e9\3\2\2\2\u00eb#\3\2\2\2\u00ec\u00ed"+
		"\7\5\2\2\u00ed\u00ee\5\24\13\2\u00ee\u00ef\7\16\2\2\u00ef%\3\2\2\2\u00f0"+
		"\u00f1\5(\25\2\u00f1\'\3\2\2\2\u00f2\u00f8\7\26\2\2\u00f3\u00f8\7\24\2"+
		"\2\u00f4\u00f8\7\25\2\2\u00f5\u00f8\7\27\2\2\u00f6\u00f8\7\23\2\2\u00f7"+
		"\u00f2\3\2\2\2\u00f7\u00f3\3\2\2\2\u00f7\u00f4\3\2\2\2\u00f7\u00f5\3\2"+
		"\2\2\u00f7\u00f6\3\2\2\2\u00f8)\3\2\2\2\u00f9\u00fa\5,\27\2\u00fa+\3\2"+
		"\2\2\u00fb\u00fc\t\2\2\2\u00fc-\3\2\2\2\u00fd\u00fe\t\3\2\2\u00fe/\3\2"+
		"\2\2\u00ff\u0100\t\4\2\2\u0100\61\3\2\2\2\u0101\u0102\t\5\2\2\u0102\63"+
		"\3\2\2\2\u0103\u0106\58\35\2\u0104\u0106\5\66\34\2\u0105\u0103\3\2\2\2"+
		"\u0105\u0104\3\2\2\2\u0106\65\3\2\2\2\u0107\u0108\7\t\2\2\u0108\u0109"+
		"\7\r\2\2\u0109\u010a\5\24\13\2\u010a\u010b\7\16\2\2\u010b\u010f\5> \2"+
		"\u010c\u010e\5\4\3\2\u010d\u010c\3\2\2\2\u010e\u0111\3\2\2\2\u010f\u010d"+
		"\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0112\3\2\2\2\u0111\u010f\3\2\2\2\u0112"+
		"\u0113\5@!\2\u0113\67\3\2\2\2\u0114\u0115\7\n\2\2\u0115\u0116\7\r\2\2"+
		"\u0116\u0117\5\24\13\2\u0117\u0118\7\16\2\2\u0118\u011c\5> \2\u0119\u011b"+
		"\5\4\3\2\u011a\u0119\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011c"+
		"\u011d\3\2\2\2\u011d\u011f\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u0123\5@"+
		"!\2\u0120\u0122\5:\36\2\u0121\u0120\3\2\2\2\u0122\u0125\3\2\2\2\u0123"+
		"\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0127\3\2\2\2\u0125\u0123\3\2"+
		"\2\2\u0126\u0128\5<\37\2\u0127\u0126\3\2\2\2\u0127\u0128\3\2\2\2\u0128"+
		"9\3\2\2\2\u0129\u012a\7\13\2\2\u012a\u012b\7\r\2\2\u012b\u012c\5\24\13"+
		"\2\u012c\u012d\7\16\2\2\u012d\u0131\5> \2\u012e\u0130\5\4\3\2\u012f\u012e"+
		"\3\2\2\2\u0130\u0133\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132"+
		"\u0134\3\2\2\2\u0133\u0131\3\2\2\2\u0134\u0135\5@!\2\u0135;\3\2\2\2\u0136"+
		"\u0137\7\f\2\2\u0137\u013b\5> \2\u0138\u013a\5\4\3\2\u0139\u0138\3\2\2"+
		"\2\u013a\u013d\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013e"+
		"\3\2\2\2\u013d\u013b\3\2\2\2\u013e\u013f\5@!\2\u013f=\3\2\2\2\u0140\u0141"+
		"\7\17\2\2\u0141?\3\2\2\2\u0142\u0143\7\20\2\2\u0143A\3\2\2\2\u0144\u0145"+
		"\t\6\2\2\u0145C\3\2\2\2\32GWboy\u0083\u008b\u0093\u00ae\u00ba\u00c6\u00ce"+
		"\u00d4\u00de\u00e4\u00ea\u00f7\u0105\u010f\u011c\u0123\u0127\u0131\u013b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}