package creational_design_patterns.abstract_factory_furniture.impl;

import creational_design_patterns.abstract_factory_furniture.Chair;

public class ModernChair implements Chair {

    @Override
    public void sitOn() {
        System.out.println("sit on the modern chair ");
    }

    @Override
    public void move() {
        System.out.println("stand up and move modern chair");
    }
}
