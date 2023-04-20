package creational_design_patterns.abstract_factory_furniture.impl;

import creational_design_patterns.abstract_factory_furniture.Table;

public class HighTechTable implements Table {

    @Override
    public void putOn() {
        System.out.println("put on the table style HighTechTable ");
    }

    @Override
    public void clean() {
        System.out.println("Take out from the table HighTechTable style ");
    }
}
