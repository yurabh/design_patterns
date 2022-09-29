package creational_design_patterns.learn_abstract_factory_restaurant_service_example;

public class RestaurantClient {

    private Macaroni macaroni;
    private Soup soup;
    private Dumplings dumplings;

    RestaurantClient(Restaurant restaurant) {
        this.macaroni = restaurant.prepareMacaroni();
        this.soup = restaurant.prepareSoup();
        this.dumplings = restaurant.prepareDumplings();
    }

    void checkingMacaroni() {
        this.macaroni.cookMacaroni();
        this.macaroni.putOnSaleMacaroni();
    }

    void checkingSoup() {
        this.soup.cookSoup();
        this.soup.putOnSaleSoup();
    }

    void checkingDumplings() {
        this.dumplings.cookDumplings();
        this.dumplings.putOnSaleDumplings();
    }
}
