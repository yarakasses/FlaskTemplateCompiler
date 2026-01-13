package ast;

public interface ASTVisitor {
    void visit(ProgramNode node);
    void visit(TextNode node);
    void visit(VariableNode node);
    void visit(ProductNode node);
    void visit(ShowProductsNode node);
    void visit(ProductDetailsNode node);
}