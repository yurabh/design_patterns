package creational_design_patterns.abstract_factory_restaurant_service.impl;

import creational_design_patterns.abstract_factory_restaurant_service.Dumplings;

public class ItalianDumplings implements Dumplings {

    @Override
    public void cookDumplings() {
        System.out.println("cooking italian dumplings");
    }

    @Override
    public void putOnSaleDumplings() {
        System.out.println("put onSale Italian dumplings");
    }
}
