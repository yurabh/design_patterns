package creational_design_patterns.factory_method_bus_station;

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
