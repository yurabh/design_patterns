package creational_design_patterns.abstract_factory_furniture.impl;

import creational_design_patterns.abstract_factory_furniture.Sofa;

public class PopArtSofa implements Sofa {

    @Override
    public void lainOn() {
        System.out.println("lay on the bad popArtSofa");
    }

    @Override
    public void layOut() {
        System.out.println("stand up from the popArtSofa");
    }
}
