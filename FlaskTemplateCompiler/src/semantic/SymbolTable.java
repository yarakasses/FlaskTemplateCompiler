package semantic;

import ast.ProductNode;
import ast.VariableNode;

import java.util.HashMap;
import java.util.Map;

public class SymbolTable {

    // تخزين المنتجات
    private Map<String, ProductNode> products = new HashMap<>();

    // تخزين المتغيرات
    private Map<String, VariableNode> variables = new HashMap<>();

    /* ========== PRODUCTS ========== */

    public void addProduct(ProductNode product) {
        products.put(product.name, product);
    }

    public ProductNode getProduct(String name) {
        return products.get(name);
    }

    /* ========== VARIABLES ========== */

    public void addVariable(VariableNode variable) {
        variables.put(variable.name, variable);
    }

    public VariableNode getVariable(String name) {
        return variables.get(name);
    }

    /* ========== PRINT ========== */

    public void print() {
        System.out.println("\n===== SYMBOL TABLE =====");

        System.out.println("Products:");
        for (String name : products.keySet()) {
            System.out.println("  - " + name);
        }

        System.out.println("Variables:");
        for (String name : variables.keySet()) {
            System.out.println("  - " + name);
        }

        System.out.println("========================\n");
    }
}
