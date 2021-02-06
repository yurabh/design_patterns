package learn_abstract_factory_furniture_example;

public class HighTechTable implements Table {

    @Override
    public void putOn() {
        System.out.println("put on the table style HighTechTable ");
    }

    @Override
    public void clean() {
        System.out.println("Take out from the table HighTechTable style ");
    }
}
