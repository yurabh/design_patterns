package creational_design_patterns.abstract_factory_furniture.impl;

import creational_design_patterns.abstract_factory_furniture.Sofa;

public class HighTechSofa implements Sofa {

    @Override
    public void lainOn() {
        System.out.println("lay on a bad style HighTechSofa ");
    }

    @Override
    public void layOut() {
        System.out.println("put on the HighTechSofa something ");
    }
}
