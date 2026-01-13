package visitor;

import ast.*;

public class ASTPrinter implements ASTVisitor {

    private int indent = 0;

    private void printIndent() {
        System.out.print("  ".repeat(indent));
    }

    /* ========== PROGRAM ========== */

    @Override
    public void visit(ProgramNode node) {
        printIndent();
        System.out.println(
                node.nodeName + " (line " + node.line + ")"
        );

        indent++;
        for (ASTNode child : node.children) {
            child.accept(this);
        }
        indent--;
    }

    /* ========== NODES ========== */

    @Override
    public void visit(TextNode node) {
        printIndent();
        System.out.println(
                node.nodeName + " (line " + node.line + "): " + node.text
        );
    }

    @Override
    public void visit(VariableNode node) {
        printIndent();
        System.out.println(
                node.nodeName + " (line " + node.line + "): " + node.name
        );
    }

    @Override
    public void visit(ProductNode node) {
        printIndent();
        System.out.println(
                node.nodeName + " (line " + node.line + ")"
        );

        indent++;
        printIndent(); System.out.println("Name: " + node.name);
        printIndent(); System.out.println("Image: " + node.image);
        printIndent(); System.out.println("Price: " + node.price);
        printIndent(); System.out.println("Details: " + node.details);
        indent--;
    }

    @Override
    public void visit(ShowProductsNode node) {
        printIndent();
        System.out.println(
                node.nodeName + " (line " + node.line + ")"
        );
    }

    @Override
    public void visit(ProductDetailsNode node) {
        printIndent();
        System.out.println(
                node.nodeName + " (line " + node.line + "): " + node.productName
        );
    }
}
