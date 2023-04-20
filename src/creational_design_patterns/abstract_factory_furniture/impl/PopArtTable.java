package creational_design_patterns.abstract_factory_furniture.impl;

import creational_design_patterns.abstract_factory_furniture.Table;

public class PopArtTable implements Table {

    @Override
    public void putOn() {
        System.out.println("put something on popArtTable");
    }

    @Override
    public void clean() {
        System.out.println("take something from the table popArtTable");
    }
}
