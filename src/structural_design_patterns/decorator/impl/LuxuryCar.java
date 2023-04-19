package structural_design_patterns.decorator.impl;

import structural_design_patterns.decorator.Car;

public class LuxuryCar extends CarDecorator {
    public LuxuryCar(Car c) {
        super(c);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.print("Adding features of Luxury Car.");
    }
}
