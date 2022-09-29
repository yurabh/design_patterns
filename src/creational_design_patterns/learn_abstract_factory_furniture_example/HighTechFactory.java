package creational_design_patterns.learn_abstract_factory_furniture_example;

public class HighTechFactory implements FurnitureFactory {

    @Override
    public Chair createChair() {
        return new HighTechChair();
    }

    @Override
    public Table createTable() {
        return new HighTechTable();
    }

    @Override
    public Sofa createSofa() {
        return new HighTechSofa();
    }
}
