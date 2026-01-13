package ast;

import java.util.List;

public class ProgramNode extends ASTNode {
    public List<ASTNode> children;

    public ProgramNode(List<ASTNode> children, int line) {
        super("ProgramNode", line);
        this.children = children;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}