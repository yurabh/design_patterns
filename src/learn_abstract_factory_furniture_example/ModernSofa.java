package learn_abstract_factory_furniture_example;

public class ModernSofa implements Sofa {

    @Override
    public void lainOn() {
        System.out.println("lay on the bad modern sofa ");
    }

    @Override
    public void layOut() {
        System.out.println("stand up from the bad modern sofa");
    }
}
