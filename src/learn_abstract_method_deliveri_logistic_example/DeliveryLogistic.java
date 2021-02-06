package learn_abstract_method_deliveri_logistic_example;

public abstract class DeliveryLogistic {

    public abstract Transport useTransport();

    public void planDelivery() {
        Transport transport = useTransport();

        transport.deliverMail();
    }
}
