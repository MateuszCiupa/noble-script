package com.noble.script;

import com.noble.script.antlr.NobleScriptLexer;
import com.noble.script.antlr.NobleScriptParser;
import com.noble.script.llvm.generator.LLVMActions;
import com.noble.script.llvm.generator.LLVMGenerator;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;


import java.io.FileWriter;
import java.io.IOException;

public class NobleScriptCompiler {

    public static void main(String[] args) {
        try {
            ANTLRFileStream input = new ANTLRFileStream("./resources/example.ns");
            NobleScriptLexer lexer = new NobleScriptLexer(input);

            CommonTokenStream tokens = new CommonTokenStream(lexer);
            NobleScriptParser parser = new NobleScriptParser(tokens);

            ParseTree tree = parser.program();

            ParseTreeWalker walker = new ParseTreeWalker();
            LLVMGenerator generator = new LLVMGenerator();
            walker.walk(new LLVMActions(generator), tree);

            generator.print("LLVM Hello world!");
            String lvmCode = generator.generate();

            try (FileWriter fw = new FileWriter("./resources/example.ll")) {
                fw.write(lvmCode);
            }
            System.out.println("Generated code:");
            System.out.println(lvmCode);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
