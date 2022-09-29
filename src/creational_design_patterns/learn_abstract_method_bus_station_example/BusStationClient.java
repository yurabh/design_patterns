package creational_design_patterns.learn_abstract_method_bus_station_example;

import java.util.Scanner;

public class BusStationClient {

    private static BusStation busStation;

    public static void selectABusForTheLine(String typeBys) {

        if (typeBys.equalsIgnoreCase("fiat")) {
            busStation = new BuyABusFiat();
        } else if (typeBys.equalsIgnoreCase("mercedes")) {
            busStation = new BuyABusMercedes();
        } else {
            System.out.println("There isn't a bus.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String typeBus;

        System.out.print("Enter the name of the bus for the program: ");

        typeBus = sc.nextLine();

        selectABusForTheLine(typeBus);
        try {
            busStation.busOnTheLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
