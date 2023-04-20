package creational_design_patterns.abstract_factory_restaurant_service.impl;

import creational_design_patterns.abstract_factory_restaurant_service.Macaroni;

public class UkrainianMacaroni implements Macaroni {

    @Override
    public void cookMacaroni() {
        System.out.println("cooking Ukrainian macaroni");
    }

    @Override
    public void putOnSaleMacaroni() {
        System.out.println("put onSale Ukrainian macaroni");
    }
}
