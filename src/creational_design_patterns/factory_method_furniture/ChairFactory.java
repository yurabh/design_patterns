package creational_design_patterns.factory_method_furniture;

public class ChairFactory extends Factory {

    public Creatable create() {
        return new Chair();
    }
}
