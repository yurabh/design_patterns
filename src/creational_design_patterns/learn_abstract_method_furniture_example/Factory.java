package creational_design_patterns.learn_abstract_method_furniture_example;

public abstract class Factory {

    public abstract Creatable create();

    public void furnitureCreateProduction() {

        Creatable production = create();

        production.createProduction();

        production.gluesChair("PVA");

        production.chopWorkpieces("Green");

        production.cutTheWorkpiece(1, 2, 3, 4);

        production.show();
    }
}
