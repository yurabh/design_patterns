package creational_design_patterns.abstract_factory_furniture.impl;

import creational_design_patterns.abstract_factory_furniture.Chair;

public class HighTechChair implements Chair {

    @Override
    public void sitOn() {
        System.out.println("sit at a chair style highTechChair ");
    }

    @Override
    public void move() {
        System.out.println("Stand on chair style highTechChair ");
    }
}
