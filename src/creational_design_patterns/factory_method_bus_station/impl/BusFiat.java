package creational_design_patterns.factory_method_bus_station.impl;

import creational_design_patterns.factory_method_bus_station.Transportable;

public class BusFiat implements Transportable {

    @Override
    public void arrivalOfTheBus() {
        System.out.println("Bus Fiat arrives");
    }

    @Override
    public void loadingPassengers() {
        System.out.println("Passengers get on the Fiat bus ");
    }

    @Override
    public void departingABus() {
        System.out.println("Bus Fiat move at time ");
    }

    @Override
    public void unloadingPassengers() {
        System.out.println("Get out passengers from the Fiat bus");
    }
}
