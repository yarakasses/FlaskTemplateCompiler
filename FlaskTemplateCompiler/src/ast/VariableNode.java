package ast;

public class VariableNode extends ASTNode {
    public String name;

    public VariableNode(String name, int line) {
        super("VariableNode", line);
        this.name = name;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}