package creational_design_patterns.learn_abstract_factory_furniture_example;

public class PopArtChair implements Chair {

    @Override
    public void sitOn() {
        System.out.println("sit down on the popArtChair");
    }

    @Override
    public void move() {
        System.out.println("stand up form the popArtChair");
    }
}
