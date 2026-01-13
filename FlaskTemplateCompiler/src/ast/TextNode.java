package ast;

public class TextNode extends ASTNode {
    public String text;

    public TextNode(String text, int line) {
        super("TextNode", line);
        this.text = text;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}