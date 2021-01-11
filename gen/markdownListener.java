// Generated from D:/学习/编译原理/研究性学习/MarkdownParser/src\markdown.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link markdownParser}.
 */
public interface markdownListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link markdownParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(markdownParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link markdownParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(markdownParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link markdownParser#title}.
	 * @param ctx the parse tree
	 */
	void enterTitle(markdownParser.TitleContext ctx);
	/**
	 * Exit a parse tree produced by {@link markdownParser#title}.
	 * @param ctx the parse tree
	 */
	void exitTitle(markdownParser.TitleContext ctx);
	/**
	 * Enter a parse tree produced by {@link markdownParser#main_title}.
	 * @param ctx the parse tree
	 */
	void enterMain_title(markdownParser.Main_titleContext ctx);
	/**
	 * Exit a parse tree produced by {@link markdownParser#main_title}.
	 * @param ctx the parse tree
	 */
	void exitMain_title(markdownParser.Main_titleContext ctx);
	/**
	 * Enter a parse tree produced by {@link markdownParser#sub_title}.
	 * @param ctx the parse tree
	 */
	void enterSub_title(markdownParser.Sub_titleContext ctx);
	/**
	 * Exit a parse tree produced by {@link markdownParser#sub_title}.
	 * @param ctx the parse tree
	 */
	void exitSub_title(markdownParser.Sub_titleContext ctx);
	/**
	 * Enter a parse tree produced by {@link markdownParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(markdownParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link markdownParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(markdownParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link markdownParser#listline}.
	 * @param ctx the parse tree
	 */
	void enterListline(markdownParser.ListlineContext ctx);
	/**
	 * Exit a parse tree produced by {@link markdownParser#listline}.
	 * @param ctx the parse tree
	 */
	void exitListline(markdownParser.ListlineContext ctx);
	/**
	 * Enter a parse tree produced by {@link markdownParser#referblock}.
	 * @param ctx the parse tree
	 */
	void enterReferblock(markdownParser.ReferblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link markdownParser#referblock}.
	 * @param ctx the parse tree
	 */
	void exitReferblock(markdownParser.ReferblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link markdownParser#referline}.
	 * @param ctx the parse tree
	 */
	void enterReferline(markdownParser.ReferlineContext ctx);
	/**
	 * Exit a parse tree produced by {@link markdownParser#referline}.
	 * @param ctx the parse tree
	 */
	void exitReferline(markdownParser.ReferlineContext ctx);
	/**
	 * Enter a parse tree produced by {@link markdownParser#codeblock}.
	 * @param ctx the parse tree
	 */
	void enterCodeblock(markdownParser.CodeblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link markdownParser#codeblock}.
	 * @param ctx the parse tree
	 */
	void exitCodeblock(markdownParser.CodeblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link markdownParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(markdownParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link markdownParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(markdownParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by {@link markdownParser#symbols}.
	 * @param ctx the parse tree
	 */
	void enterSymbols(markdownParser.SymbolsContext ctx);
	/**
	 * Exit a parse tree produced by {@link markdownParser#symbols}.
	 * @param ctx the parse tree
	 */
	void exitSymbols(markdownParser.SymbolsContext ctx);
	/**
	 * Enter a parse tree produced by {@link markdownParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(markdownParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link markdownParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(markdownParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link markdownParser#words}.
	 * @param ctx the parse tree
	 */
	void enterWords(markdownParser.WordsContext ctx);
	/**
	 * Exit a parse tree produced by {@link markdownParser#words}.
	 * @param ctx the parse tree
	 */
	void exitWords(markdownParser.WordsContext ctx);
	/**
	 * Enter a parse tree produced by {@link markdownParser#codes}.
	 * @param ctx the parse tree
	 */
	void enterCodes(markdownParser.CodesContext ctx);
	/**
	 * Exit a parse tree produced by {@link markdownParser#codes}.
	 * @param ctx the parse tree
	 */
	void exitCodes(markdownParser.CodesContext ctx);
	/**
	 * Enter a parse tree produced by {@link markdownParser#inlinebold}.
	 * @param ctx the parse tree
	 */
	void enterInlinebold(markdownParser.InlineboldContext ctx);
	/**
	 * Exit a parse tree produced by {@link markdownParser#inlinebold}.
	 * @param ctx the parse tree
	 */
	void exitInlinebold(markdownParser.InlineboldContext ctx);
	/**
	 * Enter a parse tree produced by {@link markdownParser#inlineitalic}.
	 * @param ctx the parse tree
	 */
	void enterInlineitalic(markdownParser.InlineitalicContext ctx);
	/**
	 * Exit a parse tree produced by {@link markdownParser#inlineitalic}.
	 * @param ctx the parse tree
	 */
	void exitInlineitalic(markdownParser.InlineitalicContext ctx);
	/**
	 * Enter a parse tree produced by {@link markdownParser#inlinespace}.
	 * @param ctx the parse tree
	 */
	void enterInlinespace(markdownParser.InlinespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link markdownParser#inlinespace}.
	 * @param ctx the parse tree
	 */
	void exitInlinespace(markdownParser.InlinespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link markdownParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(markdownParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link markdownParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(markdownParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link markdownParser#singledigit}.
	 * @param ctx the parse tree
	 */
	void enterSingledigit(markdownParser.SingledigitContext ctx);
	/**
	 * Exit a parse tree produced by {@link markdownParser#singledigit}.
	 * @param ctx the parse tree
	 */
	void exitSingledigit(markdownParser.SingledigitContext ctx);
	/**
	 * Enter a parse tree produced by {@link markdownParser#newline}.
	 * @param ctx the parse tree
	 */
	void enterNewline(markdownParser.NewlineContext ctx);
	/**
	 * Exit a parse tree produced by {@link markdownParser#newline}.
	 * @param ctx the parse tree
	 */
	void exitNewline(markdownParser.NewlineContext ctx);
	/**
	 * Enter a parse tree produced by {@link markdownParser#character}.
	 * @param ctx the parse tree
	 */
	void enterCharacter(markdownParser.CharacterContext ctx);
	/**
	 * Exit a parse tree produced by {@link markdownParser#character}.
	 * @param ctx the parse tree
	 */
	void exitCharacter(markdownParser.CharacterContext ctx);
	/**
	 * Enter a parse tree produced by {@link markdownParser#othersymbol}.
	 * @param ctx the parse tree
	 */
	void enterOthersymbol(markdownParser.OthersymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link markdownParser#othersymbol}.
	 * @param ctx the parse tree
	 */
	void exitOthersymbol(markdownParser.OthersymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link markdownParser#tab}.
	 * @param ctx the parse tree
	 */
	void enterTab(markdownParser.TabContext ctx);
	/**
	 * Exit a parse tree produced by {@link markdownParser#tab}.
	 * @param ctx the parse tree
	 */
	void exitTab(markdownParser.TabContext ctx);
	/**
	 * Enter a parse tree produced by {@link markdownParser#dot}.
	 * @param ctx the parse tree
	 */
	void enterDot(markdownParser.DotContext ctx);
	/**
	 * Exit a parse tree produced by {@link markdownParser#dot}.
	 * @param ctx the parse tree
	 */
	void exitDot(markdownParser.DotContext ctx);
}