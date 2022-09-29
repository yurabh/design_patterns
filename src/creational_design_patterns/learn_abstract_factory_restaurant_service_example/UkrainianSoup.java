package creational_design_patterns.learn_abstract_factory_restaurant_service_example;

public class UkrainianSoup implements Soup {

    @Override
    public void cookSoup() {
        System.out.println("cooking Ukrainian Soup");
    }

    @Override
    public void putOnSaleSoup() {
        System.out.println("put onSale Ukrainian soup");
    }
}
