package creational_design_patterns.factory_method_deliveri_logistic.client;

import creational_design_patterns.factory_method_deliveri_logistic.DeliveryLogistic;
import creational_design_patterns.factory_method_deliveri_logistic.impl.DoveLogistic;
import creational_design_patterns.factory_method_deliveri_logistic.impl.DroneLogistic;

import java.util.Scanner;

public class DeliveryLogisticClient {

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
