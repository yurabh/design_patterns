package creational_design_patterns.learn_abstract_method_products_example;

public class ConcreteCreateB extends Creator {
    public Product createProduct() {
        return new ProductB();
    }
}
