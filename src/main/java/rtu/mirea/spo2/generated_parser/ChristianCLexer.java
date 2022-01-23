package rtu.mirea.spo2.generated_parser;// Generated from ChristianC.g4 by ANTLR 4.7.1

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ChristianCLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, WS=2, VAR_TYPE=3, IF_KW=4, ELSE_KW=5, WHILE_KW=6, DO_KW=7, PRINT_KW=8, 
		L_BR=9, R_BR=10, L_S_BR=11, R_S_BR=12, SEP=13, ASSIGN_OP=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "WS", "VAR_TYPE", "IF_KW", "ELSE_KW", "WHILE_KW", "DO_KW", "PRINT_KW", 
		"NON_ZERO_NUMBER", "L_BR", "R_BR", "L_S_BR", "R_S_BR", "SEP", "ASSIGN_OP", 
		"LOGICAL_OP", "OP", "LETTER", "LETTER_OR_DIGIT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'0'", null, null, "'\u0430\u043A\u043E'", "'\u0438\u043D\u0430\u043A\u043E'", 
		"'\u043F\u043E\u043A\u0430\u043C\u0435\u0441\u0442\u044A'", "'\u0434\u0435\u043B\u0430\u0442\u0438'", 
		"'\u0438\u0437\u044A\u044F\u0432\u0438\u0442\u0438'", "'('", "')'", "'{'", 
		"'}'", "';'", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "WS", "VAR_TYPE", "IF_KW", "ELSE_KW", "WHILE_KW", "DO_KW", 
		"PRINT_KW", "L_BR", "R_BR", "L_S_BR", "R_S_BR", "SEP", "ASSIGN_OP"
	};
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


	public ChristianCLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ChristianC.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20\u0097\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\3\2\3\2\3\3\6\3-\n\3\r\3\16\3.\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4O\n\4\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\7\nw\n\n\f"+
		"\n\16\nz\13\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0090\n\21\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\2\2\25\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\2\25\13\27"+
		"\f\31\r\33\16\35\17\37\20!\2#\2%\2\'\2\3\2\b\4\2\13\f\16\17\3\2\63;\3"+
		"\2\62;\6\2%%,-//\61\61\6\2C\\aac|\u0412\u0451\7\2\62;C\\aac|\u0412\u0451"+
		"\2\u009b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3)\3\2\2\2\5,\3\2\2\2"+
		"\7N\3\2\2\2\tP\3\2\2\2\13T\3\2\2\2\rZ\3\2\2\2\17d\3\2\2\2\21k\3\2\2\2"+
		"\23t\3\2\2\2\25{\3\2\2\2\27}\3\2\2\2\31\177\3\2\2\2\33\u0081\3\2\2\2\35"+
		"\u0083\3\2\2\2\37\u0085\3\2\2\2!\u008f\3\2\2\2#\u0091\3\2\2\2%\u0093\3"+
		"\2\2\2\'\u0095\3\2\2\2)*\7\62\2\2*\4\3\2\2\2+-\t\2\2\2,+\3\2\2\2-.\3\2"+
		"\2\2.,\3\2\2\2./\3\2\2\2/\60\3\2\2\2\60\61\b\3\2\2\61\6\3\2\2\2\62\63"+
		"\7\u0448\2\2\63\64\7\u0437\2\2\64\65\7\u043d\2\2\65\66\7\u044d\2\2\66"+
		"O\7\u043b\2\2\678\7\u0441\2\289\7\u043d\2\29:\7\u0432\2\2:;\7\u0434\2"+
		"\2;<\7\u0432\2\2<=\7\u0450\2\2=>\7\u044b\2\2>?\7\u043a\2\2?O\7\u043b\2"+
		"\2@A\7\u0443\2\2AB\7\u0445\2\2BC\7\u0444\2\2CO\7\u044e\2\2DE\7\u043a\2"+
		"\2EF\7\u0443\2\2FG\7\u0441\2\2GH\7\u043a\2\2HO\7\u0443\2\2IJ\7\u0439\2"+
		"\2JK\7\u0432\2\2KL\7\u043e\2\2LM\7\u0437\2\2MO\7\u0444\2\2N\62\3\2\2\2"+
		"N\67\3\2\2\2N@\3\2\2\2ND\3\2\2\2NI\3\2\2\2O\b\3\2\2\2PQ\7\u0432\2\2QR"+
		"\7\u043c\2\2RS\7\u0440\2\2S\n\3\2\2\2TU\7\u043a\2\2UV\7\u043f\2\2VW\7"+
		"\u0432\2\2WX\7\u043c\2\2XY\7\u0440\2\2Y\f\3\2\2\2Z[\7\u0441\2\2[\\\7\u0440"+
		"\2\2\\]\7\u043c\2\2]^\7\u0432\2\2^_\7\u043e\2\2_`\7\u0437\2\2`a\7\u0443"+
		"\2\2ab\7\u0444\2\2bc\7\u044c\2\2c\16\3\2\2\2de\7\u0436\2\2ef\7\u0437\2"+
		"\2fg\7\u043d\2\2gh\7\u0432\2\2hi\7\u0444\2\2ij\7\u043a\2\2j\20\3\2\2\2"+
		"kl\7\u043a\2\2lm\7\u0439\2\2mn\7\u044c\2\2no\7\u0451\2\2op\7\u0434\2\2"+
		"pq\7\u043a\2\2qr\7\u0444\2\2rs\7\u043a\2\2s\22\3\2\2\2tx\t\3\2\2uw\t\4"+
		"\2\2vu\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y\24\3\2\2\2zx\3\2\2\2{|\7"+
		"*\2\2|\26\3\2\2\2}~\7+\2\2~\30\3\2\2\2\177\u0080\7}\2\2\u0080\32\3\2\2"+
		"\2\u0081\u0082\7\177\2\2\u0082\34\3\2\2\2\u0083\u0084\7=\2\2\u0084\36"+
		"\3\2\2\2\u0085\u0086\7?\2\2\u0086 \3\2\2\2\u0087\u0088\7?\2\2\u0088\u0090"+
		"\7?\2\2\u0089\u0090\7@\2\2\u008a\u008b\7@\2\2\u008b\u0090\7?\2\2\u008c"+
		"\u0090\7>\2\2\u008d\u008e\7>\2\2\u008e\u0090\7?\2\2\u008f\u0087\3\2\2"+
		"\2\u008f\u0089\3\2\2\2\u008f\u008a\3\2\2\2\u008f\u008c\3\2\2\2\u008f\u008d"+
		"\3\2\2\2\u0090\"\3\2\2\2\u0091\u0092\t\5\2\2\u0092$\3\2\2\2\u0093\u0094"+
		"\t\6\2\2\u0094&\3\2\2\2\u0095\u0096\t\7\2\2\u0096(\3\2\2\2\7\2.Nx\u008f"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}