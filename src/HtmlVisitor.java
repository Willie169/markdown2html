/**
 * @author yx
 * @since 2021-01-07 17:23
 */
import com.sun.org.apache.bcel.internal.classfile.Code;
import com.sun.org.apache.bcel.internal.classfile.Visitor;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
public class HtmlVisitor extends markdownBaseVisitor {
    // 输出文件
    public StringBuilder out = new StringBuilder();

    @Override
    public Object visitProg(markdownParser.ProgContext ctx) {
        out.append("<html>\n");
        out.append("<head></head>\n");
        out.append("<style type=\"text/css\"> \n");
        out.append(bodyStyle);
        out.append(listStyle);
        out.append(codeStyle);
        out.append(referBlockStyle);
        out.append(h1Style);
        out.append(h2Style);
        out.append("</style>\n");
        out.append("<body>\n");
        super.visitProg(ctx);
        out.append("</body>\n");
        out.append("</html>\n");

        return null;
    }

    @Override
    // 访问# 一级标题，加上h1标签，再输出
    public Object visitMain_title(markdownParser.Main_titleContext ctx) {
        out.append("<h1>");
        visitWords(ctx.words());
        out.append("</h1>");
        // 为了可读性，加上换行
        out.append("\n");
        return null;
    }

    @Override
    // 访问## 二级标题，加上h2标签，再输出
    public Object visitSub_title(markdownParser.Sub_titleContext ctx) {
        out.append("<h2>");
        visitWords(ctx.words());
        out.append("</h2>");
        // 为了可读性，加上换行
        out.append("\n");
        return null;
    }

    @Override
    public Object visitList(markdownParser.ListContext ctx) {
        // out.append("<pre>");
        out.append("<div id=\"list\">\n");
        /*
        for(ParseTree child : ctx.listline()){
            visit(child);
        }


         */
        visitListline(ctx.listline());
        // out.append("</pre>");
        out.append("</div>\n");
        return null;
    }

    @Override
    public Object visitLine(markdownParser.LineContext ctx) {

        out.append("<div id=\"line\">");
        super.visitLine(ctx);
        out.append("</div>");
        return null;
    }

    @Override
    // 访问列表，这里不使用html中的<li>标签，直接用<\t> <br>等标签处理。
    // 如： 1. content 要翻译为 1.<\t> content<br>
    // \tab2. content 要翻译为<\t> 2. <\t> content<br>
    public Object visitListline(markdownParser.ListlineContext ctx) {
        // 看一下前面有多少tab，确定要缩进多少
        // listline    :   tab* number DOT SPACE line;
        int tabCount = ctx.tab().size();
        for(int i = 0; i < tabCount; i++){
            visit(ctx.tab(i));
            // out.append("&nbsp;&nbsp;&nbsp;&nbsp;");
        }

        // 访问数字，这里面会输出数字的。
        visitNumber(ctx.number());
        // 加上点和一个空格
        out.append(".&nbsp;");

        // 因为不需要加上div#line,所以这里直接调用父类的方法
        super.visitLine(ctx.line());

        return null;
    }

    @Override
    // 访问引用，需要在前面和后面加上一对标签，达到引用的效果，这里用一个div就行了
    // > refer
    // > refer
    public Object visitReferblock(markdownParser.ReferblockContext ctx) {
        out.append("<div id = \"referBlock\" >\n");
        for(ParseTree child : ctx.children){
            if(child!=null)
                visit(child);
        }
        out.append("</div>\n");
        return null;
    }

    @Override
    // 访问引用中的每一行。直接访问即可，记得每一行都要换行
    public Object visitReferline(markdownParser.ReferlineContext ctx) {
        // 先把引用里面的文字读出来
        visit(ctx.words());
        // 加上换行
        out.append("<br>");
        return null;
    }

