import org.antlr.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.*;
import java.nio.file.Paths;

/**
 * @author yx
 * @since 2021-01-07 18:23
 */
public class Main {
    public static void main(String[] args) throws IOException {
        String inputPath = "src\\test.md";
        String outputPath = "src\\test.html";


        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader in = new BufferedReader(new FileReader(inputPath));

            String str = null;
            while((str = in.readLine()) != null){
                sb.append(str+"\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        CharStream input = CharStreams.fromString(sb.toString());
        // input = CharStreams.fromFileName(inputPath);
        // input= CharStreams.fromPath(Paths.get("D:\\test.md"));
        // System.out.println(sb.toString());
        markdownLexer lexer = new markdownLexer(input);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        markdownParser parser = new markdownParser(tokenStream);
        ParseTree tree = parser.prog();
        HtmlVisitor visitor = new HtmlVisitor();
        visitor.visit(tree);
        System.out.println(visitor.out.toString());
        FileOutputStream out = new FileOutputStream(outputPath);
        out.write(visitor.out.toString().getBytes());
        out.close();
    }
}
