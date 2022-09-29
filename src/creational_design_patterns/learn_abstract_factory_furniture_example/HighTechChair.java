package creational_design_patterns.learn_abstract_factory_furniture_example;

public class HighTechChair implements Chair {

    @Override
    public void sitOn() {
        System.out.println("sit at a chair style highTechChair ");
    }

    @Override
    public void move() {
        System.out.println("Stand on chair style highTechChair ");
    }
}
