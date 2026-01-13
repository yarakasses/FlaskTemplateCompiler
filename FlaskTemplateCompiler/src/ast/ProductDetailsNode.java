package ast;

public class ProductDetailsNode extends ASTNode {
    public String productName;

    public ProductDetailsNode(String productName, int line) {
        super("ProductDetailsNode", line);
        this.productName = productName;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}