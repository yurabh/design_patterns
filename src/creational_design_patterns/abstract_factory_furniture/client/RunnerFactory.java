package creational_design_patterns.abstract_factory_furniture.client;

import creational_design_patterns.abstract_factory_furniture.impl.HighTechFactory;
import creational_design_patterns.abstract_factory_furniture.impl.ModernFactory;
import creational_design_patterns.abstract_factory_furniture.impl.PopArtFactory;

import java.util.Scanner;

public class RunnerFactory {

    public static void main(String[] args) {

        FactoryClient client = null;

        Scanner sc = new Scanner(System.in);

        int choice;

        System.out.println("Get and Use High Tech Furniture ");

        System.out.println("Get and Use Modern Furniture ");

        System.out.println("Get and Use PopArt Furniture ");

        System.out.println("- >");

        choice = sc.nextInt();
        switch (choice) {
            case 1:
                client = new FactoryClient(new HighTechFactory());
                break;
            case 2:
                client = new FactoryClient(new ModernFactory());
                break;
            case 3:
                client = new FactoryClient(new PopArtFactory());
                break;
        }

        System.out.println("Test Using Furniture\n");

        client.testChair();

        client.testSofa();

        client.testTable();
    }
}
