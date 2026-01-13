package ast;

public class ProductNode extends ASTNode {
    public String name;
    public String image;
    public double price;
    public String details;

    public ProductNode(String name, String image, double price, String details, int line) {
        super("ProductNode", line);
        this.name = name;
        this.image = image;
        this.price = price;
        this.details = details;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}