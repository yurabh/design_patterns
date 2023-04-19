package creational_design_patterns.factory_method_bus_station.impl;

import creational_design_patterns.factory_method_bus_station.BusStation;
import creational_design_patterns.factory_method_bus_station.Transportable;

public class BuyABusMercedes extends BusStation {

    @Override
    public Transportable buyABus() {
        return new BusMercedes();
    }
}
