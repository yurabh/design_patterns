package creational_design_patterns.abstract_factory_restaurant_service.impl;

import creational_design_patterns.abstract_factory_restaurant_service.Dumplings;
import creational_design_patterns.abstract_factory_restaurant_service.Macaroni;
import creational_design_patterns.abstract_factory_restaurant_service.Restaurant;
import creational_design_patterns.abstract_factory_restaurant_service.Soup;

public class ItalianKitchen implements Restaurant {

    @Override
    public Macaroni prepareMacaroni() {
        return new ItalianMacaroni();
    }

    @Override
    public Soup prepareSoup() {
        return new ItalianSoup();
    }

    @Override
    public Dumplings prepareDumplings() {
        return new ItalianDumplings();
    }
}
