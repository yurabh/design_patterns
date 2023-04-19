package structural_design_patterns.decorator.client;

import structural_design_patterns.decorator.Car;
import structural_design_patterns.decorator.impl.BasicCar;
import structural_design_patterns.decorator.impl.LuxuryCar;
import structural_design_patterns.decorator.impl.SportsCar;

public class DecoratorPatternClient {
    public static void main(String[] args) {
        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();
        System.out.println("\n*****");

        Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
        sportsLuxuryCar.assemble();
    }
}
