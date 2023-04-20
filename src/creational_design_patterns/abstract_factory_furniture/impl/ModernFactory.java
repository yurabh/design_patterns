package creational_design_patterns.abstract_factory_furniture.impl;

import creational_design_patterns.abstract_factory_furniture.Chair;
import creational_design_patterns.abstract_factory_furniture.FurnitureFactory;
import creational_design_patterns.abstract_factory_furniture.Sofa;
import creational_design_patterns.abstract_factory_furniture.Table;

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
