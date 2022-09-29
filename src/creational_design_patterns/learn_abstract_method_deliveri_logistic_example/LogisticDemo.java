package creational_design_patterns.learn_abstract_method_deliveri_logistic_example;

import java.util.Scanner;

public class LogisticDemo {

    private static DeliveryLogistic deliveryLogistic;

    public static void sepUpTransport(String type) {

        if (type.equalsIgnoreCase("dove")) {
            deliveryLogistic = new DoveLogistic();
        } else if (type.equalsIgnoreCase("drone")) {
            deliveryLogistic = new DroneLogistic();
        } else {
            System.out.println("No one");
        }
    }

    public static void runLogic() {
        deliveryLogistic.planDelivery();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Check delivery system: ");

        String deliveryType = sc.next();

        sepUpTransport(deliveryType);

        runLogic();
    }
}
