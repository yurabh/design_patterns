package creational_design_patterns.learn_abstract_factory_restaurant_service_example;

public class UkrainianKitchen implements Restaurant {

    @Override
    public Macaroni prepareMacaroni() {
        return new UkrainianMacaroni();
    }

    @Override
    public Soup prepareSoup() {
        return new UkrainianSoup();
    }

    @Override
    public Dumplings prepareDumplings() {
        return new UkrainianDumplings();
    }
}
