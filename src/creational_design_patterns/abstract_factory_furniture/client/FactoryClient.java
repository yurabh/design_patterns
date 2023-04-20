package creational_design_patterns.abstract_factory_furniture.client;

import creational_design_patterns.abstract_factory_furniture.Chair;
import creational_design_patterns.abstract_factory_furniture.FurnitureFactory;
import creational_design_patterns.abstract_factory_furniture.Sofa;
import creational_design_patterns.abstract_factory_furniture.Table;

public class FactoryClient {

    private final Chair chair;
    private final Table table;
    private final Sofa sofa;

    public FactoryClient(FurnitureFactory furnitureFactory) {
        this.chair = furnitureFactory.createChair();
        this.table = furnitureFactory.createTable();
        this.sofa = furnitureFactory.createSofa();
    }

    public void testChair() {
        this.chair.sitOn();
        this.chair.move();
    }

    public void testTable() {
        this.table.putOn();
        this.table.clean();
    }

    public void testSofa() {
        this.sofa.lainOn();
        this.sofa.layOut();
    }
}
