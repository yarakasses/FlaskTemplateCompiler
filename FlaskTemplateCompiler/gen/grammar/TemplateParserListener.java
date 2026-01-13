// Generated from C:/Users/Yara/IdeaProjects/FlaskTemplateCompiler/src/grammar/TemplateParser.g4 by ANTLR 4.13.2
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TemplateParser}.
 */
public interface TemplateParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code ProgramRule}
	 * labeled alternative in {@link TemplateParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgramRule(TemplateParser.ProgramRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ProgramRule}
	 * labeled alternative in {@link TemplateParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgramRule(TemplateParser.ProgramRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TextElement}
	 * labeled alternative in {@link TemplateParser#element}.
	 * @param ctx the parse tree
	 */
	void enterTextElement(TemplateParser.TextElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TextElement}
	 * labeled alternative in {@link TemplateParser#element}.
	 * @param ctx the parse tree
	 */
	void exitTextElement(TemplateParser.TextElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableElement}
	 * labeled alternative in {@link TemplateParser#element}.
	 * @param ctx the parse tree
	 */
	void enterVariableElement(TemplateParser.VariableElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableElement}
	 * labeled alternative in {@link TemplateParser#element}.
	 * @param ctx the parse tree
	 */
	void exitVariableElement(TemplateParser.VariableElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ShowProductsElement}
	 * labeled alternative in {@link TemplateParser#element}.
	 * @param ctx the parse tree
	 */
	void enterShowProductsElement(TemplateParser.ShowProductsElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ShowProductsElement}
	 * labeled alternative in {@link TemplateParser#element}.
	 * @param ctx the parse tree
	 */
	void exitShowProductsElement(TemplateParser.ShowProductsElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddProductElement}
	 * labeled alternative in {@link TemplateParser#element}.
	 * @param ctx the parse tree
	 */
	void enterAddProductElement(TemplateParser.AddProductElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddProductElement}
	 * labeled alternative in {@link TemplateParser#element}.
	 * @param ctx the parse tree
	 */
	void exitAddProductElement(TemplateParser.AddProductElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ProductDetailsElement}
	 * labeled alternative in {@link TemplateParser#element}.
	 * @param ctx the parse tree
	 */
	void enterProductDetailsElement(TemplateParser.ProductDetailsElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ProductDetailsElement}
	 * labeled alternative in {@link TemplateParser#element}.
	 * @param ctx the parse tree
	 */
	void exitProductDetailsElement(TemplateParser.ProductDetailsElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TextRule}
	 * labeled alternative in {@link TemplateParser#text}.
	 * @param ctx the parse tree
	 */
	void enterTextRule(TemplateParser.TextRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TextRule}
	 * labeled alternative in {@link TemplateParser#text}.
	 * @param ctx the parse tree
	 */
	void exitTextRule(TemplateParser.TextRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableRule}
	 * labeled alternative in {@link TemplateParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariableRule(TemplateParser.VariableRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableRule}
	 * labeled alternative in {@link TemplateParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariableRule(TemplateParser.VariableRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#showProducts}.
	 * @param ctx the parse tree
	 */
	void enterShowProducts(TemplateParser.ShowProductsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#showProducts}.
	 * @param ctx the parse tree
	 */
	void exitShowProducts(TemplateParser.ShowProductsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#addProduct}.
	 * @param ctx the parse tree
	 */
	void enterAddProduct(TemplateParser.AddProductContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#addProduct}.
	 * @param ctx the parse tree
	 */
	void exitAddProduct(TemplateParser.AddProductContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#productDetails}.
	 * @param ctx the parse tree
	 */
	void enterProductDetails(TemplateParser.ProductDetailsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#productDetails}.
	 * @param ctx the parse tree
	 */
	void exitProductDetails(TemplateParser.ProductDetailsContext ctx);
}