package creational_design_patterns.factory_method_furniture.impl;

import creational_design_patterns.factory_method_furniture.Creatable;
import creational_design_patterns.factory_method_furniture.Factory;

public class ChairFactory extends Factory {

    public Creatable create() {
        return new Chair();
    }
}
