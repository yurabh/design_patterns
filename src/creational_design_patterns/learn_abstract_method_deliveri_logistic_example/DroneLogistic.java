package creational_design_patterns.learn_abstract_method_deliveri_logistic_example;

public class DroneLogistic extends DeliveryLogistic {

    public Transport useTransport() {
        return new Drone();
    }
}
