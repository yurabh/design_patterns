package learn_abstract_factory_furniture_example;

public class ModernChair implements Chair {

    @Override
    public void sitOn() {
        System.out.println("sit on the modern chair ");
    }

    @Override
    public void move() {
        System.out.println("stand up and move modern chair");
    }
}
