package creational_design_patterns.learn_abstract_factory_furniture_example;

public interface FurnitureFactory {

    Chair createChair();

    Table createTable();

    Sofa createSofa();
}
