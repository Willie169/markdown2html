// Generated from D:/学习/编译原理/研究性学习/MarkdownParser/src\markdown.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link markdownParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface markdownVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link markdownParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(markdownParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link markdownParser#title}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTitle(markdownParser.TitleContext ctx);
	/**
	 * Visit a parse tree produced by {@link markdownParser#main_title}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_title(markdownParser.Main_titleContext ctx);
	/**
	 * Visit a parse tree produced by {@link markdownParser#sub_title}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub_title(markdownParser.Sub_titleContext ctx);
	/**
	 * Visit a parse tree produced by {@link markdownParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(markdownParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link markdownParser#listline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListline(markdownParser.ListlineContext ctx);
	/**
	 * Visit a parse tree produced by {@link markdownParser#referblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferblock(markdownParser.ReferblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link markdownParser#referline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferline(markdownParser.ReferlineContext ctx);
	/**
	 * Visit a parse tree produced by {@link markdownParser#codeblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeblock(markdownParser.CodeblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link markdownParser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(markdownParser.TextContext ctx);
	/**
	 * Visit a parse tree produced by {@link markdownParser#symbols}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbols(markdownParser.SymbolsContext ctx);
	/**
	 * Visit a parse tree produced by {@link markdownParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(markdownParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link markdownParser#words}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWords(markdownParser.WordsContext ctx);
	/**
	 * Visit a parse tree produced by {@link markdownParser#codes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodes(markdownParser.CodesContext ctx);
	/**
	 * Visit a parse tree produced by {@link markdownParser#inlinebold}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlinebold(markdownParser.InlineboldContext ctx);
	/**
	 * Visit a parse tree produced by {@link markdownParser#inlineitalic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineitalic(markdownParser.InlineitalicContext ctx);
	/**
	 * Visit a parse tree produced by {@link markdownParser#inlinespace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlinespace(markdownParser.InlinespaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link markdownParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(markdownParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link markdownParser#singledigit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingledigit(markdownParser.SingledigitContext ctx);
	/**
	 * Visit a parse tree produced by {@link markdownParser#newline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewline(markdownParser.NewlineContext ctx);
	/**
	 * Visit a parse tree produced by {@link markdownParser#character}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacter(markdownParser.CharacterContext ctx);
	/**
	 * Visit a parse tree produced by {@link markdownParser#othersymbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOthersymbol(markdownParser.OthersymbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link markdownParser#tab}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTab(markdownParser.TabContext ctx);
	/**
	 * Visit a parse tree produced by {@link markdownParser#dot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDot(markdownParser.DotContext ctx);
}