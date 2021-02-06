package learn_abstract_factory_restaurant_service_example;

public class PolishDumplings implements Dumplings {

    @Override
    public void cookDumplings() {
        System.out.println("cooking polish dumplings");
    }

    @Override
    public void putOnSaleDumplings() {
        System.out.println("put onSale polish dumplings");
    }
}
