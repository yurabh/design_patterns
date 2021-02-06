package learn_abstract_method_bus_station_example;

public abstract class BusStation {

    public abstract Transportable buyABus();

    public void busOnTheLine() {
        Transportable transportable = buyABus();

        transportable.arrivalOfTheBus();

        transportable.loadingPassengers();

        transportable.departingABus();

        transportable.unloadingPassengers();
    }
}
