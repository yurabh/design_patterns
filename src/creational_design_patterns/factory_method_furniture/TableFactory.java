package creational_design_patterns.factory_method_furniture;

public class TableFactory extends Factory {

    public Creatable create() {
        return new Table();
    }
}
