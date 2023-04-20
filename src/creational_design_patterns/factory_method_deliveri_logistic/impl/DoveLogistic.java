package creational_design_patterns.factory_method_deliveri_logistic.impl;

import creational_design_patterns.factory_method_deliveri_logistic.DeliveryLogistic;
import creational_design_patterns.factory_method_deliveri_logistic.Transport;

public class DoveLogistic extends DeliveryLogistic {

    public Transport useTransport() {
        return new Dove();
    }
}
