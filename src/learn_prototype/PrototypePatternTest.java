package learn_prototype;

import java.util.List;

public class PrototypePatternTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employees employees = new Employees();
        employees.loadData();

        Employees employeesClonedOne = (Employees) employees.clone();
        Employees employeesClonedTwo = (Employees) employees.clone();

        List<String> list = employeesClonedOne.getEmpList();
        list.add("John");

        List<String> list1 = employeesClonedTwo.getEmpList();
        list1.remove("Pankaj");

        System.out.println("employees  List: " + employees.getEmpList());
        System.out.println("employeesClonedOne List: " + list);
        System.out.println("employeesClonedTwo List: " + list1);
        System.out.println("employees  List: " + employees.getEmpList());
    }
}
