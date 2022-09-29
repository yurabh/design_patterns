package creational_design_patterns.learn_abstract_factory_restaurant_service_example;

public class PolishMacaroni implements Macaroni {

    @Override
    public void cookMacaroni() {
        System.out.println("cooking polish macaroni");
    }

    @Override
    public void putOnSaleMacaroni() {
        System.out.println("put onSale polish macaroni");
    }
}
