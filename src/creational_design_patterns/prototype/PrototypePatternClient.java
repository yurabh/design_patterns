package creational_design_patterns.prototype;

import java.util.List;

public class PrototypePatternClient {
    public static void main(String[] args)  {
        Employees employees = new Employees();
        employees.loadData();

        Employees employeesClonedOne = (Employees) employees.clone();
        Employees employeesClonedTwo = (Employees) employees.clone();

        List<String> clonedOneEmployees = employeesClonedOne.getEmployees();
        clonedOneEmployees.add("John");

        List<String> clonedTwoEmployees = employeesClonedTwo.getEmployees();
        clonedTwoEmployees.remove("Pankaj");

        System.out.println("employees  List: " + employees.getEmployees());
        System.out.println("employeesClonedOne List: " + clonedOneEmployees);
        System.out.println("employeesClonedTwo List: " + clonedTwoEmployees);
        System.out.println("employees  List: " + employees.getEmployees());
    }
}
