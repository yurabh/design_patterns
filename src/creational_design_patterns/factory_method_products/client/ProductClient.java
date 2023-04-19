package creational_design_patterns.factory_method_products.client;

import creational_design_patterns.factory_method_products.Creator;
import creational_design_patterns.factory_method_products.impl.ConcreteCreateA;
import creational_design_patterns.factory_method_products.impl.ConcreteCreateB;

import java.util.Scanner;

public class ProductClient {
    private static Creator creator;

    public static void useProducts(String type) {
        if (type.equalsIgnoreCase("Product: one")) {
            creator = new ConcreteCreateA();
        } else if (type.equalsIgnoreCase("Product: two")) {
            creator = new ConcreteCreateB();
        } else {
            System.out.println("Don't create product");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of product: ");
        String product = sc.nextLine();
        useProducts(product);
        creator.realisationProduct();
    }
}
