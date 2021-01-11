// Generated from D:/学习/编译原理/研究性学习/MarkdownParser/src\markdown.g4 by ANTLR 4.9
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class markdownParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SHARP=1, SPACE=2, STAR=3, GT=4, DOT=5, ZERO=6, UPPERDOT=7, TAB=8, NEWLINE=9, 
		POSDIGIT=10, CHARACTER=11, OTHERSYMBOL=12;
	public static final int
		RULE_prog = 0, RULE_title = 1, RULE_main_title = 2, RULE_sub_title = 3, 
		RULE_list = 4, RULE_listline = 5, RULE_referblock = 6, RULE_referline = 7, 
		RULE_codeblock = 8, RULE_text = 9, RULE_symbols = 10, RULE_line = 11, 
		RULE_words = 12, RULE_codes = 13, RULE_inlinebold = 14, RULE_inlineitalic = 15, 
		RULE_inlinespace = 16, RULE_number = 17, RULE_singledigit = 18, RULE_newline = 19, 
		RULE_character = 20, RULE_othersymbol = 21, RULE_tab = 22, RULE_dot = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "title", "main_title", "sub_title", "list", "listline", "referblock", 
			"referline", "codeblock", "text", "symbols", "line", "words", "codes", 
			"inlinebold", "inlineitalic", "inlinespace", "number", "singledigit", 
			"newline", "character", "othersymbol", "tab", "dot"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'#'", "' '", "'*'", "'>'", "'.'", "'0'", "'`'", "'\t'", "'\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SHARP", "SPACE", "STAR", "GT", "DOT", "ZERO", "UPPERDOT", "TAB", 
			"NEWLINE", "POSDIGIT", "CHARACTER", "OTHERSYMBOL"
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
	public String getGrammarFileName() { return "markdown.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public markdownParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public List<ReferblockContext> referblock() {
			return getRuleContexts(ReferblockContext.class);
		}
		public ReferblockContext referblock(int i) {
			return getRuleContext(ReferblockContext.class,i);
		}
		public List<CodeblockContext> codeblock() {
			return getRuleContexts(CodeblockContext.class);
		}
		public CodeblockContext codeblock(int i) {
			return getRuleContext(CodeblockContext.class,i);
		}
		public List<ListContext> list() {
			return getRuleContexts(ListContext.class);
		}
		public ListContext list(int i) {
			return getRuleContext(ListContext.class,i);
		}
		public List<TitleContext> title() {
			return getRuleContexts(TitleContext.class);
		}
		public TitleContext title(int i) {
			return getRuleContext(TitleContext.class,i);
		}
		public List<TextContext> text() {
			return getRuleContexts(TextContext.class);
		}
		public TextContext text(int i) {
			return getRuleContext(TextContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof markdownListener ) ((markdownListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof markdownListener ) ((markdownListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof markdownVisitor ) return ((markdownVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SHARP) | (1L << SPACE) | (1L << STAR) | (1L << GT) | (1L << DOT) | (1L << ZERO) | (1L << UPPERDOT) | (1L << TAB) | (1L << NEWLINE) | (1L << POSDIGIT) | (1L << CHARACTER) | (1L << OTHERSYMBOL))) != 0)) {
				{
				setState(53);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(48);
					referblock();
					}
					break;
				case 2:
					{
					setState(49);
					codeblock();
					}
					break;
				case 3:
					{
					setState(50);
					list();
					}
					break;
				case 4:
					{
					setState(51);
					title();
					}
					break;
				case 5:
					{
					setState(52);
					text();
					}
					break;
				}
				}
				setState(57);
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

	public static class TitleContext extends ParserRuleContext {
		public Main_titleContext main_title() {
			return getRuleContext(Main_titleContext.class,0);
		}
		public Sub_titleContext sub_title() {
			return getRuleContext(Sub_titleContext.class,0);
		}
		public TitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_title; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof markdownListener ) ((markdownListener)listener).enterTitle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof markdownListener ) ((markdownListener)listener).exitTitle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof markdownVisitor ) return ((markdownVisitor<? extends T>)visitor).visitTitle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TitleContext title() throws RecognitionException {
		TitleContext _localctx = new TitleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_title);
		try {
			setState(60);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				main_title();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				sub_title();
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

	public static class Main_titleContext extends ParserRuleContext {
		public TerminalNode SHARP() { return getToken(markdownParser.SHARP, 0); }
		public TerminalNode SPACE() { return getToken(markdownParser.SPACE, 0); }
		public WordsContext words() {
			return getRuleContext(WordsContext.class,0);
		}
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public Main_titleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_title; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof markdownListener ) ((markdownListener)listener).enterMain_title(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof markdownListener ) ((markdownListener)listener).exitMain_title(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof markdownVisitor ) return ((markdownVisitor<? extends T>)visitor).visitMain_title(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Main_titleContext main_title() throws RecognitionException {
		Main_titleContext _localctx = new Main_titleContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_main_title);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(SHARP);
			setState(63);
			match(SPACE);
			setState(64);
			words();
			setState(65);
			newline();
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

	public static class Sub_titleContext extends ParserRuleContext {
		public List<TerminalNode> SHARP() { return getTokens(markdownParser.SHARP); }
		public TerminalNode SHARP(int i) {
			return getToken(markdownParser.SHARP, i);
		}
		public TerminalNode SPACE() { return getToken(markdownParser.SPACE, 0); }
		public WordsContext words() {
			return getRuleContext(WordsContext.class,0);
		}
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public Sub_titleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sub_title; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof markdownListener ) ((markdownListener)listener).enterSub_title(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof markdownListener ) ((markdownListener)listener).exitSub_title(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof markdownVisitor ) return ((markdownVisitor<? extends T>)visitor).visitSub_title(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sub_titleContext sub_title() throws RecognitionException {
		Sub_titleContext _localctx = new Sub_titleContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sub_title);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(SHARP);
			setState(68);
			match(SHARP);
			setState(69);
			match(SPACE);
			setState(70);
			words();
			setState(71);
			newline();
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

	public static class ListContext extends ParserRuleContext {
		public ListlineContext listline() {
			return getRuleContext(ListlineContext.class,0);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof markdownListener ) ((markdownListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof markdownListener ) ((markdownListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof markdownVisitor ) return ((markdownVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			listline();
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

	public static class ListlineContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode DOT() { return getToken(markdownParser.DOT, 0); }
		public TerminalNode SPACE() { return getToken(markdownParser.SPACE, 0); }
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public List<TabContext> tab() {
			return getRuleContexts(TabContext.class);
		}
		public TabContext tab(int i) {
			return getRuleContext(TabContext.class,i);
		}
		public ListlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof markdownListener ) ((markdownListener)listener).enterListline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof markdownListener ) ((markdownListener)listener).exitListline(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof markdownVisitor ) return ((markdownVisitor<? extends T>)visitor).visitListline(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListlineContext listline() throws RecognitionException {
		ListlineContext _localctx = new ListlineContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_listline);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TAB) {
				{
				{
				setState(75);
				tab();
				}
				}
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(81);
			number();
			setState(82);
			match(DOT);
			setState(83);
			match(SPACE);
			setState(84);
			line();
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

	public static class ReferblockContext extends ParserRuleContext {
		public List<ReferlineContext> referline() {
			return getRuleContexts(ReferlineContext.class);
		}
		public ReferlineContext referline(int i) {
			return getRuleContext(ReferlineContext.class,i);
		}
		public ReferblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof markdownListener ) ((markdownListener)listener).enterReferblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof markdownListener ) ((markdownListener)listener).exitReferblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof markdownVisitor ) return ((markdownVisitor<? extends T>)visitor).visitReferblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferblockContext referblock() throws RecognitionException {
		ReferblockContext _localctx = new ReferblockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_referblock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(87); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(86);
					referline();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(89); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class ReferlineContext extends ParserRuleContext {
		public TerminalNode GT() { return getToken(markdownParser.GT, 0); }
		public TerminalNode SPACE() { return getToken(markdownParser.SPACE, 0); }
		public WordsContext words() {
			return getRuleContext(WordsContext.class,0);
		}
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public ReferlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof markdownListener ) ((markdownListener)listener).enterReferline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof markdownListener ) ((markdownListener)listener).exitReferline(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof markdownVisitor ) return ((markdownVisitor<? extends T>)visitor).visitReferline(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferlineContext referline() throws RecognitionException {
		ReferlineContext _localctx = new ReferlineContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_referline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(GT);
			setState(92);
			match(SPACE);
			setState(93);
			words();
			setState(94);
			newline();
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

	public static class CodeblockContext extends ParserRuleContext {
		public List<TerminalNode> UPPERDOT() { return getTokens(markdownParser.UPPERDOT); }
		public TerminalNode UPPERDOT(int i) {
			return getToken(markdownParser.UPPERDOT, i);
		}
		public List<NewlineContext> newline() {
			return getRuleContexts(NewlineContext.class);
		}
		public NewlineContext newline(int i) {
			return getRuleContext(NewlineContext.class,i);
		}
		public List<InlinespaceContext> inlinespace() {
			return getRuleContexts(InlinespaceContext.class);
		}
		public InlinespaceContext inlinespace(int i) {
			return getRuleContext(InlinespaceContext.class,i);
		}
		public List<CodesContext> codes() {
			return getRuleContexts(CodesContext.class);
		}
		public CodesContext codes(int i) {
			return getRuleContext(CodesContext.class,i);
		}
		public CodeblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof markdownListener ) ((markdownListener)listener).enterCodeblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof markdownListener ) ((markdownListener)listener).exitCodeblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof markdownVisitor ) return ((markdownVisitor<? extends T>)visitor).visitCodeblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeblockContext codeblock() throws RecognitionException {
		CodeblockContext _localctx = new CodeblockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_codeblock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(UPPERDOT);
			setState(97);
			match(UPPERDOT);
			setState(98);
			match(UPPERDOT);
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE || _la==TAB) {
				{
				{
				setState(99);
				inlinespace();
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(105);
			newline();
			setState(110);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(108);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case SHARP:
					case SPACE:
					case STAR:
					case DOT:
					case ZERO:
					case TAB:
					case POSDIGIT:
					case CHARACTER:
					case OTHERSYMBOL:
						{
						setState(106);
						codes();
						}
						break;
					case NEWLINE:
						{
						setState(107);
						newline();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(112);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(113);
			newline();
			setState(114);
			match(UPPERDOT);
			setState(115);
			match(UPPERDOT);
			setState(116);
			match(UPPERDOT);
			setState(117);
			inlinespace();
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

	public static class TextContext extends ParserRuleContext {
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof markdownListener ) ((markdownListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof markdownListener ) ((markdownListener)listener).exitText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof markdownVisitor ) return ((markdownVisitor<? extends T>)visitor).visitText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_text);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			line();
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

	public static class SymbolsContext extends ParserRuleContext {
		public TerminalNode SHARP() { return getToken(markdownParser.SHARP, 0); }
		public TerminalNode STAR() { return getToken(markdownParser.STAR, 0); }
		public TerminalNode OTHERSYMBOL() { return getToken(markdownParser.OTHERSYMBOL, 0); }
		public TerminalNode DOT() { return getToken(markdownParser.DOT, 0); }
		public SymbolsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbols; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof markdownListener ) ((markdownListener)listener).enterSymbols(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof markdownListener ) ((markdownListener)listener).exitSymbols(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof markdownVisitor ) return ((markdownVisitor<? extends T>)visitor).visitSymbols(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SymbolsContext symbols() throws RecognitionException {
		SymbolsContext _localctx = new SymbolsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_symbols);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SHARP) | (1L << STAR) | (1L << DOT) | (1L << OTHERSYMBOL))) != 0)) ) {
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

	public static class LineContext extends ParserRuleContext {
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public List<InlineboldContext> inlinebold() {
			return getRuleContexts(InlineboldContext.class);
		}
		public InlineboldContext inlinebold(int i) {
			return getRuleContext(InlineboldContext.class,i);
		}
		public List<InlineitalicContext> inlineitalic() {
			return getRuleContexts(InlineitalicContext.class);
		}
		public InlineitalicContext inlineitalic(int i) {
			return getRuleContext(InlineitalicContext.class,i);
		}
		public List<WordsContext> words() {
			return getRuleContexts(WordsContext.class);
		}
		public WordsContext words(int i) {
			return getRuleContext(WordsContext.class,i);
		}
		public List<InlinespaceContext> inlinespace() {
			return getRuleContexts(InlinespaceContext.class);
		}
		public InlinespaceContext inlinespace(int i) {
			return getRuleContext(InlinespaceContext.class,i);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof markdownListener ) ((markdownListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof markdownListener ) ((markdownListener)listener).exitLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof markdownVisitor ) return ((markdownVisitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << STAR) | (1L << DOT) | (1L << ZERO) | (1L << TAB) | (1L << POSDIGIT) | (1L << CHARACTER) | (1L << OTHERSYMBOL))) != 0)) {
				{
				setState(127);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(123);
					inlinebold();
					}
					break;
				case 2:
					{
					setState(124);
					inlineitalic();
					}
					break;
				case 3:
					{
					setState(125);
					words();
					}
					break;
				case 4:
					{
					setState(126);
					inlinespace();
					}
					break;
				}
				}
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(132);
			newline();
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

	public static class WordsContext extends ParserRuleContext {
		public List<CharacterContext> character() {
			return getRuleContexts(CharacterContext.class);
		}
		public CharacterContext character(int i) {
			return getRuleContext(CharacterContext.class,i);
		}
		public List<SingledigitContext> singledigit() {
			return getRuleContexts(SingledigitContext.class);
		}
		public SingledigitContext singledigit(int i) {
			return getRuleContext(SingledigitContext.class,i);
		}
		public List<OthersymbolContext> othersymbol() {
			return getRuleContexts(OthersymbolContext.class);
		}
		public OthersymbolContext othersymbol(int i) {
			return getRuleContext(OthersymbolContext.class,i);
		}
		public List<InlinespaceContext> inlinespace() {
			return getRuleContexts(InlinespaceContext.class);
		}
		public InlinespaceContext inlinespace(int i) {
			return getRuleContext(InlinespaceContext.class,i);
		}
		public List<DotContext> dot() {
			return getRuleContexts(DotContext.class);
		}
		public DotContext dot(int i) {
			return getRuleContext(DotContext.class,i);
		}
		public WordsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_words; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof markdownListener ) ((markdownListener)listener).enterWords(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof markdownListener ) ((markdownListener)listener).exitWords(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof markdownVisitor ) return ((markdownVisitor<? extends T>)visitor).visitWords(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WordsContext words() throws RecognitionException {
		WordsContext _localctx = new WordsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_words);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(139); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(139);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case CHARACTER:
						{
						setState(134);
						character();
						}
						break;
					case ZERO:
					case POSDIGIT:
						{
						setState(135);
						singledigit();
						}
						break;
					case OTHERSYMBOL:
						{
						setState(136);
						othersymbol();
						}
						break;
					case SPACE:
					case TAB:
						{
						setState(137);
						inlinespace();
						}
						break;
					case DOT:
						{
						setState(138);
						dot();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(141); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class CodesContext extends ParserRuleContext {
		public List<CharacterContext> character() {
			return getRuleContexts(CharacterContext.class);
		}
		public CharacterContext character(int i) {
			return getRuleContext(CharacterContext.class,i);
		}
		public List<SingledigitContext> singledigit() {
			return getRuleContexts(SingledigitContext.class);
		}
		public SingledigitContext singledigit(int i) {
			return getRuleContext(SingledigitContext.class,i);
		}
		public List<SymbolsContext> symbols() {
			return getRuleContexts(SymbolsContext.class);
		}
		public SymbolsContext symbols(int i) {
			return getRuleContext(SymbolsContext.class,i);
		}
		public List<InlinespaceContext> inlinespace() {
			return getRuleContexts(InlinespaceContext.class);
		}
		public InlinespaceContext inlinespace(int i) {
			return getRuleContext(InlinespaceContext.class,i);
		}
		public CodesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof markdownListener ) ((markdownListener)listener).enterCodes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof markdownListener ) ((markdownListener)listener).exitCodes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof markdownVisitor ) return ((markdownVisitor<? extends T>)visitor).visitCodes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodesContext codes() throws RecognitionException {
		CodesContext _localctx = new CodesContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_codes);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(147); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(147);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case CHARACTER:
						{
						setState(143);
						character();
						}
						break;
					case ZERO:
					case POSDIGIT:
						{
						setState(144);
						singledigit();
						}
						break;
					case SHARP:
					case STAR:
					case DOT:
					case OTHERSYMBOL:
						{
						setState(145);
						symbols();
						}
						break;
					case SPACE:
					case TAB:
						{
						setState(146);
						inlinespace();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(149); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class InlineboldContext extends ParserRuleContext {
		public List<TerminalNode> STAR() { return getTokens(markdownParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(markdownParser.STAR, i);
		}
		public WordsContext words() {
			return getRuleContext(WordsContext.class,0);
		}
		public InlineboldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlinebold; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof markdownListener ) ((markdownListener)listener).enterInlinebold(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof markdownListener ) ((markdownListener)listener).exitInlinebold(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof markdownVisitor ) return ((markdownVisitor<? extends T>)visitor).visitInlinebold(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InlineboldContext inlinebold() throws RecognitionException {
		InlineboldContext _localctx = new InlineboldContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_inlinebold);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(STAR);
			setState(152);
			match(STAR);
			setState(153);
			words();
			setState(154);
			match(STAR);
			setState(155);
			match(STAR);
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

	public static class InlineitalicContext extends ParserRuleContext {
		public List<TerminalNode> STAR() { return getTokens(markdownParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(markdownParser.STAR, i);
		}
		public WordsContext words() {
			return getRuleContext(WordsContext.class,0);
		}
		public InlineitalicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineitalic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof markdownListener ) ((markdownListener)listener).enterInlineitalic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof markdownListener ) ((markdownListener)listener).exitInlineitalic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof markdownVisitor ) return ((markdownVisitor<? extends T>)visitor).visitInlineitalic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InlineitalicContext inlineitalic() throws RecognitionException {
		InlineitalicContext _localctx = new InlineitalicContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_inlineitalic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(STAR);
			setState(158);
			words();
			setState(159);
			match(STAR);
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

	public static class InlinespaceContext extends ParserRuleContext {
		public TerminalNode SPACE() { return getToken(markdownParser.SPACE, 0); }
		public TabContext tab() {
			return getRuleContext(TabContext.class,0);
		}
		public InlinespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlinespace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof markdownListener ) ((markdownListener)listener).enterInlinespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof markdownListener ) ((markdownListener)listener).exitInlinespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof markdownVisitor ) return ((markdownVisitor<? extends T>)visitor).visitInlinespace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InlinespaceContext inlinespace() throws RecognitionException {
		InlinespaceContext _localctx = new InlinespaceContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_inlinespace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SPACE:
				{
				setState(161);
				match(SPACE);
				}
				break;
			case TAB:
				{
				setState(162);
				tab();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class NumberContext extends ParserRuleContext {
		public List<TerminalNode> ZERO() { return getTokens(markdownParser.ZERO); }
		public TerminalNode ZERO(int i) {
			return getToken(markdownParser.ZERO, i);
		}
		public List<TerminalNode> POSDIGIT() { return getTokens(markdownParser.POSDIGIT); }
		public TerminalNode POSDIGIT(int i) {
			return getToken(markdownParser.POSDIGIT, i);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof markdownListener ) ((markdownListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof markdownListener ) ((markdownListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof markdownVisitor ) return ((markdownVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ZERO:
				{
				setState(165);
				match(ZERO);
				}
				break;
			case POSDIGIT:
				{
				setState(166);
				match(POSDIGIT);
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ZERO || _la==POSDIGIT) {
					{
					{
					setState(167);
					_la = _input.LA(1);
					if ( !(_la==ZERO || _la==POSDIGIT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(172);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class SingledigitContext extends ParserRuleContext {
		public TerminalNode ZERO() { return getToken(markdownParser.ZERO, 0); }
		public TerminalNode POSDIGIT() { return getToken(markdownParser.POSDIGIT, 0); }
		public SingledigitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singledigit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof markdownListener ) ((markdownListener)listener).enterSingledigit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof markdownListener ) ((markdownListener)listener).exitSingledigit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof markdownVisitor ) return ((markdownVisitor<? extends T>)visitor).visitSingledigit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingledigitContext singledigit() throws RecognitionException {
		SingledigitContext _localctx = new SingledigitContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_singledigit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			_la = _input.LA(1);
			if ( !(_la==ZERO || _la==POSDIGIT) ) {
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

	public static class NewlineContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(markdownParser.NEWLINE, 0); }
		public NewlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof markdownListener ) ((markdownListener)listener).enterNewline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof markdownListener ) ((markdownListener)listener).exitNewline(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof markdownVisitor ) return ((markdownVisitor<? extends T>)visitor).visitNewline(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewlineContext newline() throws RecognitionException {
		NewlineContext _localctx = new NewlineContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_newline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(NEWLINE);
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

	public static class CharacterContext extends ParserRuleContext {
		public TerminalNode CHARACTER() { return getToken(markdownParser.CHARACTER, 0); }
		public CharacterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_character; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof markdownListener ) ((markdownListener)listener).enterCharacter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof markdownListener ) ((markdownListener)listener).exitCharacter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof markdownVisitor ) return ((markdownVisitor<? extends T>)visitor).visitCharacter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharacterContext character() throws RecognitionException {
		CharacterContext _localctx = new CharacterContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_character);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(CHARACTER);
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

	public static class OthersymbolContext extends ParserRuleContext {
		public TerminalNode OTHERSYMBOL() { return getToken(markdownParser.OTHERSYMBOL, 0); }
		public OthersymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_othersymbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof markdownListener ) ((markdownListener)listener).enterOthersymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof markdownListener ) ((markdownListener)listener).exitOthersymbol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof markdownVisitor ) return ((markdownVisitor<? extends T>)visitor).visitOthersymbol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OthersymbolContext othersymbol() throws RecognitionException {
		OthersymbolContext _localctx = new OthersymbolContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_othersymbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(OTHERSYMBOL);
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

	public static class TabContext extends ParserRuleContext {
		public TerminalNode TAB() { return getToken(markdownParser.TAB, 0); }
		public TabContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tab; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof markdownListener ) ((markdownListener)listener).enterTab(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof markdownListener ) ((markdownListener)listener).exitTab(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof markdownVisitor ) return ((markdownVisitor<? extends T>)visitor).visitTab(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TabContext tab() throws RecognitionException {
		TabContext _localctx = new TabContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_tab);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(TAB);
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

	public static class DotContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(markdownParser.DOT, 0); }
		public DotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof markdownListener ) ((markdownListener)listener).enterDot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof markdownListener ) ((markdownListener)listener).exitDot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof markdownVisitor ) return ((markdownVisitor<? extends T>)visitor).visitDot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DotContext dot() throws RecognitionException {
		DotContext _localctx = new DotContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_dot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(DOT);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\16\u00be\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\2\3\2\3\2\7\28\n\2\f\2\16\2;\13\2\3\3\3\3\5\3?\n\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\7\7O\n\7\f\7\16\7R\13"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\b\6\bZ\n\b\r\b\16\b[\3\t\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\7\ng\n\n\f\n\16\nj\13\n\3\n\3\n\3\n\7\no\n\n\f\n\16\nr\13"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\7\r\u0082"+
		"\n\r\f\r\16\r\u0085\13\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\6\16\u008e\n"+
		"\16\r\16\16\16\u008f\3\17\3\17\3\17\3\17\6\17\u0096\n\17\r\17\16\17\u0097"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\5\22\u00a6"+
		"\n\22\3\23\3\23\3\23\7\23\u00ab\n\23\f\23\16\23\u00ae\13\23\5\23\u00b0"+
		"\n\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31"+
		"\2\2\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\2\4\6\2\3\3"+
		"\5\5\7\7\16\16\4\2\b\b\f\f\2\u00c0\29\3\2\2\2\4>\3\2\2\2\6@\3\2\2\2\b"+
		"E\3\2\2\2\nK\3\2\2\2\fP\3\2\2\2\16Y\3\2\2\2\20]\3\2\2\2\22b\3\2\2\2\24"+
		"y\3\2\2\2\26{\3\2\2\2\30\u0083\3\2\2\2\32\u008d\3\2\2\2\34\u0095\3\2\2"+
		"\2\36\u0099\3\2\2\2 \u009f\3\2\2\2\"\u00a5\3\2\2\2$\u00af\3\2\2\2&\u00b1"+
		"\3\2\2\2(\u00b3\3\2\2\2*\u00b5\3\2\2\2,\u00b7\3\2\2\2.\u00b9\3\2\2\2\60"+
		"\u00bb\3\2\2\2\628\5\16\b\2\638\5\22\n\2\648\5\n\6\2\658\5\4\3\2\668\5"+
		"\24\13\2\67\62\3\2\2\2\67\63\3\2\2\2\67\64\3\2\2\2\67\65\3\2\2\2\67\66"+
		"\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:\3\3\2\2\2;9\3\2\2\2<?\5\6\4"+
		"\2=?\5\b\5\2><\3\2\2\2>=\3\2\2\2?\5\3\2\2\2@A\7\3\2\2AB\7\4\2\2BC\5\32"+
		"\16\2CD\5(\25\2D\7\3\2\2\2EF\7\3\2\2FG\7\3\2\2GH\7\4\2\2HI\5\32\16\2I"+
		"J\5(\25\2J\t\3\2\2\2KL\5\f\7\2L\13\3\2\2\2MO\5.\30\2NM\3\2\2\2OR\3\2\2"+
		"\2PN\3\2\2\2PQ\3\2\2\2QS\3\2\2\2RP\3\2\2\2ST\5$\23\2TU\7\7\2\2UV\7\4\2"+
		"\2VW\5\30\r\2W\r\3\2\2\2XZ\5\20\t\2YX\3\2\2\2Z[\3\2\2\2[Y\3\2\2\2[\\\3"+
		"\2\2\2\\\17\3\2\2\2]^\7\6\2\2^_\7\4\2\2_`\5\32\16\2`a\5(\25\2a\21\3\2"+
		"\2\2bc\7\t\2\2cd\7\t\2\2dh\7\t\2\2eg\5\"\22\2fe\3\2\2\2gj\3\2\2\2hf\3"+
		"\2\2\2hi\3\2\2\2ik\3\2\2\2jh\3\2\2\2kp\5(\25\2lo\5\34\17\2mo\5(\25\2n"+
		"l\3\2\2\2nm\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2qs\3\2\2\2rp\3\2\2\2"+
		"st\5(\25\2tu\7\t\2\2uv\7\t\2\2vw\7\t\2\2wx\5\"\22\2x\23\3\2\2\2yz\5\30"+
		"\r\2z\25\3\2\2\2{|\t\2\2\2|\27\3\2\2\2}\u0082\5\36\20\2~\u0082\5 \21\2"+
		"\177\u0082\5\32\16\2\u0080\u0082\5\"\22\2\u0081}\3\2\2\2\u0081~\3\2\2"+
		"\2\u0081\177\3\2\2\2\u0081\u0080\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081"+
		"\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0086\3\2\2\2\u0085\u0083\3\2\2\2\u0086"+
		"\u0087\5(\25\2\u0087\31\3\2\2\2\u0088\u008e\5*\26\2\u0089\u008e\5&\24"+
		"\2\u008a\u008e\5,\27\2\u008b\u008e\5\"\22\2\u008c\u008e\5\60\31\2\u008d"+
		"\u0088\3\2\2\2\u008d\u0089\3\2\2\2\u008d\u008a\3\2\2\2\u008d\u008b\3\2"+
		"\2\2\u008d\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u008d\3\2\2\2\u008f"+
		"\u0090\3\2\2\2\u0090\33\3\2\2\2\u0091\u0096\5*\26\2\u0092\u0096\5&\24"+
		"\2\u0093\u0096\5\26\f\2\u0094\u0096\5\"\22\2\u0095\u0091\3\2\2\2\u0095"+
		"\u0092\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0094\3\2\2\2\u0096\u0097\3\2"+
		"\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\35\3\2\2\2\u0099\u009a"+
		"\7\5\2\2\u009a\u009b\7\5\2\2\u009b\u009c\5\32\16\2\u009c\u009d\7\5\2\2"+
		"\u009d\u009e\7\5\2\2\u009e\37\3\2\2\2\u009f\u00a0\7\5\2\2\u00a0\u00a1"+
		"\5\32\16\2\u00a1\u00a2\7\5\2\2\u00a2!\3\2\2\2\u00a3\u00a6\7\4\2\2\u00a4"+
		"\u00a6\5.\30\2\u00a5\u00a3\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6#\3\2\2\2"+
		"\u00a7\u00b0\7\b\2\2\u00a8\u00ac\7\f\2\2\u00a9\u00ab\t\3\2\2\u00aa\u00a9"+
		"\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad"+
		"\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00a7\3\2\2\2\u00af\u00a8\3\2"+
		"\2\2\u00b0%\3\2\2\2\u00b1\u00b2\t\3\2\2\u00b2\'\3\2\2\2\u00b3\u00b4\7"+
		"\13\2\2\u00b4)\3\2\2\2\u00b5\u00b6\7\r\2\2\u00b6+\3\2\2\2\u00b7\u00b8"+
		"\7\16\2\2\u00b8-\3\2\2\2\u00b9\u00ba\7\n\2\2\u00ba/\3\2\2\2\u00bb\u00bc"+
		"\7\7\2\2\u00bc\61\3\2\2\2\23\679>P[hnp\u0081\u0083\u008d\u008f\u0095\u0097"+
		"\u00a5\u00ac\u00af";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}