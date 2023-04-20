package creational_design_patterns.factory_method_deliveri_logistic.impl;

import creational_design_patterns.factory_method_deliveri_logistic.Transport;

public class Drone implements Transport {

    public void deliverMail() {
        System.out.println("send by drone");
    }
}
