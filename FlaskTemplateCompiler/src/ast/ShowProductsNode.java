package ast;

public class ShowProductsNode extends ASTNode {

    public ShowProductsNode(int line) {
        super("ShowProductsNode", line);
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
