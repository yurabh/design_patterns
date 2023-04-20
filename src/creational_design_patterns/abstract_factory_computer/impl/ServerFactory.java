package creational_design_patterns.abstract_factory_computer.impl;

import creational_design_patterns.abstract_factory_computer.Computer;
import creational_design_patterns.abstract_factory_computer.ComputerAbstractFactory;

public class ServerFactory implements ComputerAbstractFactory {
    private final String ram;
    private final String hdd;
    private final String cpu;

    public ServerFactory(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public Computer createComputer() {
        return new Server(ram, hdd, cpu);
    }
}
