// Generated from C:/Users/Yara/IdeaProjects/FlaskTemplateCompiler/src/grammar/TemplateParser.g4 by ANTLR 4.13.2
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TemplateParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TemplateParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code ProgramRule}
	 * labeled alternative in {@link TemplateParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramRule(TemplateParser.ProgramRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TextElement}
	 * labeled alternative in {@link TemplateParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextElement(TemplateParser.TextElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableElement}
	 * labeled alternative in {@link TemplateParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableElement(TemplateParser.VariableElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ShowProductsElement}
	 * labeled alternative in {@link TemplateParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowProductsElement(TemplateParser.ShowProductsElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddProductElement}
	 * labeled alternative in {@link TemplateParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddProductElement(TemplateParser.AddProductElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ProductDetailsElement}
	 * labeled alternative in {@link TemplateParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProductDetailsElement(TemplateParser.ProductDetailsElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TextRule}
	 * labeled alternative in {@link TemplateParser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextRule(TemplateParser.TextRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableRule}
	 * labeled alternative in {@link TemplateParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableRule(TemplateParser.VariableRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateParser#showProducts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowProducts(TemplateParser.ShowProductsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateParser#addProduct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddProduct(TemplateParser.AddProductContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateParser#productDetails}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProductDetails(TemplateParser.ProductDetailsContext ctx);
}