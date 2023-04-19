package creational_design_patterns.factory_method_products;

public abstract class Creator {

    public abstract Product createProduct();

    public void realisationProduct() {
        Product product = createProduct();
        product.doSomething();
    }
}
