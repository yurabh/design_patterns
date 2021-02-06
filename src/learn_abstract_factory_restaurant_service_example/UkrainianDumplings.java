package learn_abstract_factory_restaurant_service_example;

public class UkrainianDumplings implements Dumplings {

    @Override
    public void cookDumplings() {
        System.out.println("cooking Ukrainian dumplings");
    }

    @Override
    public void putOnSaleDumplings() {
        System.out.println("put onSale Ukrainian dumplings");
    }
}
