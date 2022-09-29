package creational_design_patterns.learn_abstract_method_products_example;

public class ConcreteCreateA extends Creator {
    public Product createProduct() {
        return new ProductA();
    }
}
