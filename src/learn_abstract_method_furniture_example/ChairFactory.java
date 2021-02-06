package learn_abstract_method_furniture_example;

public class ChairFactory extends Factory {

    public Creatable create() {
        return new Chair();
    }
}
