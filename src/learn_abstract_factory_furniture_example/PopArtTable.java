package learn_abstract_factory_furniture_example;

public class PopArtTable implements Table {

    @Override
    public void putOn() {
        System.out.println("put something on popArtTable");
    }

    @Override
    public void clean() {
        System.out.println("take something from the table popArtTable");
    }
}
