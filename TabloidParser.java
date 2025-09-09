// Generated from Tabloid.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class TabloidParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, ID=38, INT=39, 
		FLOAT=40, STRING=41, BOOL=42, COMMENT=43, WS=44;
	public static final int
		RULE_programma = 0, RULE_dilosi = 1, RULE_anathesi = 2, RULE_ektypwsi = 3, 
		RULE_eisodos = 4, RULE_epistrofi = 5, RULE_dhmiourgiasynartishs = 6, RULE_parametroi = 7, 
		RULE_klhsh = 8, RULE_listaOrismatwn = 9, RULE_if = 10, RULE_while = 11, 
		RULE_synthiki = 12, RULE_sygkritis = 13, RULE_ekfrasi = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"programma", "dilosi", "anathesi", "ektypwsi", "eisodos", "epistrofi", 
			"dhmiourgiasynartishs", "parametroi", "klhsh", "listaOrismatwn", "if", 
			"while", "synthiki", "sygkritis", "ekfrasi"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'PLEASE LIKE AND SUBSCRIBE'", "'EXPERTS CLAIM'", "'TO BE'", "'YOU WON'T WANT TO MISS'", 
			"'TELL ME'", "'LATEST NEWS ON'", "'SHOCKING DEVELOPMENT'", "'DISCOVER HOW TO'", 
			"'WITH'", "'RUMOR HAS IT'", "'END OF STORY'", "','", "'OF'", "'WHAT IF'", 
			"'LIES!'", "'STAY TUNED WHILE'", "'SMALLER THAN'", "'BIGGER THAN'", "'LESS THAN'", 
			"'BEATS'", "'EQUAL TO'", "'NOT EQUAL TO'", "'IS ACTUALLY'", "'*'", "'/'", 
			"'%'", "'TIMES'", "'DIVIDED BY'", "'MODULO'", "'+'", "'-'", "'PLUS'", 
			"'MINUS'", "'AND'", "'OR'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "ID", "INT", "FLOAT", "STRING", "BOOL", "COMMENT", "WS"
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
	public String getGrammarFileName() { return "Tabloid.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TabloidParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgrammaContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(TabloidParser.EOF, 0); }
		public List<DilosiContext> dilosi() {
			return getRuleContexts(DilosiContext.class);
		}
		public DilosiContext dilosi(int i) {
			return getRuleContext(DilosiContext.class,i);
		}
		public ProgrammaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabloidListener ) ((TabloidListener)listener).enterProgramma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabloidListener ) ((TabloidListener)listener).exitProgramma(this);
		}
	}

	public final ProgrammaContext programma() throws RecognitionException {
		ProgrammaContext _localctx = new ProgrammaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programma);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 274877989366L) != 0)) {
				{
				{
				setState(30);
				dilosi();
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(36);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DilosiContext extends ParserRuleContext {
		public AnathesiContext anathesi() {
			return getRuleContext(AnathesiContext.class,0);
		}
		public EktypwsiContext ektypwsi() {
			return getRuleContext(EktypwsiContext.class,0);
		}
		public EisodosContext eisodos() {
			return getRuleContext(EisodosContext.class,0);
		}
		public EpistrofiContext epistrofi() {
			return getRuleContext(EpistrofiContext.class,0);
		}
		public DhmiourgiasynartishsContext dhmiourgiasynartishs() {
			return getRuleContext(DhmiourgiasynartishsContext.class,0);
		}
		public KlhshContext klhsh() {
			return getRuleContext(KlhshContext.class,0);
		}
		public IfContext if_() {
			return getRuleContext(IfContext.class,0);
		}
		public WhileContext while_() {
			return getRuleContext(WhileContext.class,0);
		}
		public DilosiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dilosi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabloidListener ) ((TabloidListener)listener).enterDilosi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabloidListener ) ((TabloidListener)listener).exitDilosi(this);
		}
	}

	public final DilosiContext dilosi() throws RecognitionException {
		DilosiContext _localctx = new DilosiContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_dilosi);
		try {
			setState(47);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				anathesi();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				ektypwsi();
				}
				break;
			case T__4:
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(40);
				eisodos();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 4);
				{
				setState(41);
				epistrofi();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 5);
				{
				setState(42);
				dhmiourgiasynartishs();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 6);
				{
				setState(43);
				klhsh();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 7);
				{
				setState(44);
				if_();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 8);
				{
				setState(45);
				while_();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 9);
				{
				setState(46);
				match(T__0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AnathesiContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TabloidParser.ID, 0); }
		public EkfrasiContext ekfrasi() {
			return getRuleContext(EkfrasiContext.class,0);
		}
		public AnathesiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anathesi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabloidListener ) ((TabloidListener)listener).enterAnathesi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabloidListener ) ((TabloidListener)listener).exitAnathesi(this);
		}
	}

	public final AnathesiContext anathesi() throws RecognitionException {
		AnathesiContext _localctx = new AnathesiContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_anathesi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(T__1);
			setState(50);
			match(ID);
			setState(51);
			match(T__2);
			setState(52);
			ekfrasi(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EktypwsiContext extends ParserRuleContext {
		public EkfrasiContext ekfrasi() {
			return getRuleContext(EkfrasiContext.class,0);
		}
		public EktypwsiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ektypwsi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabloidListener ) ((TabloidListener)listener).enterEktypwsi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabloidListener ) ((TabloidListener)listener).exitEktypwsi(this);
		}
	}

	public final EktypwsiContext ektypwsi() throws RecognitionException {
		EktypwsiContext _localctx = new EktypwsiContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ektypwsi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(T__3);
			setState(55);
			ekfrasi(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EisodosContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TabloidParser.ID, 0); }
		public EisodosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eisodos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabloidListener ) ((TabloidListener)listener).enterEisodos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabloidListener ) ((TabloidListener)listener).exitEisodos(this);
		}
	}

	public final EisodosContext eisodos() throws RecognitionException {
		EisodosContext _localctx = new EisodosContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_eisodos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			_la = _input.LA(1);
			if ( !(_la==T__4 || _la==T__5) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(58);
			match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EpistrofiContext extends ParserRuleContext {
		public EkfrasiContext ekfrasi() {
			return getRuleContext(EkfrasiContext.class,0);
		}
		public EpistrofiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_epistrofi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabloidListener ) ((TabloidListener)listener).enterEpistrofi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabloidListener ) ((TabloidListener)listener).exitEpistrofi(this);
		}
	}

	public final EpistrofiContext epistrofi() throws RecognitionException {
		EpistrofiContext _localctx = new EpistrofiContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_epistrofi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(T__6);
			setState(62);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(61);
				ekfrasi(0);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class DhmiourgiasynartishsContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TabloidParser.ID, 0); }
		public ParametroiContext parametroi() {
			return getRuleContext(ParametroiContext.class,0);
		}
		public List<DilosiContext> dilosi() {
			return getRuleContexts(DilosiContext.class);
		}
		public DilosiContext dilosi(int i) {
			return getRuleContext(DilosiContext.class,i);
		}
		public DhmiourgiasynartishsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dhmiourgiasynartishs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabloidListener ) ((TabloidListener)listener).enterDhmiourgiasynartishs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabloidListener ) ((TabloidListener)listener).exitDhmiourgiasynartishs(this);
		}
	}

	public final DhmiourgiasynartishsContext dhmiourgiasynartishs() throws RecognitionException {
		DhmiourgiasynartishsContext _localctx = new DhmiourgiasynartishsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_dhmiourgiasynartishs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(T__7);
			setState(65);
			match(ID);
			setState(66);
			match(T__8);
			setState(67);
			parametroi();
			setState(68);
			match(T__9);
			setState(70); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(69);
				dilosi();
				}
				}
				setState(72); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 274877989366L) != 0) );
			setState(74);
			match(T__10);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParametroiContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(TabloidParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TabloidParser.ID, i);
		}
		public ParametroiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametroi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabloidListener ) ((TabloidListener)listener).enterParametroi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabloidListener ) ((TabloidListener)listener).exitParametroi(this);
		}
	}

	public final ParametroiContext parametroi() throws RecognitionException {
		ParametroiContext _localctx = new ParametroiContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_parametroi);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(ID);
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(77);
				match(T__11);
				setState(78);
				match(ID);
				}
				}
				setState(83);
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

	@SuppressWarnings("CheckReturnValue")
	public static class KlhshContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TabloidParser.ID, 0); }
		public ListaOrismatwnContext listaOrismatwn() {
			return getRuleContext(ListaOrismatwnContext.class,0);
		}
		public KlhshContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_klhsh; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabloidListener ) ((TabloidListener)listener).enterKlhsh(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabloidListener ) ((TabloidListener)listener).exitKlhsh(this);
		}
	}

	public final KlhshContext klhsh() throws RecognitionException {
		KlhshContext _localctx = new KlhshContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_klhsh);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(ID);
			setState(85);
			match(T__12);
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(86);
				listaOrismatwn();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListaOrismatwnContext extends ParserRuleContext {
		public List<EkfrasiContext> ekfrasi() {
			return getRuleContexts(EkfrasiContext.class);
		}
		public EkfrasiContext ekfrasi(int i) {
			return getRuleContext(EkfrasiContext.class,i);
		}
		public ListaOrismatwnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaOrismatwn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabloidListener ) ((TabloidListener)listener).enterListaOrismatwn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabloidListener ) ((TabloidListener)listener).exitListaOrismatwn(this);
		}
	}

	public final ListaOrismatwnContext listaOrismatwn() throws RecognitionException {
		ListaOrismatwnContext _localctx = new ListaOrismatwnContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_listaOrismatwn);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			ekfrasi(0);
			setState(94);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(90);
					match(T__11);
					setState(91);
					ekfrasi(0);
					}
					} 
				}
				setState(96);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfContext extends ParserRuleContext {
		public SynthikiContext synthiki() {
			return getRuleContext(SynthikiContext.class,0);
		}
		public List<DilosiContext> dilosi() {
			return getRuleContexts(DilosiContext.class);
		}
		public DilosiContext dilosi(int i) {
			return getRuleContext(DilosiContext.class,i);
		}
		public IfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabloidListener ) ((TabloidListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabloidListener ) ((TabloidListener)listener).exitIf(this);
		}
	}

	public final IfContext if_() throws RecognitionException {
		IfContext _localctx = new IfContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(T__13);
			setState(98);
			synthiki();
			setState(100); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(99);
				dilosi();
				}
				}
				setState(102); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 274877989366L) != 0) );
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(104);
				match(T__14);
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(105);
					match(T__9);
					setState(107); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(106);
						dilosi();
						}
						}
						setState(109); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 274877989366L) != 0) );
					}
				}

				}
			}

			setState(115);
			match(T__10);
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhileContext extends ParserRuleContext {
		public SynthikiContext synthiki() {
			return getRuleContext(SynthikiContext.class,0);
		}
		public List<DilosiContext> dilosi() {
			return getRuleContexts(DilosiContext.class);
		}
		public DilosiContext dilosi(int i) {
			return getRuleContext(DilosiContext.class,i);
		}
		public WhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabloidListener ) ((TabloidListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabloidListener ) ((TabloidListener)listener).exitWhile(this);
		}
	}

	public final WhileContext while_() throws RecognitionException {
		WhileContext _localctx = new WhileContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_while);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(T__15);
			setState(118);
			synthiki();
			setState(119);
			match(T__9);
			setState(121); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(120);
				dilosi();
				}
				}
				setState(123); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 274877989366L) != 0) );
			setState(125);
			match(T__10);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SynthikiContext extends ParserRuleContext {
		public List<EkfrasiContext> ekfrasi() {
			return getRuleContexts(EkfrasiContext.class);
		}
		public EkfrasiContext ekfrasi(int i) {
			return getRuleContext(EkfrasiContext.class,i);
		}
		public SygkritisContext sygkritis() {
			return getRuleContext(SygkritisContext.class,0);
		}
		public SynthikiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synthiki; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabloidListener ) ((TabloidListener)listener).enterSynthiki(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabloidListener ) ((TabloidListener)listener).exitSynthiki(this);
		}
	}

	public final SynthikiContext synthiki() throws RecognitionException {
		SynthikiContext _localctx = new SynthikiContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_synthiki);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			ekfrasi(0);
			setState(128);
			sygkritis();
			setState(129);
			ekfrasi(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SygkritisContext extends ParserRuleContext {
		public SygkritisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sygkritis; }
	 
		public SygkritisContext() { }
		public void copyFrom(SygkritisContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IsoContext extends SygkritisContext {
		public IsoContext(SygkritisContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabloidListener ) ((TabloidListener)listener).enterIso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabloidListener ) ((TabloidListener)listener).exitIso(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SynwnymoMikroterouContext extends SygkritisContext {
		public SynwnymoMikroterouContext(SygkritisContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabloidListener ) ((TabloidListener)listener).enterSynwnymoMikroterou(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabloidListener ) ((TabloidListener)listener).exitSynwnymoMikroterou(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SynwnymoMegalyterouContext extends SygkritisContext {
		public SynwnymoMegalyterouContext(SygkritisContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabloidListener ) ((TabloidListener)listener).enterSynwnymoMegalyterou(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabloidListener ) ((TabloidListener)listener).exitSynwnymoMegalyterou(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DiaforoContext extends SygkritisContext {
		public DiaforoContext(SygkritisContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabloidListener ) ((TabloidListener)listener).enterDiaforo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabloidListener ) ((TabloidListener)listener).exitDiaforo(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MegalyteroContext extends SygkritisContext {
		public MegalyteroContext(SygkritisContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabloidListener ) ((TabloidListener)listener).enterMegalytero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabloidListener ) ((TabloidListener)listener).exitMegalytero(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MikroteroContext extends SygkritisContext {
		public MikroteroContext(SygkritisContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabloidListener ) ((TabloidListener)listener).enterMikrotero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabloidListener ) ((TabloidListener)listener).exitMikrotero(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SynwnymoIsotitasContext extends SygkritisContext {
		public SynwnymoIsotitasContext(SygkritisContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabloidListener ) ((TabloidListener)listener).enterSynwnymoIsotitas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabloidListener ) ((TabloidListener)listener).exitSynwnymoIsotitas(this);
		}
	}

	public final SygkritisContext sygkritis() throws RecognitionException {
		SygkritisContext _localctx = new SygkritisContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_sygkritis);
		try {
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
				_localctx = new MikroteroContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				match(T__16);
				}
				break;
			case T__17:
				_localctx = new MegalyteroContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				match(T__17);
				}
				break;
			case T__18:
				_localctx = new SynwnymoMikroterouContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(133);
				match(T__18);
				}
				break;
			case T__19:
				_localctx = new SynwnymoMegalyterouContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(134);
				match(T__19);
				}
				break;
			case T__20:
				_localctx = new IsoContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(135);
				match(T__20);
				}
				break;
			case T__21:
				_localctx = new DiaforoContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(136);
				match(T__21);
				}
				break;
			case T__22:
				_localctx = new SynwnymoIsotitasContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(137);
				match(T__22);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EkfrasiContext extends ParserRuleContext {
		public EkfrasiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ekfrasi; }
	 
		public EkfrasiContext() { }
		public void copyFrom(EkfrasiContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AkeraioContext extends EkfrasiContext {
		public TerminalNode INT() { return getToken(TabloidParser.INT, 0); }
		public AkeraioContext(EkfrasiContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabloidListener ) ((TabloidListener)listener).enterAkeraio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabloidListener ) ((TabloidListener)listener).exitAkeraio(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DekadikoContext extends EkfrasiContext {
		public TerminalNode FLOAT() { return getToken(TabloidParser.FLOAT, 0); }
		public DekadikoContext(EkfrasiContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabloidListener ) ((TabloidListener)listener).enterDekadiko(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabloidListener ) ((TabloidListener)listener).exitDekadiko(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PollaplasiasmosDiaireseiContext extends EkfrasiContext {
		public Token op;
		public List<EkfrasiContext> ekfrasi() {
			return getRuleContexts(EkfrasiContext.class);
		}
		public EkfrasiContext ekfrasi(int i) {
			return getRuleContext(EkfrasiContext.class,i);
		}
		public PollaplasiasmosDiaireseiContext(EkfrasiContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabloidListener ) ((TabloidListener)listener).enterPollaplasiasmosDiairesei(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabloidListener ) ((TabloidListener)listener).exitPollaplasiasmosDiairesei(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParentheseisContext extends EkfrasiContext {
		public EkfrasiContext ekfrasi() {
			return getRuleContext(EkfrasiContext.class,0);
		}
		public ParentheseisContext(EkfrasiContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabloidListener ) ((TabloidListener)listener).enterParentheseis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabloidListener ) ((TabloidListener)listener).exitParentheseis(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogikesPraxeisContext extends EkfrasiContext {
		public Token op;
		public List<EkfrasiContext> ekfrasi() {
			return getRuleContexts(EkfrasiContext.class);
		}
		public EkfrasiContext ekfrasi(int i) {
			return getRuleContext(EkfrasiContext.class,i);
		}
		public LogikesPraxeisContext(EkfrasiContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabloidListener ) ((TabloidListener)listener).enterLogikesPraxeis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabloidListener ) ((TabloidListener)listener).exitLogikesPraxeis(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SygkritikiEkfrasiContext extends EkfrasiContext {
		public List<EkfrasiContext> ekfrasi() {
			return getRuleContexts(EkfrasiContext.class);
		}
		public EkfrasiContext ekfrasi(int i) {
			return getRuleContext(EkfrasiContext.class,i);
		}
		public SygkritisContext sygkritis() {
			return getRuleContext(SygkritisContext.class,0);
		}
		public SygkritikiEkfrasiContext(EkfrasiContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabloidListener ) ((TabloidListener)listener).enterSygkritikiEkfrasi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabloidListener ) ((TabloidListener)listener).exitSygkritikiEkfrasi(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogikiTimhContext extends EkfrasiContext {
		public TerminalNode BOOL() { return getToken(TabloidParser.BOOL, 0); }
		public LogikiTimhContext(EkfrasiContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabloidListener ) ((TabloidListener)listener).enterLogikiTimh(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabloidListener ) ((TabloidListener)listener).exitLogikiTimh(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MetavlitiContext extends EkfrasiContext {
		public TerminalNode ID() { return getToken(TabloidParser.ID, 0); }
		public MetavlitiContext(EkfrasiContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabloidListener ) ((TabloidListener)listener).enterMetavliti(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabloidListener ) ((TabloidListener)listener).exitMetavliti(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ProsthesiAfairesiContext extends EkfrasiContext {
		public Token op;
		public List<EkfrasiContext> ekfrasi() {
			return getRuleContexts(EkfrasiContext.class);
		}
		public EkfrasiContext ekfrasi(int i) {
			return getRuleContext(EkfrasiContext.class,i);
		}
		public ProsthesiAfairesiContext(EkfrasiContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabloidListener ) ((TabloidListener)listener).enterProsthesiAfairesi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabloidListener ) ((TabloidListener)listener).exitProsthesiAfairesi(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EkfrasiKlisisContext extends EkfrasiContext {
		public KlhshContext klhsh() {
			return getRuleContext(KlhshContext.class,0);
		}
		public EkfrasiKlisisContext(EkfrasiContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabloidListener ) ((TabloidListener)listener).enterEkfrasiKlisis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabloidListener ) ((TabloidListener)listener).exitEkfrasiKlisis(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class KeimenoContext extends EkfrasiContext {
		public TerminalNode STRING() { return getToken(TabloidParser.STRING, 0); }
		public KeimenoContext(EkfrasiContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabloidListener ) ((TabloidListener)listener).enterKeimeno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabloidListener ) ((TabloidListener)listener).exitKeimeno(this);
		}
	}

	public final EkfrasiContext ekfrasi() throws RecognitionException {
		return ekfrasi(0);
	}

	private EkfrasiContext ekfrasi(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EkfrasiContext _localctx = new EkfrasiContext(_ctx, _parentState);
		EkfrasiContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_ekfrasi, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				_localctx = new ParentheseisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(141);
				match(T__35);
				setState(142);
				ekfrasi(0);
				setState(143);
				match(T__36);
				}
				break;
			case 2:
				{
				_localctx = new EkfrasiKlisisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(145);
				klhsh();
				}
				break;
			case 3:
				{
				_localctx = new AkeraioContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(146);
				match(INT);
				}
				break;
			case 4:
				{
				_localctx = new DekadikoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(147);
				match(FLOAT);
				}
				break;
			case 5:
				{
				_localctx = new KeimenoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(148);
				match(STRING);
				}
				break;
			case 6:
				{
				_localctx = new LogikiTimhContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(149);
				match(BOOL);
				}
				break;
			case 7:
				{
				_localctx = new MetavlitiContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(150);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(168);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(166);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new PollaplasiasmosDiaireseiContext(new EkfrasiContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_ekfrasi);
						setState(153);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(154);
						((PollaplasiasmosDiaireseiContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1056964608L) != 0)) ) {
							((PollaplasiasmosDiaireseiContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(155);
						ekfrasi(12);
						}
						break;
					case 2:
						{
						_localctx = new ProsthesiAfairesiContext(new EkfrasiContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_ekfrasi);
						setState(156);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(157);
						((ProsthesiAfairesiContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 16106127360L) != 0)) ) {
							((ProsthesiAfairesiContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(158);
						ekfrasi(11);
						}
						break;
					case 3:
						{
						_localctx = new LogikesPraxeisContext(new EkfrasiContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_ekfrasi);
						setState(159);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(160);
						((LogikesPraxeisContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__33 || _la==T__34) ) {
							((LogikesPraxeisContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(161);
						ekfrasi(10);
						}
						break;
					case 4:
						{
						_localctx = new SygkritikiEkfrasiContext(new EkfrasiContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_ekfrasi);
						setState(162);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(163);
						sygkritis();
						setState(164);
						ekfrasi(9);
						}
						break;
					}
					} 
				}
				setState(170);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 14:
			return ekfrasi_sempred((EkfrasiContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean ekfrasi_sempred(EkfrasiContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001,\u00ac\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0005\u0000"+
		" \b\u0000\n\u0000\f\u0000#\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u00010\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0003\u0005"+
		"?\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0004\u0006G\b\u0006\u000b\u0006\f\u0006H\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007P\b\u0007\n\u0007"+
		"\f\u0007S\t\u0007\u0001\b\u0001\b\u0001\b\u0003\bX\b\b\u0001\t\u0001\t"+
		"\u0001\t\u0005\t]\b\t\n\t\f\t`\t\t\u0001\n\u0001\n\u0001\n\u0004\ne\b"+
		"\n\u000b\n\f\nf\u0001\n\u0001\n\u0001\n\u0004\nl\b\n\u000b\n\f\nm\u0003"+
		"\np\b\n\u0003\nr\b\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0004\u000bz\b\u000b\u000b\u000b\f\u000b{\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0003\r\u008b\b\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0098\b\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005"+
		"\u000e\u00a7\b\u000e\n\u000e\f\u000e\u00aa\t\u000e\u0001\u000e\u0000\u0001"+
		"\u001c\u000f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u0000\u0004\u0001\u0000\u0005\u0006\u0001\u0000\u0018"+
		"\u001d\u0001\u0000\u001e!\u0001\u0000\"#\u00bf\u0000!\u0001\u0000\u0000"+
		"\u0000\u0002/\u0001\u0000\u0000\u0000\u00041\u0001\u0000\u0000\u0000\u0006"+
		"6\u0001\u0000\u0000\u0000\b9\u0001\u0000\u0000\u0000\n<\u0001\u0000\u0000"+
		"\u0000\f@\u0001\u0000\u0000\u0000\u000eL\u0001\u0000\u0000\u0000\u0010"+
		"T\u0001\u0000\u0000\u0000\u0012Y\u0001\u0000\u0000\u0000\u0014a\u0001"+
		"\u0000\u0000\u0000\u0016u\u0001\u0000\u0000\u0000\u0018\u007f\u0001\u0000"+
		"\u0000\u0000\u001a\u008a\u0001\u0000\u0000\u0000\u001c\u0097\u0001\u0000"+
		"\u0000\u0000\u001e \u0003\u0002\u0001\u0000\u001f\u001e\u0001\u0000\u0000"+
		"\u0000 #\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000!\"\u0001"+
		"\u0000\u0000\u0000\"$\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000"+
		"$%\u0005\u0000\u0000\u0001%\u0001\u0001\u0000\u0000\u0000&0\u0003\u0004"+
		"\u0002\u0000\'0\u0003\u0006\u0003\u0000(0\u0003\b\u0004\u0000)0\u0003"+
		"\n\u0005\u0000*0\u0003\f\u0006\u0000+0\u0003\u0010\b\u0000,0\u0003\u0014"+
		"\n\u0000-0\u0003\u0016\u000b\u0000.0\u0005\u0001\u0000\u0000/&\u0001\u0000"+
		"\u0000\u0000/\'\u0001\u0000\u0000\u0000/(\u0001\u0000\u0000\u0000/)\u0001"+
		"\u0000\u0000\u0000/*\u0001\u0000\u0000\u0000/+\u0001\u0000\u0000\u0000"+
		"/,\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000\u0000/.\u0001\u0000\u0000"+
		"\u00000\u0003\u0001\u0000\u0000\u000012\u0005\u0002\u0000\u000023\u0005"+
		"&\u0000\u000034\u0005\u0003\u0000\u000045\u0003\u001c\u000e\u00005\u0005"+
		"\u0001\u0000\u0000\u000067\u0005\u0004\u0000\u000078\u0003\u001c\u000e"+
		"\u00008\u0007\u0001\u0000\u0000\u00009:\u0007\u0000\u0000\u0000:;\u0005"+
		"&\u0000\u0000;\t\u0001\u0000\u0000\u0000<>\u0005\u0007\u0000\u0000=?\u0003"+
		"\u001c\u000e\u0000>=\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000"+
		"?\u000b\u0001\u0000\u0000\u0000@A\u0005\b\u0000\u0000AB\u0005&\u0000\u0000"+
		"BC\u0005\t\u0000\u0000CD\u0003\u000e\u0007\u0000DF\u0005\n\u0000\u0000"+
		"EG\u0003\u0002\u0001\u0000FE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000"+
		"\u0000HF\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000IJ\u0001\u0000"+
		"\u0000\u0000JK\u0005\u000b\u0000\u0000K\r\u0001\u0000\u0000\u0000LQ\u0005"+
		"&\u0000\u0000MN\u0005\f\u0000\u0000NP\u0005&\u0000\u0000OM\u0001\u0000"+
		"\u0000\u0000PS\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000QR\u0001"+
		"\u0000\u0000\u0000R\u000f\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000"+
		"\u0000TU\u0005&\u0000\u0000UW\u0005\r\u0000\u0000VX\u0003\u0012\t\u0000"+
		"WV\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000X\u0011\u0001\u0000"+
		"\u0000\u0000Y^\u0003\u001c\u000e\u0000Z[\u0005\f\u0000\u0000[]\u0003\u001c"+
		"\u000e\u0000\\Z\u0001\u0000\u0000\u0000]`\u0001\u0000\u0000\u0000^\\\u0001"+
		"\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_\u0013\u0001\u0000\u0000"+
		"\u0000`^\u0001\u0000\u0000\u0000ab\u0005\u000e\u0000\u0000bd\u0003\u0018"+
		"\f\u0000ce\u0003\u0002\u0001\u0000dc\u0001\u0000\u0000\u0000ef\u0001\u0000"+
		"\u0000\u0000fd\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000gq\u0001"+
		"\u0000\u0000\u0000ho\u0005\u000f\u0000\u0000ik\u0005\n\u0000\u0000jl\u0003"+
		"\u0002\u0001\u0000kj\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000"+
		"mk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000np\u0001\u0000\u0000"+
		"\u0000oi\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000pr\u0001\u0000"+
		"\u0000\u0000qh\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000rs\u0001"+
		"\u0000\u0000\u0000st\u0005\u000b\u0000\u0000t\u0015\u0001\u0000\u0000"+
		"\u0000uv\u0005\u0010\u0000\u0000vw\u0003\u0018\f\u0000wy\u0005\n\u0000"+
		"\u0000xz\u0003\u0002\u0001\u0000yx\u0001\u0000\u0000\u0000z{\u0001\u0000"+
		"\u0000\u0000{y\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|}\u0001"+
		"\u0000\u0000\u0000}~\u0005\u000b\u0000\u0000~\u0017\u0001\u0000\u0000"+
		"\u0000\u007f\u0080\u0003\u001c\u000e\u0000\u0080\u0081\u0003\u001a\r\u0000"+
		"\u0081\u0082\u0003\u001c\u000e\u0000\u0082\u0019\u0001\u0000\u0000\u0000"+
		"\u0083\u008b\u0005\u0011\u0000\u0000\u0084\u008b\u0005\u0012\u0000\u0000"+
		"\u0085\u008b\u0005\u0013\u0000\u0000\u0086\u008b\u0005\u0014\u0000\u0000"+
		"\u0087\u008b\u0005\u0015\u0000\u0000\u0088\u008b\u0005\u0016\u0000\u0000"+
		"\u0089\u008b\u0005\u0017\u0000\u0000\u008a\u0083\u0001\u0000\u0000\u0000"+
		"\u008a\u0084\u0001\u0000\u0000\u0000\u008a\u0085\u0001\u0000\u0000\u0000"+
		"\u008a\u0086\u0001\u0000\u0000\u0000\u008a\u0087\u0001\u0000\u0000\u0000"+
		"\u008a\u0088\u0001\u0000\u0000\u0000\u008a\u0089\u0001\u0000\u0000\u0000"+
		"\u008b\u001b\u0001\u0000\u0000\u0000\u008c\u008d\u0006\u000e\uffff\uffff"+
		"\u0000\u008d\u008e\u0005$\u0000\u0000\u008e\u008f\u0003\u001c\u000e\u0000"+
		"\u008f\u0090\u0005%\u0000\u0000\u0090\u0098\u0001\u0000\u0000\u0000\u0091"+
		"\u0098\u0003\u0010\b\u0000\u0092\u0098\u0005\'\u0000\u0000\u0093\u0098"+
		"\u0005(\u0000\u0000\u0094\u0098\u0005)\u0000\u0000\u0095\u0098\u0005*"+
		"\u0000\u0000\u0096\u0098\u0005&\u0000\u0000\u0097\u008c\u0001\u0000\u0000"+
		"\u0000\u0097\u0091\u0001\u0000\u0000\u0000\u0097\u0092\u0001\u0000\u0000"+
		"\u0000\u0097\u0093\u0001\u0000\u0000\u0000\u0097\u0094\u0001\u0000\u0000"+
		"\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0097\u0096\u0001\u0000\u0000"+
		"\u0000\u0098\u00a8\u0001\u0000\u0000\u0000\u0099\u009a\n\u000b\u0000\u0000"+
		"\u009a\u009b\u0007\u0001\u0000\u0000\u009b\u00a7\u0003\u001c\u000e\f\u009c"+
		"\u009d\n\n\u0000\u0000\u009d\u009e\u0007\u0002\u0000\u0000\u009e\u00a7"+
		"\u0003\u001c\u000e\u000b\u009f\u00a0\n\t\u0000\u0000\u00a0\u00a1\u0007"+
		"\u0003\u0000\u0000\u00a1\u00a7\u0003\u001c\u000e\n\u00a2\u00a3\n\b\u0000"+
		"\u0000\u00a3\u00a4\u0003\u001a\r\u0000\u00a4\u00a5\u0003\u001c\u000e\t"+
		"\u00a5\u00a7\u0001\u0000\u0000\u0000\u00a6\u0099\u0001\u0000\u0000\u0000"+
		"\u00a6\u009c\u0001\u0000\u0000\u0000\u00a6\u009f\u0001\u0000\u0000\u0000"+
		"\u00a6\u00a2\u0001\u0000\u0000\u0000\u00a7\u00aa\u0001\u0000\u0000\u0000"+
		"\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000"+
		"\u00a9\u001d\u0001\u0000\u0000\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000"+
		"\u0010!/>HQW^fmoq{\u008a\u0097\u00a6\u00a8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}