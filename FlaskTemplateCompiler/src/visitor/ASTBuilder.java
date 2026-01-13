package visitor;

import ast.*;
import grammar.TemplateParser;
import grammar.TemplateParserBaseVisitor;
import semantic.SymbolTable;

import java.util.ArrayList;
import java.util.List;
public class ASTBuilder extends TemplateParserBaseVisitor<ASTNode> {

    public SymbolTable table = new SymbolTable();

    /* ========== PROGRAM ========== */

    @Override
    public ASTNode visitProgramRule(TemplateParser.ProgramRuleContext ctx) {
        List<ASTNode> children = new ArrayList<>();

        for (var e : ctx.element()) {
            children.add(visit(e));
        }

        return new ProgramNode(children, ctx.start.getLine());
    }

    /* ========== ELEMENTS ========== */

    @Override
    public ASTNode visitTextElement(TemplateParser.TextElementContext ctx) {
        return visit(ctx.text());
    }

    @Override
    public ASTNode visitVariableElement(TemplateParser.VariableElementContext ctx) {
        return visit(ctx.variable());
    }

    @Override
    public ASTNode visitShowProductsElement(TemplateParser.ShowProductsElementContext ctx) {
        return visit(ctx.showProducts());
    }

    @Override
    public ASTNode visitAddProductElement(TemplateParser.AddProductElementContext ctx) {
        return visit(ctx.addProduct());
    }

    @Override
    public ASTNode visitProductDetailsElement(TemplateParser.ProductDetailsElementContext ctx) {
        return visit(ctx.productDetails());
    }

    /* ========== RULES ========== */

    @Override
    public ASTNode visitTextRule(TemplateParser.TextRuleContext ctx) {
        return new TextNode(ctx.TEXT().getText(), ctx.start.getLine());
    }

    @Override
    public ASTNode visitVariableRule(TemplateParser.VariableRuleContext ctx) {
        VariableNode var = new VariableNode(ctx.ID().getText(), ctx.start.getLine());
        table.addVariable(var);   // ⭐ إضافة للـ SymbolTable
        return var;
    }

    @Override
    public ASTNode visitShowProducts(TemplateParser.ShowProductsContext ctx) {
        return new ShowProductsNode(ctx.start.getLine());
    }

    @Override
    public ASTNode visitAddProduct(TemplateParser.AddProductContext ctx) {
        String name = ctx.STRING(0).getText();
        String image = ctx.STRING(1).getText();
        double price = Double.parseDouble(ctx.NUMBER().getText());
        String details = ctx.STRING(2).getText();

        ProductNode product =
                new ProductNode(name, image, price, details, ctx.start.getLine());

        table.addProduct(product);
        return product;
    }

    @Override
    public ASTNode visitProductDetails(TemplateParser.ProductDetailsContext ctx) {
        return new ProductDetailsNode(ctx.ID().getText(), ctx.start.getLine());
    }
}
