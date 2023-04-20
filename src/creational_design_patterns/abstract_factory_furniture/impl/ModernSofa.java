package creational_design_patterns.abstract_factory_furniture.impl;

import creational_design_patterns.abstract_factory_furniture.Sofa;

public class ModernSofa implements Sofa {

    @Override
    public void lainOn() {
        System.out.println("lay on the bad modern sofa ");
    }

    @Override
    public void layOut() {
        System.out.println("stand up from the bad modern sofa");
    }
}
