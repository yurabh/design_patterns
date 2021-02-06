package learn_abstract_factory_furniture_example;

public class ModerTable implements Table {

    @Override
    public void putOn() {
        System.out.println("put on the modern table ");
    }

    @Override
    public void clean() {
        System.out.println("take out from the modern table ");
    }
}
