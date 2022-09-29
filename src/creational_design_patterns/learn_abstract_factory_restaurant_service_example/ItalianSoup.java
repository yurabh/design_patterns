package creational_design_patterns.learn_abstract_factory_restaurant_service_example;

public class ItalianSoup implements Soup {

    @Override
    public void cookSoup() {
        System.out.println("cooking italian soup");
    }

    @Override
    public void putOnSaleSoup() {
        System.out.println("put onSale Italian soup");
    }
}
