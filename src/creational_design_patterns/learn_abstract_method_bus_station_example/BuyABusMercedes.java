package creational_design_patterns.learn_abstract_method_bus_station_example;

public class BuyABusMercedes extends BusStation {

    @Override
    public Transportable buyABus() {
        return new BusMercedes();
    }
}
