package creational_design_patterns.factory_method_furniture;

import java.util.Scanner;

public class ProductionDemo {

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
