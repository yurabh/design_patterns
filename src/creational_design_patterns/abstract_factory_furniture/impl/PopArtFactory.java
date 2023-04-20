package creational_design_patterns.abstract_factory_furniture.impl;

import creational_design_patterns.abstract_factory_furniture.Chair;
import creational_design_patterns.abstract_factory_furniture.FurnitureFactory;
import creational_design_patterns.abstract_factory_furniture.Sofa;
import creational_design_patterns.abstract_factory_furniture.Table;

public class PopArtFactory implements FurnitureFactory {

    @Override
    public Chair createChair() {
        return new PopArtChair();
    }

    @Override
    public Table createTable() {
        return new PopArtTable();
    }

    @Override
    public Sofa createSofa() {
        return new PopArtSofa();
    }
}
