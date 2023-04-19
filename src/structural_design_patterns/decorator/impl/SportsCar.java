package structural_design_patterns.decorator.impl;

import structural_design_patterns.decorator.Car;

public class SportsCar extends CarDecorator {
    public SportsCar(Car c) {
        super(c);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.print("Adding features of Sports Car.");
    }
}
