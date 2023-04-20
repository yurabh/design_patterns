package creational_design_patterns.abstract_factory_furniture.impl;

import creational_design_patterns.abstract_factory_furniture.Table;

public class ModerTable implements Table {

    @Override
    public void putOn() {
        System.out.println("put on the modern table ");
    }

    @Override
    public void clean() {
        System.out.println("take out from the modern table ");
    }
}
