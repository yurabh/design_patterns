package creational_design_patterns.abstract_factory_restaurant_service.impl;

import creational_design_patterns.abstract_factory_restaurant_service.Soup;

public class PolishSoup implements Soup {

    @Override
    public void cookSoup() {
        System.out.println("cooking polish soup");
    }

    @Override
    public void putOnSaleSoup() {
        System.out.println("put onSale polish soup");
    }
}
