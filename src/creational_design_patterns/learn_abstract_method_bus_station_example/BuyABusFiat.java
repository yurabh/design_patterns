package creational_design_patterns.learn_abstract_method_bus_station_example;

public class BuyABusFiat extends BusStation {

    @Override
    public Transportable buyABus() {
        return new BusFiat();
    }
}
