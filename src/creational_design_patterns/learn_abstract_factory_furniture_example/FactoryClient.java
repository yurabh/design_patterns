package creational_design_patterns.learn_abstract_factory_furniture_example;

public class FactoryClient {

    private Chair chair;
    private Table table;
    private Sofa sofa;

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
