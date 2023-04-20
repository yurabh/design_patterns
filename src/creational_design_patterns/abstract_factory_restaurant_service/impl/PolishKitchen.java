package creational_design_patterns.abstract_factory_restaurant_service.impl;

import creational_design_patterns.abstract_factory_restaurant_service.Dumplings;
import creational_design_patterns.abstract_factory_restaurant_service.Macaroni;
import creational_design_patterns.abstract_factory_restaurant_service.Restaurant;
import creational_design_patterns.abstract_factory_restaurant_service.Soup;

public class PolishKitchen implements Restaurant {

    @Override
    public Macaroni prepareMacaroni() {
        return new PolishMacaroni();
    }

    @Override
    public Soup prepareSoup() {
        return new PolishSoup();
    }

    @Override
    public Dumplings prepareDumplings() {
        return new PolishDumplings();
    }
}
