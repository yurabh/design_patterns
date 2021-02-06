package learn_abstract_factory_restaurant_service_example;

public class ItalianDumplings implements Dumplings {

    @Override
    public void cookDumplings() {
        System.out.println("cooking italian dumplings");
    }

    @Override
    public void putOnSaleDumplings() {
        System.out.println("put onSale Italian dumplings");
    }
}
