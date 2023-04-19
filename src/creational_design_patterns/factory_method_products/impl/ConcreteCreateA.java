package creational_design_patterns.factory_method_products.impl;

import creational_design_patterns.factory_method_products.Creator;
import creational_design_patterns.factory_method_products.Product;

public class ConcreteCreateA extends Creator {
    public Product createProduct() {
        return new ProductA();
    }
}
