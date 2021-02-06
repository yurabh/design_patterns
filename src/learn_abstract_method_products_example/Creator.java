package learn_abstract_method_products_example;

public abstract class Creator {

    public abstract Product createProduct();

    public void realisationProduct() {
        Product product = createProduct();
        product.doSomething();
    }
}
