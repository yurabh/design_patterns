package learn_abstract_factory_furniture_example;

public class HighTechSofa implements Sofa {

    @Override
    public void lainOn() {
        System.out.println("lay on a bad style HighTechSofa ");
    }

    @Override
    public void layOut() {
        System.out.println("put on the HighTechSofa something ");
    }
}
