package creational_design_patterns.abstract_factory_furniture.impl;

import creational_design_patterns.abstract_factory_furniture.Chair;

public class PopArtChair implements Chair {

    @Override
    public void sitOn() {
        System.out.println("sit down on the popArtChair");
    }

    @Override
    public void move() {
        System.out.println("stand up form the popArtChair");
    }
}
