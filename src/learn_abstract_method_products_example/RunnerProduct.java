package learn_abstract_method_products_example;

import java.util.Scanner;

public class RunnerProduct {
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
