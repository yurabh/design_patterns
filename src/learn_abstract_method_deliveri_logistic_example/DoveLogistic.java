package learn_abstract_method_deliveri_logistic_example;

public class DoveLogistic extends DeliveryLogistic {

    public Transport useTransport() {
        return new Dove();
    }
}
