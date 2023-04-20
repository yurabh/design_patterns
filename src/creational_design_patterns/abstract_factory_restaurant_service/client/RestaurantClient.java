package creational_design_patterns.abstract_factory_restaurant_service.client;

import creational_design_patterns.abstract_factory_restaurant_service.Dumplings;
import creational_design_patterns.abstract_factory_restaurant_service.Macaroni;
import creational_design_patterns.abstract_factory_restaurant_service.Restaurant;
import creational_design_patterns.abstract_factory_restaurant_service.Soup;

public class RestaurantClient {

    private final Macaroni macaroni;
    private final Soup soup;
    private final Dumplings dumplings;

    public RestaurantClient(Restaurant restaurant) {
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
