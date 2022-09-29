package creational_design_patterns.learn_abstract_factory_restaurant_service_example;

public class ItalianKitchen implements Restaurant {

    @Override
    public Macaroni prepareMacaroni() {
        return new ItalianMacaroni();
    }

    @Override
    public Soup prepareSoup() {
        return new ItalianSoup();
    }

    @Override
    public Dumplings prepareDumplings() {
        return new ItalianDumplings();
    }
}
