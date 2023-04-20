package creational_design_patterns.abstract_factory_restaurant_service.impl;

import creational_design_patterns.abstract_factory_restaurant_service.Dumplings;
import creational_design_patterns.abstract_factory_restaurant_service.Macaroni;
import creational_design_patterns.abstract_factory_restaurant_service.Restaurant;
import creational_design_patterns.abstract_factory_restaurant_service.Soup;

public class UkrainianKitchen implements Restaurant {

    @Override
    public Macaroni prepareMacaroni() {
        return new UkrainianMacaroni();
    }

    @Override
    public Soup prepareSoup() {
        return new UkrainianSoup();
    }

    @Override
    public Dumplings prepareDumplings() {
        return new UkrainianDumplings();
    }
}
