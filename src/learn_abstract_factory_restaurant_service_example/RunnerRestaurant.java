package learn_abstract_factory_restaurant_service_example;

import java.util.Scanner;

public class RunnerRestaurant {

    public static void main(String[] args) {

        RestaurantClient client = null;

        System.out.println("1 - Ukrainian Kitchen");
        System.out.println("2 - Polish Kitchen");
        System.out.println("1 - Italian Kitchen");
        Scanner sc = new Scanner(System.in);

        int choice;

        System.out.println("Enter please with kitchen you wont:");

        choice = sc.nextInt();

        switch (choice) {
            case 1:
                client = new RestaurantClient(new UkrainianKitchen());
                break;
            case 2:
                client = new RestaurantClient(new PolishKitchen());
                break;
            case 3:
                client = new RestaurantClient(new ItalianKitchen());

        }
        client.checkingDumplings();
        client.checkingMacaroni();
        client.checkingSoup();
    }
}
