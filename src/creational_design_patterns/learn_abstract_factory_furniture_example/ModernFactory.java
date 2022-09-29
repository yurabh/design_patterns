package creational_design_patterns.learn_abstract_factory_furniture_example;

public class ModernFactory implements FurnitureFactory {

    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Table createTable() {
        return new ModerTable();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}
