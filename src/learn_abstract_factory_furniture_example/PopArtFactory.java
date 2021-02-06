package learn_abstract_factory_furniture_example;

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
