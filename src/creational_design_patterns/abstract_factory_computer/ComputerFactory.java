package creational_design_patterns.abstract_factory_computer;

public class ComputerFactory {
    public static Computer getComputer(ComputerAbstractFactory factory) {
        return factory.createComputer();
    }
}
