package creational_design_patterns.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable {
    private final List<String> employees;

    public Employees() {
        this.employees = new ArrayList<>();
    }
    public Employees(List<String> list) {
        this.employees = list;
    }

    public void loadData() {
        this.employees.add("Pankaj");
        this.employees.add("Raj");
        this.employees.add("David");
        this.employees.add("Lisa");
    }

    public List<String> getEmployees() {
        return employees;
    }

    @Override
    public Object clone() {
        List<String> temp = new ArrayList<>();
        for (String s : this.getEmployees()) {
            temp.add(s);
        }
        return new Employees(temp);
    }
}
