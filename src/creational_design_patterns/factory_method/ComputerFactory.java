package creational_design_patterns.factory_method;

import creational_design_patterns.factory_method.impl.Pc;
import creational_design_patterns.factory_method.impl.Server;

public class ComputerFactory {
    public static Computer getComputer(String type, String ram, String hdd, String cpu) {
        if ("Pc".equalsIgnoreCase(type)) {
            return new Pc(ram, hdd, cpu);
        } else if ("Server".equalsIgnoreCase(type)) {
            return new Server(ram, hdd, cpu);
        }
        return null;
    }
}
