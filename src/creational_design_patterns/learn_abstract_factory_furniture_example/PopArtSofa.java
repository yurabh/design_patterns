package creational_design_patterns.learn_abstract_factory_furniture_example;

public class PopArtSofa implements Sofa {

    @Override
    public void lainOn() {
        System.out.println("lay on the bad popArtSofa");
    }

    @Override
    public void layOut() {
        System.out.println("stand up from the popArtSofa");
    }
}
