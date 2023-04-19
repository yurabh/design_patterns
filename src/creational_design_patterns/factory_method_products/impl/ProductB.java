package creational_design_patterns.factory_method_products.impl;

import creational_design_patterns.factory_method_products.Product;

public class ProductB implements Product {
    public void doSomething() {
        System.out.println("Product: two");
    }
}
