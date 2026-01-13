package ast;

public abstract class ASTNode {
    public String nodeName;
    public int line;

    public ASTNode(String nodeName, int line) {
        this.nodeName = nodeName;
        this.line = line;
    }

    public abstract void accept(ASTVisitor visitor);
}