package creational_design_patterns.learn_abstract_method_furniture_example;

public class TableFactory extends Factory {

    public Creatable create() {
        return new Table();
    }
}
