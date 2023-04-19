package creational_design_patterns.factory_method_products.impl;

import creational_design_patterns.factory_method_products.Product;

public class ProductA implements Product {
    public void doSomething() {
        System.out.println("Product: one");
    }
}
