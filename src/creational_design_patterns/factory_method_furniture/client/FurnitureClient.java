package creational_design_patterns.factory_method_furniture.client;

import creational_design_patterns.factory_method_furniture.impl.ChairFactory;
import creational_design_patterns.factory_method_furniture.Factory;
import creational_design_patterns.factory_method_furniture.impl.TableFactory;

import java.util.Scanner;

public class FurnitureClient {

    private static Factory create;

    public static void createFurniture(String typeFurniture) {
        if (typeFurniture.equalsIgnoreCase("table")) {
            create = new TableFactory();
        } else if (typeFurniture.equalsIgnoreCase("chair")) {
            create = new ChairFactory();
        } else {
            System.out.println("No fabric");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String typeFurniture;

        System.out.print("Make your choice about furniture: ");

        typeFurniture = sc.nextLine();

        createFurniture(typeFurniture);

        try {
            create.furnitureCreateProduction();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
