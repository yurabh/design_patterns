package creational_design_patterns.factory_method_furniture;

public interface Creatable {

    void createProduction();

    void cutTheWorkpiece(int countLegs, int legLength, int lengthOf, int width);

    void chopWorkpieces(String color);

    void gluesChair(String glue);

    void show();
}
