import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;


import java.io.FileWriter;
import java.io.IOException;

public class NobleScriptCompiler {

    public static void main(String[] args) {
        try {
            ANTLRFileStream input = new ANTLRFileStream("./tests/example.ns");
            NobleScriptLexer lexer = new NobleScriptLexer(input);

            CommonTokenStream tokens = new CommonTokenStream(lexer);
            NobleScriptParser parser = new NobleScriptParser(tokens);

            ParseTree tree = parser.program();

            ParseTreeWalker walker = new ParseTreeWalker();
            LLVMGenerator generator = new LLVMGenerator();
            walker.walk(new LLVMActions(generator, 1), tree);

            String lvmCode = generator.generate();

            try (FileWriter fw = new FileWriter("./tests/example.ll")) {
                fw.write(lvmCode);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
