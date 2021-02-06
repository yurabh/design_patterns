package learn_abstract_factory_restaurant_service_example;

public class PolishKitchen implements Restaurant {

    @Override
    public Macaroni prepareMacaroni() {
        return new PolishMacaroni();
    }

    @Override
    public Soup prepareSoup() {
        return new PolishSoup();
    }

    @Override
    public Dumplings prepareDumplings() {
        return new PolishDumplings();
    }
}
