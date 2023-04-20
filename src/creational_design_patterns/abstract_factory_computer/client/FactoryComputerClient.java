package creational_design_patterns.abstract_factory_computer.client;

import creational_design_patterns.abstract_factory_computer.Computer;
import creational_design_patterns.abstract_factory_computer.ComputerFactory;
import creational_design_patterns.abstract_factory_computer.impl.PcFactory;
import creational_design_patterns.abstract_factory_computer.impl.ServerFactory;

public class FactoryComputerClient {
    public static void main(String[] args) {
        testAbstractFactory();
    }

    private static void testAbstractFactory() {
        Computer pc = ComputerFactory.getComputer(new PcFactory("2 GB", "500 GB", "2.4 GHz"));
        Computer server = ComputerFactory.getComputer(new ServerFactory("16 GB", "1 TB", "2.9 GHz"));
        System.out.println("AbstractFactory PC Config::" + pc);
        System.out.println("AbstractFactory Server Config::" + server);
    }
}
