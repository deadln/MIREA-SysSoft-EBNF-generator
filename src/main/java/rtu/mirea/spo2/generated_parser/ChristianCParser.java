package rtu.mirea.spo2.generated_parser;// Generated from ChristianC.g4 by ANTLR 4.7.1

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ChristianCParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, WS=2, VAR_TYPE=3, IF_KW=4, ELSE_KW=5, WHILE_KW=6, DO_KW=7, PRINT_KW=8, 
		L_BR=9, R_BR=10, L_S_BR=11, R_S_BR=12, SEP=13, ASSIGN_OP=14, NON_ZERO_NUMBER=15, 
		LOGICAL_OP=16, OP=17, LETTER=18, LETTER_OR_DIGIT=19;
	public static final int
		RULE_lang = 0, RULE_expr = 1, RULE_declaring_expr = 2, RULE_assign_expr = 3, 
		RULE_arithmetic_expr = 4, RULE_value = 5, RULE_if_expr = 6, RULE_if_head = 7, 
		RULE_condition = 8, RULE_logical_expression = 9, RULE_if_body = 10, RULE_else_head = 11, 
		RULE_else_body = 12, RULE_while_expr = 13, RULE_while_head = 14, RULE_while_body = 15, 
		RULE_do_while_expr = 16, RULE_print_expr = 17, RULE_var_type = 18, RULE_number = 19, 
		RULE_logical_op = 20, RULE_op = 21, RULE_var = 22;
	public static final String[] ruleNames = {
		"lang", "expr", "declaring_expr", "assign_expr", "arithmetic_expr", "value", 
		"if_expr", "if_head", "condition", "logical_expression", "if_body", "else_head", 
		"else_body", "while_expr", "while_head", "while_body", "do_while_expr", 
		"print_expr", "var_type", "number", "logical_op", "op", "var"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'0'", null, null, "'\u0430\u043A\u043E'", "'\u0438\u043D\u0430\u043A\u043E'", 
		"'\u043F\u043E\u043A\u0430\u043C\u0435\u0441\u0442\u044A'", "'\u0434\u0435\u043B\u0430\u0442\u0438'", 
		"'\u0438\u0437\u044A\u044F\u0432\u0438\u0442\u0438'", "'('", "')'", "'{'", 
		"'}'", "';'", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "WS", "VAR_TYPE", "IF_KW", "ELSE_KW", "WHILE_KW", "DO_KW", 
		"PRINT_KW", "L_BR", "R_BR", "L_S_BR", "R_S_BR", "SEP", "ASSIGN_OP", "NON_ZERO_NUMBER", 
		"LOGICAL_OP", "OP", "LETTER", "LETTER_OR_DIGIT"
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

	@Override
	public String getGrammarFileName() { return "ChristianC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ChristianCParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class LangContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LangContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lang; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChristianCListener) ((ChristianCListener)listener).enterLang(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChristianCListener) ((ChristianCListener)listener).exitLang(this);
		}
	}

	public final LangContext lang() throws RecognitionException {
		LangContext _localctx = new LangContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_lang);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(46);
				expr();
				}
				}
				setState(49); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR_TYPE) | (1L << IF_KW) | (1L << WHILE_KW) | (1L << DO_KW) | (1L << PRINT_KW) | (1L << LETTER))) != 0) );
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

	public static class ExprContext extends ParserRuleContext {
		public Declaring_exprContext declaring_expr() {
			return getRuleContext(Declaring_exprContext.class,0);
		}
		public Assign_exprContext assign_expr() {
			return getRuleContext(Assign_exprContext.class,0);
		}
		public If_exprContext if_expr() {
			return getRuleContext(If_exprContext.class,0);
		}
		public While_exprContext while_expr() {
			return getRuleContext(While_exprContext.class,0);
		}
		public Do_while_exprContext do_while_expr() {
			return getRuleContext(Do_while_exprContext.class,0);
		}
		public Print_exprContext print_expr() {
			return getRuleContext(Print_exprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChristianCListener) ((ChristianCListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChristianCListener) ((ChristianCListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expr);
		try {
			setState(57);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				declaring_expr();
				}
				break;
			case LETTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				assign_expr();
				}
				break;
			case IF_KW:
				enterOuterAlt(_localctx, 3);
				{
				setState(53);
				if_expr();
				}
				break;
			case WHILE_KW:
				enterOuterAlt(_localctx, 4);
				{
				setState(54);
				while_expr();
				}
				break;
			case DO_KW:
				enterOuterAlt(_localctx, 5);
				{
				setState(55);
				do_while_expr();
				}
				break;
			case PRINT_KW:
				enterOuterAlt(_localctx, 6);
				{
				setState(56);
				print_expr();
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

	public static class Declaring_exprContext extends ParserRuleContext {
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode ASSIGN_OP() { return getToken(ChristianCParser.ASSIGN_OP, 0); }
		public Arithmetic_exprContext arithmetic_expr() {
			return getRuleContext(Arithmetic_exprContext.class,0);
		}
		public Declaring_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaring_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChristianCListener) ((ChristianCListener)listener).enterDeclaring_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChristianCListener) ((ChristianCListener)listener).exitDeclaring_expr(this);
		}
	}

	public final Declaring_exprContext declaring_expr() throws RecognitionException {
		Declaring_exprContext _localctx = new Declaring_exprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaring_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			var_type();
			setState(60);
			var();
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN_OP) {
				{
				setState(61);
				match(ASSIGN_OP);
				setState(62);
				arithmetic_expr();
				}
			}

			setState(65);
			match(SEP);
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

	public static class Assign_exprContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode ASSIGN_OP() { return getToken(ChristianCParser.ASSIGN_OP, 0); }
		public Arithmetic_exprContext arithmetic_expr() {
			return getRuleContext(Arithmetic_exprContext.class,0);
		}
		public Assign_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChristianCListener) ((ChristianCListener)listener).enterAssign_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChristianCListener) ((ChristianCListener)listener).exitAssign_expr(this);
		}
	}

	public final Assign_exprContext assign_expr() throws RecognitionException {
		Assign_exprContext _localctx = new Assign_exprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assign_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			var();
			setState(68);
			match(ASSIGN_OP);
			setState(69);
			arithmetic_expr();
			setState(70);
			match(SEP);
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

	public static class Arithmetic_exprContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public List<Arithmetic_exprContext> arithmetic_expr() {
			return getRuleContexts(Arithmetic_exprContext.class);
		}
		public Arithmetic_exprContext arithmetic_expr(int i) {
			return getRuleContext(Arithmetic_exprContext.class,i);
		}
		public List<OpContext> op() {
			return getRuleContexts(OpContext.class);
		}
		public OpContext op(int i) {
			return getRuleContext(OpContext.class,i);
		}
		public Arithmetic_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChristianCListener) ((ChristianCListener)listener).enterArithmetic_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChristianCListener) ((ChristianCListener)listener).exitArithmetic_expr(this);
		}
	}

	public final Arithmetic_exprContext arithmetic_expr() throws RecognitionException {
		Arithmetic_exprContext _localctx = new Arithmetic_exprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_arithmetic_expr);
		try {
			int _alt;
			setState(85);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case NON_ZERO_NUMBER:
			case LETTER:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				value();
				}
				break;
			case L_BR:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(73);
				match(L_BR);
				setState(74);
				arithmetic_expr();
				setState(75);
				match(R_BR);
				}
				setState(82);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(77);
						op();
						setState(78);
						arithmetic_expr();
						}
						} 
					}
					setState(84);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
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
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChristianCListener) ((ChristianCListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChristianCListener) ((ChristianCListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_value);
		try {
			setState(89);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case NON_ZERO_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				number();
				}
				break;
			case LETTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				var();
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

	public static class If_exprContext extends ParserRuleContext {
		public If_headContext if_head() {
			return getRuleContext(If_headContext.class,0);
		}
		public If_bodyContext if_body() {
			return getRuleContext(If_bodyContext.class,0);
		}
		public Else_headContext else_head() {
			return getRuleContext(Else_headContext.class,0);
		}
		public Else_bodyContext else_body() {
			return getRuleContext(Else_bodyContext.class,0);
		}
		public If_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChristianCListener) ((ChristianCListener)listener).enterIf_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChristianCListener) ((ChristianCListener)listener).exitIf_expr(this);
		}
	}

	public final If_exprContext if_expr() throws RecognitionException {
		If_exprContext _localctx = new If_exprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_if_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			if_head();
			setState(92);
			if_body();
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE_KW) {
				{
				setState(93);
				else_head();
				setState(94);
				else_body();
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

	public static class If_headContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public If_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChristianCListener) ((ChristianCListener)listener).enterIf_head(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChristianCListener) ((ChristianCListener)listener).exitIf_head(this);
		}
	}

	public final If_headContext if_head() throws RecognitionException {
		If_headContext _localctx = new If_headContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_if_head);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(IF_KW);
			setState(99);
			condition();
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

	public static class ConditionContext extends ParserRuleContext {
		public Logical_expressionContext logical_expression() {
			return getRuleContext(Logical_expressionContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChristianCListener) ((ChristianCListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChristianCListener) ((ChristianCListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(L_BR);
			setState(102);
			logical_expression();
			setState(103);
			match(R_BR);
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

	public static class Logical_expressionContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public Logical_opContext logical_op() {
			return getRuleContext(Logical_opContext.class,0);
		}
		public Logical_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChristianCListener) ((ChristianCListener)listener).enterLogical_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChristianCListener) ((ChristianCListener)listener).exitLogical_expression(this);
		}
	}

	public final Logical_expressionContext logical_expression() throws RecognitionException {
		Logical_expressionContext _localctx = new Logical_expressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_logical_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			value();
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOGICAL_OP) {
				{
				setState(106);
				logical_op();
				setState(107);
				value();
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

	public static class If_bodyContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public If_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChristianCListener) ((ChristianCListener)listener).enterIf_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChristianCListener) ((ChristianCListener)listener).exitIf_body(this);
		}
	}

	public final If_bodyContext if_body() throws RecognitionException {
		If_bodyContext _localctx = new If_bodyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_if_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(L_S_BR);
			setState(113); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(112);
				expr();
				}
				}
				setState(115); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR_TYPE) | (1L << IF_KW) | (1L << WHILE_KW) | (1L << DO_KW) | (1L << PRINT_KW) | (1L << LETTER))) != 0) );
			setState(117);
			match(R_S_BR);
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

	public static class Else_headContext extends ParserRuleContext {
		public If_headContext if_head() {
			return getRuleContext(If_headContext.class,0);
		}
		public Else_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChristianCListener) ((ChristianCListener)listener).enterElse_head(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChristianCListener) ((ChristianCListener)listener).exitElse_head(this);
		}
	}

	public final Else_headContext else_head() throws RecognitionException {
		Else_headContext _localctx = new Else_headContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_else_head);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(ELSE_KW);
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF_KW) {
				{
				setState(120);
				if_head();
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

	public static class Else_bodyContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Else_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChristianCListener) ((ChristianCListener)listener).enterElse_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChristianCListener) ((ChristianCListener)listener).exitElse_body(this);
		}
	}

	public final Else_bodyContext else_body() throws RecognitionException {
		Else_bodyContext _localctx = new Else_bodyContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_else_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(L_S_BR);
			setState(125); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(124);
				expr();
				}
				}
				setState(127); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR_TYPE) | (1L << IF_KW) | (1L << WHILE_KW) | (1L << DO_KW) | (1L << PRINT_KW) | (1L << LETTER))) != 0) );
			setState(129);
			match(R_S_BR);
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

	public static class While_exprContext extends ParserRuleContext {
		public While_headContext while_head() {
			return getRuleContext(While_headContext.class,0);
		}
		public While_bodyContext while_body() {
			return getRuleContext(While_bodyContext.class,0);
		}
		public While_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChristianCListener) ((ChristianCListener)listener).enterWhile_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChristianCListener) ((ChristianCListener)listener).exitWhile_expr(this);
		}
	}

	public final While_exprContext while_expr() throws RecognitionException {
		While_exprContext _localctx = new While_exprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_while_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			while_head();
			setState(132);
			while_body();
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

	public static class While_headContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public While_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChristianCListener) ((ChristianCListener)listener).enterWhile_head(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChristianCListener) ((ChristianCListener)listener).exitWhile_head(this);
		}
	}

	public final While_headContext while_head() throws RecognitionException {
		While_headContext _localctx = new While_headContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_while_head);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(WHILE_KW);
			setState(135);
			condition();
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

	public static class While_bodyContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public While_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChristianCListener) ((ChristianCListener)listener).enterWhile_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChristianCListener) ((ChristianCListener)listener).exitWhile_body(this);
		}
	}

	public final While_bodyContext while_body() throws RecognitionException {
		While_bodyContext _localctx = new While_bodyContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_while_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(L_S_BR);
			setState(139); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(138);
				expr();
				}
				}
				setState(141); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR_TYPE) | (1L << IF_KW) | (1L << WHILE_KW) | (1L << DO_KW) | (1L << PRINT_KW) | (1L << LETTER))) != 0) );
			setState(143);
			match(R_S_BR);
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

	public static class Do_while_exprContext extends ParserRuleContext {
		public While_bodyContext while_body() {
			return getRuleContext(While_bodyContext.class,0);
		}
		public While_headContext while_head() {
			return getRuleContext(While_headContext.class,0);
		}
		public Do_while_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChristianCListener) ((ChristianCListener)listener).enterDo_while_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChristianCListener) ((ChristianCListener)listener).exitDo_while_expr(this);
		}
	}

	public final Do_while_exprContext do_while_expr() throws RecognitionException {
		Do_while_exprContext _localctx = new Do_while_exprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_do_while_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(DO_KW);
			setState(146);
			while_body();
			setState(147);
			while_head();
			setState(148);
			match(SEP);
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

	public static class Print_exprContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Print_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChristianCListener) ((ChristianCListener)listener).enterPrint_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChristianCListener) ((ChristianCListener)listener).exitPrint_expr(this);
		}
	}

	public final Print_exprContext print_expr() throws RecognitionException {
		Print_exprContext _localctx = new Print_exprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_print_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(PRINT_KW);
			setState(151);
			value();
			setState(152);
			match(SEP);
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

	public static class Var_typeContext extends ParserRuleContext {
		public TerminalNode VAR_TYPE() { return getToken(ChristianCParser.VAR_TYPE, 0); }
		public Var_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChristianCListener) ((ChristianCListener)listener).enterVar_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChristianCListener) ((ChristianCListener)listener).exitVar_type(this);
		}
	}

	public final Var_typeContext var_type() throws RecognitionException {
		Var_typeContext _localctx = new Var_typeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_var_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(VAR_TYPE);
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode NON_ZERO_NUMBER() { return getToken(ChristianCParser.NON_ZERO_NUMBER, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChristianCListener) ((ChristianCListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChristianCListener) ((ChristianCListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==NON_ZERO_NUMBER) ) {
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

	public static class Logical_opContext extends ParserRuleContext {
		public TerminalNode LOGICAL_OP() { return getToken(ChristianCParser.LOGICAL_OP, 0); }
		public Logical_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChristianCListener) ((ChristianCListener)listener).enterLogical_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChristianCListener) ((ChristianCListener)listener).exitLogical_op(this);
		}
	}

	public final Logical_opContext logical_op() throws RecognitionException {
		Logical_opContext _localctx = new Logical_opContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_logical_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(LOGICAL_OP);
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

	public static class OpContext extends ParserRuleContext {
		public TerminalNode OP() { return getToken(ChristianCParser.OP, 0); }
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChristianCListener) ((ChristianCListener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChristianCListener) ((ChristianCListener)listener).exitOp(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(OP);
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

	public static class VarContext extends ParserRuleContext {
		public TerminalNode LETTER() { return getToken(ChristianCParser.LETTER, 0); }
		public List<TerminalNode> LETTER_OR_DIGIT() { return getTokens(ChristianCParser.LETTER_OR_DIGIT); }
		public TerminalNode LETTER_OR_DIGIT(int i) {
			return getToken(ChristianCParser.LETTER_OR_DIGIT, i);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChristianCListener) ((ChristianCListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChristianCListener) ((ChristianCListener)listener).exitVar(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(LETTER);
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LETTER_OR_DIGIT) {
				{
				{
				setState(163);
				match(LETTER_OR_DIGIT);
				}
				}
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\25\u00ac\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\6\2\62"+
		"\n\2\r\2\16\2\63\3\3\3\3\3\3\3\3\3\3\3\3\5\3<\n\3\3\4\3\4\3\4\3\4\5\4"+
		"B\n\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6"+
		"S\n\6\f\6\16\6V\13\6\5\6X\n\6\3\7\3\7\5\7\\\n\7\3\b\3\b\3\b\3\b\3\b\5"+
		"\bc\n\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\5\13p\n\13\3\f"+
		"\3\f\6\ft\n\f\r\f\16\fu\3\f\3\f\3\r\3\r\5\r|\n\r\3\16\3\16\6\16\u0080"+
		"\n\16\r\16\16\16\u0081\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3"+
		"\21\6\21\u008e\n\21\r\21\16\21\u008f\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30"+
		"\7\30\u00a7\n\30\f\30\16\30\u00aa\13\30\3\30\2\2\31\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\2\3\4\2\3\3\21\21\2\u00a5\2\61\3\2\2\2"+
		"\4;\3\2\2\2\6=\3\2\2\2\bE\3\2\2\2\nW\3\2\2\2\f[\3\2\2\2\16]\3\2\2\2\20"+
		"d\3\2\2\2\22g\3\2\2\2\24k\3\2\2\2\26q\3\2\2\2\30y\3\2\2\2\32}\3\2\2\2"+
		"\34\u0085\3\2\2\2\36\u0088\3\2\2\2 \u008b\3\2\2\2\"\u0093\3\2\2\2$\u0098"+
		"\3\2\2\2&\u009c\3\2\2\2(\u009e\3\2\2\2*\u00a0\3\2\2\2,\u00a2\3\2\2\2."+
		"\u00a4\3\2\2\2\60\62\5\4\3\2\61\60\3\2\2\2\62\63\3\2\2\2\63\61\3\2\2\2"+
		"\63\64\3\2\2\2\64\3\3\2\2\2\65<\5\6\4\2\66<\5\b\5\2\67<\5\16\b\28<\5\34"+
		"\17\29<\5\"\22\2:<\5$\23\2;\65\3\2\2\2;\66\3\2\2\2;\67\3\2\2\2;8\3\2\2"+
		"\2;9\3\2\2\2;:\3\2\2\2<\5\3\2\2\2=>\5&\24\2>A\5.\30\2?@\7\20\2\2@B\5\n"+
		"\6\2A?\3\2\2\2AB\3\2\2\2BC\3\2\2\2CD\7\17\2\2D\7\3\2\2\2EF\5.\30\2FG\7"+
		"\20\2\2GH\5\n\6\2HI\7\17\2\2I\t\3\2\2\2JX\5\f\7\2KL\7\13\2\2LM\5\n\6\2"+
		"MN\7\f\2\2NT\3\2\2\2OP\5,\27\2PQ\5\n\6\2QS\3\2\2\2RO\3\2\2\2SV\3\2\2\2"+
		"TR\3\2\2\2TU\3\2\2\2UX\3\2\2\2VT\3\2\2\2WJ\3\2\2\2WK\3\2\2\2X\13\3\2\2"+
		"\2Y\\\5(\25\2Z\\\5.\30\2[Y\3\2\2\2[Z\3\2\2\2\\\r\3\2\2\2]^\5\20\t\2^b"+
		"\5\26\f\2_`\5\30\r\2`a\5\32\16\2ac\3\2\2\2b_\3\2\2\2bc\3\2\2\2c\17\3\2"+
		"\2\2de\7\6\2\2ef\5\22\n\2f\21\3\2\2\2gh\7\13\2\2hi\5\24\13\2ij\7\f\2\2"+
		"j\23\3\2\2\2ko\5\f\7\2lm\5*\26\2mn\5\f\7\2np\3\2\2\2ol\3\2\2\2op\3\2\2"+
		"\2p\25\3\2\2\2qs\7\r\2\2rt\5\4\3\2sr\3\2\2\2tu\3\2\2\2us\3\2\2\2uv\3\2"+
		"\2\2vw\3\2\2\2wx\7\16\2\2x\27\3\2\2\2y{\7\7\2\2z|\5\20\t\2{z\3\2\2\2{"+
		"|\3\2\2\2|\31\3\2\2\2}\177\7\r\2\2~\u0080\5\4\3\2\177~\3\2\2\2\u0080\u0081"+
		"\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\3\2\2\2\u0083"+
		"\u0084\7\16\2\2\u0084\33\3\2\2\2\u0085\u0086\5\36\20\2\u0086\u0087\5 "+
		"\21\2\u0087\35\3\2\2\2\u0088\u0089\7\b\2\2\u0089\u008a\5\22\n\2\u008a"+
		"\37\3\2\2\2\u008b\u008d\7\r\2\2\u008c\u008e\5\4\3\2\u008d\u008c\3\2\2"+
		"\2\u008e\u008f\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091"+
		"\3\2\2\2\u0091\u0092\7\16\2\2\u0092!\3\2\2\2\u0093\u0094\7\t\2\2\u0094"+
		"\u0095\5 \21\2\u0095\u0096\5\36\20\2\u0096\u0097\7\17\2\2\u0097#\3\2\2"+
		"\2\u0098\u0099\7\n\2\2\u0099\u009a\5\f\7\2\u009a\u009b\7\17\2\2\u009b"+
		"%\3\2\2\2\u009c\u009d\7\5\2\2\u009d\'\3\2\2\2\u009e\u009f\t\2\2\2\u009f"+
		")\3\2\2\2\u00a0\u00a1\7\22\2\2\u00a1+\3\2\2\2\u00a2\u00a3\7\23\2\2\u00a3"+
		"-\3\2\2\2\u00a4\u00a8\7\24\2\2\u00a5\u00a7\7\25\2\2\u00a6\u00a5\3\2\2"+
		"\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9/"+
		"\3\2\2\2\u00aa\u00a8\3\2\2\2\17\63;ATW[bou{\u0081\u008f\u00a8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}