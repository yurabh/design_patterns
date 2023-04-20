package creational_design_patterns.abstract_factory_restaurant_service.impl;

import creational_design_patterns.abstract_factory_restaurant_service.Soup;

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
