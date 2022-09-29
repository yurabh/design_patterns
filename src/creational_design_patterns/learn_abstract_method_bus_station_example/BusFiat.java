package creational_design_patterns.learn_abstract_method_bus_station_example;

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
