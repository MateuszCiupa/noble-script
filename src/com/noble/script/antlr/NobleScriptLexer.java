package com.noble.script.antlr;// Generated from C:/Users/Danie/Desktop/NobleScript/resources\NobleScript.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class NobleScriptLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, READ=5, RETURN=6, WHILE=7, IF=8, ELIF=9, 
		ELSE=10, PAR_OPEN=11, PAR_CLOSE=12, BRACES_OPEN=13, BRACES_CLOSE=14, BRACKET_OPEN=15, 
		BRAKCET_CLOSE=16, NULL=17, INT_LITERAL=18, DOUBLE_LITERAL=19, BOOLEAN_LITERAL=20, 
		STRING_LITERAL=21, ARRAY_SIZE_LITERAL=22, BOOLEAN_TYPE=23, INT_TYPE=24, 
		DOUBLE_TYPE=25, STRING_TYPE=26, ID=27, SEMICOL=28, ASSIGN_OP=29, LESSER_THAN_OP=30, 
		GREATER_THAN_OP=31, EQUAL_OP=32, NOT_EQUAL_OP=33, PLUS_OP=34, MINUS_OP=35, 
		POW_OP=36, DIV_OP=37, MUL_OP=38, WHITESPACE=39, NEWLINE=40;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "READ", "RETURN", "WHILE", "IF", "ELIF", 
			"ELSE", "PAR_OPEN", "PAR_CLOSE", "BRACES_OPEN", "BRACES_CLOSE", "BRACKET_OPEN", 
			"BRAKCET_CLOSE", "NULL", "INT_LITERAL", "DOUBLE_LITERAL", "BOOLEAN_LITERAL", 
			"STRING_LITERAL", "ARRAY_SIZE_LITERAL", "BOOLEAN_TYPE", "INT_TYPE", "DOUBLE_TYPE", 
			"STRING_TYPE", "ID", "SEMICOL", "ASSIGN_OP", "LESSER_THAN_OP", "GREATER_THAN_OP", 
			"EQUAL_OP", "NOT_EQUAL_OP", "PLUS_OP", "MINUS_OP", "POW_OP", "DIV_OP", 
			"MUL_OP", "WHITESPACE", "NEWLINE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'struct'", "','", "'print ('", "'[]'", "'read()'", "'return'", 
			"'while'", "'if'", "'elif'", "'else'", "'('", "')'", "'{'", "'}'", "'['", 
			"']'", "'null'", null, null, null, null, null, "'boolean'", "'int'", 
			"'double'", "'string'", null, "';'", "'='", "'<'", "'>'", "'=='", "'!='", 
			"'+'", "'-'", "'^'", "'/'", "'*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "READ", "RETURN", "WHILE", "IF", "ELIF", 
			"ELSE", "PAR_OPEN", "PAR_CLOSE", "BRACES_OPEN", "BRACES_CLOSE", "BRACKET_OPEN", 
			"BRAKCET_CLOSE", "NULL", "INT_LITERAL", "DOUBLE_LITERAL", "BOOLEAN_LITERAL", 
			"STRING_LITERAL", "ARRAY_SIZE_LITERAL", "BOOLEAN_TYPE", "INT_TYPE", "DOUBLE_TYPE", 
			"STRING_TYPE", "ID", "SEMICOL", "ASSIGN_OP", "LESSER_THAN_OP", "GREATER_THAN_OP", 
			"EQUAL_OP", "NOT_EQUAL_OP", "PLUS_OP", "MINUS_OP", "POW_OP", "DIV_OP", 
			"MUL_OP", "WHITESPACE", "NEWLINE"
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


	public NobleScriptLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "NobleScript.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2*\u011e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\5\23\u009b\n\23\3\23\6\23\u009e\n\23\r\23\16\23\u009f\3\23"+
		"\7\23\u00a3\n\23\f\23\16\23\u00a6\13\23\3\24\5\24\u00a9\n\24\3\24\6\24"+
		"\u00ac\n\24\r\24\16\24\u00ad\3\24\7\24\u00b1\n\24\f\24\16\24\u00b4\13"+
		"\24\3\24\3\24\6\24\u00b8\n\24\r\24\16\24\u00b9\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\5\25\u00c5\n\25\3\26\3\26\7\26\u00c9\n\26\f\26\16"+
		"\26\u00cc\13\26\3\26\3\26\3\27\3\27\6\27\u00d2\n\27\r\27\16\27\u00d3\3"+
		"\27\7\27\u00d7\n\27\f\27\16\27\u00da\13\27\3\27\3\27\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\7\34\u00fa\n\34"+
		"\f\34\16\34\u00fd\13\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\3"+
		"\"\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3(\3(\3)\3)\3)\3)\2\2"+
		"*\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"= ?!A\"C#E$G%I&K\'M(O)Q*\3\2\t\3\2\63;\3\2\62;\4\2$$``\4\2C\\c|\7\2//"+
		"\62;C\\aac|\4\2\13\13\"\"\4\2\f\f\17\17\2\u0129\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\3S\3\2\2\2\5Z\3\2\2\2\7\\\3\2\2\2"+
		"\td\3\2\2\2\13g\3\2\2\2\rn\3\2\2\2\17u\3\2\2\2\21{\3\2\2\2\23~\3\2\2\2"+
		"\25\u0083\3\2\2\2\27\u0088\3\2\2\2\31\u008a\3\2\2\2\33\u008c\3\2\2\2\35"+
		"\u008e\3\2\2\2\37\u0090\3\2\2\2!\u0092\3\2\2\2#\u0094\3\2\2\2%\u009a\3"+
		"\2\2\2\'\u00a8\3\2\2\2)\u00c4\3\2\2\2+\u00c6\3\2\2\2-\u00cf\3\2\2\2/\u00dd"+
		"\3\2\2\2\61\u00e5\3\2\2\2\63\u00e9\3\2\2\2\65\u00f0\3\2\2\2\67\u00f7\3"+
		"\2\2\29\u00fe\3\2\2\2;\u0100\3\2\2\2=\u0102\3\2\2\2?\u0104\3\2\2\2A\u0106"+
		"\3\2\2\2C\u0109\3\2\2\2E\u010c\3\2\2\2G\u010e\3\2\2\2I\u0110\3\2\2\2K"+
		"\u0112\3\2\2\2M\u0114\3\2\2\2O\u0116\3\2\2\2Q\u011a\3\2\2\2ST\7u\2\2T"+
		"U\7v\2\2UV\7t\2\2VW\7w\2\2WX\7e\2\2XY\7v\2\2Y\4\3\2\2\2Z[\7.\2\2[\6\3"+
		"\2\2\2\\]\7r\2\2]^\7t\2\2^_\7k\2\2_`\7p\2\2`a\7v\2\2ab\7\"\2\2bc\7*\2"+
		"\2c\b\3\2\2\2de\7]\2\2ef\7_\2\2f\n\3\2\2\2gh\7t\2\2hi\7g\2\2ij\7c\2\2"+
		"jk\7f\2\2kl\7*\2\2lm\7+\2\2m\f\3\2\2\2no\7t\2\2op\7g\2\2pq\7v\2\2qr\7"+
		"w\2\2rs\7t\2\2st\7p\2\2t\16\3\2\2\2uv\7y\2\2vw\7j\2\2wx\7k\2\2xy\7n\2"+
		"\2yz\7g\2\2z\20\3\2\2\2{|\7k\2\2|}\7h\2\2}\22\3\2\2\2~\177\7g\2\2\177"+
		"\u0080\7n\2\2\u0080\u0081\7k\2\2\u0081\u0082\7h\2\2\u0082\24\3\2\2\2\u0083"+
		"\u0084\7g\2\2\u0084\u0085\7n\2\2\u0085\u0086\7u\2\2\u0086\u0087\7g\2\2"+
		"\u0087\26\3\2\2\2\u0088\u0089\7*\2\2\u0089\30\3\2\2\2\u008a\u008b\7+\2"+
		"\2\u008b\32\3\2\2\2\u008c\u008d\7}\2\2\u008d\34\3\2\2\2\u008e\u008f\7"+
		"\177\2\2\u008f\36\3\2\2\2\u0090\u0091\7]\2\2\u0091 \3\2\2\2\u0092\u0093"+
		"\7_\2\2\u0093\"\3\2\2\2\u0094\u0095\7p\2\2\u0095\u0096\7w\2\2\u0096\u0097"+
		"\7n\2\2\u0097\u0098\7n\2\2\u0098$\3\2\2\2\u0099\u009b\7/\2\2\u009a\u0099"+
		"\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009d\3\2\2\2\u009c\u009e\t\2\2\2\u009d"+
		"\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2"+
		"\2\2\u00a0\u00a4\3\2\2\2\u00a1\u00a3\t\3\2\2\u00a2\u00a1\3\2\2\2\u00a3"+
		"\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5&\3\2\2\2"+
		"\u00a6\u00a4\3\2\2\2\u00a7\u00a9\7/\2\2\u00a8\u00a7\3\2\2\2\u00a8\u00a9"+
		"\3\2\2\2\u00a9\u00ab\3\2\2\2\u00aa\u00ac\t\2\2\2\u00ab\u00aa\3\2\2\2\u00ac"+
		"\u00ad\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b2\3\2"+
		"\2\2\u00af\u00b1\t\3\2\2\u00b0\u00af\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2"+
		"\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b5\3\2\2\2\u00b4\u00b2\3\2"+
		"\2\2\u00b5\u00b7\7\60\2\2\u00b6\u00b8\t\3\2\2\u00b7\u00b6\3\2\2\2\u00b8"+
		"\u00b9\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba(\3\2\2\2"+
		"\u00bb\u00bc\7v\2\2\u00bc\u00bd\7t\2\2\u00bd\u00be\7w\2\2\u00be\u00c5"+
		"\7g\2\2\u00bf\u00c0\7h\2\2\u00c0\u00c1\7c\2\2\u00c1\u00c2\7n\2\2\u00c2"+
		"\u00c3\7u\2\2\u00c3\u00c5\7g\2\2\u00c4\u00bb\3\2\2\2\u00c4\u00bf\3\2\2"+
		"\2\u00c5*\3\2\2\2\u00c6\u00ca\7$\2\2\u00c7\u00c9\t\4\2\2\u00c8\u00c7\3"+
		"\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb"+
		"\u00cd\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00ce\7$\2\2\u00ce,\3\2\2\2\u00cf"+
		"\u00d1\7]\2\2\u00d0\u00d2\t\2\2\2\u00d1\u00d0\3\2\2\2\u00d2\u00d3\3\2"+
		"\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d8\3\2\2\2\u00d5"+
		"\u00d7\t\3\2\2\u00d6\u00d5\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2"+
		"\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00db\3\2\2\2\u00da\u00d8\3\2\2\2\u00db"+
		"\u00dc\7_\2\2\u00dc.\3\2\2\2\u00dd\u00de\7d\2\2\u00de\u00df\7q\2\2\u00df"+
		"\u00e0\7q\2\2\u00e0\u00e1\7n\2\2\u00e1\u00e2\7g\2\2\u00e2\u00e3\7c\2\2"+
		"\u00e3\u00e4\7p\2\2\u00e4\60\3\2\2\2\u00e5\u00e6\7k\2\2\u00e6\u00e7\7"+
		"p\2\2\u00e7\u00e8\7v\2\2\u00e8\62\3\2\2\2\u00e9\u00ea\7f\2\2\u00ea\u00eb"+
		"\7q\2\2\u00eb\u00ec\7w\2\2\u00ec\u00ed\7d\2\2\u00ed\u00ee\7n\2\2\u00ee"+
		"\u00ef\7g\2\2\u00ef\64\3\2\2\2\u00f0\u00f1\7u\2\2\u00f1\u00f2\7v\2\2\u00f2"+
		"\u00f3\7t\2\2\u00f3\u00f4\7k\2\2\u00f4\u00f5\7p\2\2\u00f5\u00f6\7i\2\2"+
		"\u00f6\66\3\2\2\2\u00f7\u00fb\t\5\2\2\u00f8\u00fa\t\6\2\2\u00f9\u00f8"+
		"\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc"+
		"8\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe\u00ff\7=\2\2\u00ff:\3\2\2\2\u0100"+
		"\u0101\7?\2\2\u0101<\3\2\2\2\u0102\u0103\7>\2\2\u0103>\3\2\2\2\u0104\u0105"+
		"\7@\2\2\u0105@\3\2\2\2\u0106\u0107\7?\2\2\u0107\u0108\7?\2\2\u0108B\3"+
		"\2\2\2\u0109\u010a\7#\2\2\u010a\u010b\7?\2\2\u010bD\3\2\2\2\u010c\u010d"+
		"\7-\2\2\u010dF\3\2\2\2\u010e\u010f\7/\2\2\u010fH\3\2\2\2\u0110\u0111\7"+
		"`\2\2\u0111J\3\2\2\2\u0112\u0113\7\61\2\2\u0113L\3\2\2\2\u0114\u0115\7"+
		",\2\2\u0115N\3\2\2\2\u0116\u0117\t\7\2\2\u0117\u0118\3\2\2\2\u0118\u0119"+
		"\b(\2\2\u0119P\3\2\2\2\u011a\u011b\t\b\2\2\u011b\u011c\3\2\2\2\u011c\u011d"+
		"\b)\2\2\u011dR\3\2\2\2\17\2\u009a\u009f\u00a4\u00a8\u00ad\u00b2\u00b9"+
		"\u00c4\u00ca\u00d3\u00d8\u00fb\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}