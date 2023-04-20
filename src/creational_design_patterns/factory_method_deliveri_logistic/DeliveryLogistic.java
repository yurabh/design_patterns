package creational_design_patterns.factory_method_deliveri_logistic;

public abstract class DeliveryLogistic {

    public abstract Transport useTransport();

    public void planDelivery() {
        Transport transport = useTransport();

        transport.deliverMail();
    }
}
