package compiler;

import grammar.TemplateLexer;
import grammar.TemplateParser;
import visitor.ASTBuilder;
import visitor.ASTPrinter;
import ast.ASTNode;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
public class Main {

    public static void main(String[] args) {

        try {
            // 1️⃣ مسار ملف الإدخال (برنامج الاختبار)
            String path = "input.tpl";

            // 2️⃣ تحويل الملف إلى CharStream
            CharStream input = CharStreams.fromFileName(path);

            // 3️⃣ إنشاء Lexer
            TemplateLexer lexer = new TemplateLexer(input);

            // 4️⃣ تحويل Lexer إلى Token Stream
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // 5️⃣ إنشاء Parser
            TemplateParser parser = new TemplateParser(tokens);

            // 6️⃣ بدء التحليل (start rule)
            ParseTree tree = parser.program();

            // 7️⃣ Visitor لبناء AST
            ASTBuilder builder = new ASTBuilder();
            ASTNode ast = builder.visit(tree);

           // 8️⃣ طباعة AST
            ASTPrinter printer = new ASTPrinter();
            ast.accept(printer);

           // 9️⃣ طباعة Symbol Table
            builder.table.print();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}