package structural_design_patterns.decorator.impl;

import structural_design_patterns.decorator.Car;

public class BasicCar implements Car {
    @Override
    public void assemble() {
        System.out.print("Basic Car.");
    }
}
