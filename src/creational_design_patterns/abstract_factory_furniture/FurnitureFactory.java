package creational_design_patterns.abstract_factory_furniture;

public interface FurnitureFactory {

    Chair createChair();

    Table createTable();

    Sofa createSofa();
}
