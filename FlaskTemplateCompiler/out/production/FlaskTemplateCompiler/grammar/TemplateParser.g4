parser grammar TemplateParser;

options { tokenVocab=TemplateLexer; }

program
    : element* EOF                #ProgramRule
    ;

element
    : text                        #TextElement
    | variable                    #VariableElement
    | showProducts                #ShowProductsElement
    | addProduct                  #AddProductElement
    | productDetails              #ProductDetailsElement
    ;

text
    : TEXT                        #TextRule
    ;

variable
    : VAR_OPEN ID VAR_CLOSE       #VariableRule
    ;

showProducts
    : SHOW PRODUCTS
    ;

addProduct
    : ADD PRODUCT STRING STRING NUMBER STRING
    ;

productDetails
    : DETAILS ID
    ;