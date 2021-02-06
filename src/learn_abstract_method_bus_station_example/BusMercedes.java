package learn_abstract_method_bus_station_example;

public class BusMercedes implements Transportable {

    @Override
    public void arrivalOfTheBus() {
        System.out.println("Bus Mercedes arrives");
    }

    @Override
    public void loadingPassengers() {
        System.out.println("Passengers get on the Mercedes bus ");
    }

    @Override
    public void departingABus() {
        System.out.println("Bus Mercedes move at time ");
    }

    @Override
    public void unloadingPassengers() {
        System.out.println("Get out passengers from the Mercedes bus");
    }
}