    @Override
    // 访问代码块，直接在所有的代码两边加上大的标签，然后直接输出内部的codes就可以了
    public Object visitCodeblock(markdownParser.CodeblockContext ctx) {
        out.append("<div id=\"codeBlock\" >\n");
        boolean firstBeak = true;
        for(ParseTree child : ctx.children){
            if(firstBeak && child.getClass() == markdownParser.NewlineContext.class){
                firstBeak = false;
                continue;
            }
            visit(child);
        }
        out.append("</div>\n");
        return null;
    }

    @Override
    // 访问加粗标签，需要加上<b></b>标签
    public Object visitInlinebold(markdownParser.InlineboldContext ctx) {
        out.append("<b>");
        visitWords(ctx.words());
        out.append("</b>");

        return null;
    }

    @Override
    // 访问* *， 需要将里面的内容加上斜体
    public Object visitInlineitalic(markdownParser.InlineitalicContext ctx) {
        out.append("<i>");
        visitWords(ctx.words());
        out.append("</i>");
        return null;
    }

    @Override
    public Object visitInlinespace(markdownParser.InlinespaceContext ctx) {
        if(ctx.SPACE() != null){
            out.append("&nbsp;");
        }
        else if(ctx.tab() != null){
            visit(ctx.tab());
        }
        return null;
    }

    @Override
    // 访问行内的数字，直接输出即可
    public Object visitNumber(markdownParser.NumberContext ctx) {
        out.append(ctx.getText());
        return null;
    }

    @Override
    // 访问行内的标点，直接输出即可。
    public Object visitSymbols(markdownParser.SymbolsContext ctx) {
        out.append(ctx.getText());
        return null;
    }

    @Override
    // 访问单个数字，直接输出即可
    public Object visitSingledigit(markdownParser.SingledigitContext ctx) {
        out.append(ctx.getText());
        return null;
    }

    @Override
    // 访问换行符，需要加上<br>标签
    public Object visitNewline(markdownParser.NewlineContext ctx) {
        out.append("<br>\n");
        return null;
    }

    @Override
    public Object visitCharacter(markdownParser.CharacterContext ctx) {
        out.append(ctx.getText());
        return null;
    }

    @Override
    public Object visitOthersymbol(markdownParser.OthersymbolContext ctx) {
        out.append(ctx.getText());
        return null;
    }

    @Override
    public Object visitTab(markdownParser.TabContext ctx) {
        out.append("&nbsp;&nbsp;&nbsp;&nbsp;");
        return null;
    }

    @Override
    // 这个dot和终结符dot语义上有所不同，这个dot是出现在文本中的dot，需要进行输出
    public Object visitDot(markdownParser.DotContext ctx) {
        out.append('.');
        return null;
    }



    String bodyStyle="\n" +
            "body {\n" +
            "    line-break: anywhere;\n"+
            "    font-size: 20px;\n" +
            "    padding: 0;\n" +
            "    margin-top: 50px;\n" +
            "    margin-left: 70px;\n" +
            "    margin-right: 70px;\n" +
            "    letter-spacing: 1.0px;\n" +
            "}\n";
    String listStyle= "#list {\n" +
            "    line-height: 30px;\n" +
            "}\n";

    String codeStyle = "#codeBlock {\n" +
            "    margin: 0;\n" +
            "    margin-top: 10px;\n"+
            "    padding: 15px 20px;\n" +
            "    font-family: cursive;\n" +
            "    letter-spacing: 0.5px;\n" +
            "    background: #f4f4fe;\n" +
            "}\n";

    String referBlockStyle = "#referBlock {\n" +
            "    font-size: 16px;\n" +
            "    background: #f6f6f6;\n" +
            "    color: #221f1f;\n" +
            "    padding: 15px 15px;\n" +
            "}\n";
    String h2Style = "h2 {\n" +
            "    margin: 5px 0;\n" +
            "    font-size: 25px;\n" +
            "}\n";

    String h1Style = "h1 {\n" +
            "    margin-top: 15px 0;\n" +
            "    font-size: 35px;\n" +
            "}\n";

}
