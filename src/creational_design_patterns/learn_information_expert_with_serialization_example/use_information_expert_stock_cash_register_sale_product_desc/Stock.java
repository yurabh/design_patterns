package creational_design_patterns.learn_information_expert_with_serialization_example.use_information_expert_stock_cash_register_sale_product_desc;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Stock implements Serializable {

    private static ArrayList<ProductDesc> availableProducts = new ArrayList<>();
    private static ArrayList<ProductDesc> spoiledProducts = new ArrayList<>();
    private static ArrayList<ProductDesc> writtenOffProducts = new ArrayList<>();


    public static void addProduct(ProductDesc product) {
        if (Stock.verifyProduct(product)) {
            spoiledProducts.add(product);
        } else {
            System.out.println("Can't add empty product");
        }
    }


    public static void addProduct() {
        ProductDesc product = Stock.createProduct();
        if (Stock.verifyProduct(product)) {
            spoiledProducts.add(product);
        } else {
            System.out.println("Can't add empty product");
        }
    }


    public static ProductDesc createProduct() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter id product: ");
        int id = scan.nextInt();
        Scanner scan1 = new Scanner(System.in);
        System.out.print("Enter name product: ");
        String description = scan1.nextLine();
        Scanner scan2 = new Scanner(System.in);
        System.out.print("Enter price product: ");
        int price = scan2.nextInt();
        System.out.print("start date product: ");
        LocalDate date = ProductDesc.dateProduct();
        System.out.print("finish date product: ");
        LocalDate dataEnd = ProductDesc.dateProduct();
        ProductDesc productDesc = new ProductDesc(id, description, price, date, dataEnd);
        spoiledProducts.add(productDesc);
        return productDesc;
    }


    public static ProductDesc findProductInStock(int id) {
        ProductDesc product;
        for (ProductDesc i : availableProducts) {
            if (i.equalsId(id)) {
                product = i;
                availableProducts.remove(i);
                return product;
            }
        }
        return null;
    }


    public static boolean findProduct(int id) {
        for (ProductDesc i : availableProducts) {
            if (i.equalsId(id)) {
                return true;
            }
        }
        return false;
    }


    public static boolean verifyProduct(ProductDesc productdesc) {
        if (ProductDesc.verifyProduct(productdesc)) {
            return true;
        } else {
            return false;
        }
    }


    public static void revalueGoods() {
        System.out.print("Enter product id that you want change price");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        if (availableProducts.size() != 0) {
            for (int i = 0; i < availableProducts.size(); i++) {
                ProductDesc productDesc = availableProducts.get(i);
                if (productDesc.equalsId(id)) {
                    System.out.println("new price product: ");
                    Scanner sc1 = new Scanner(System.in);
                    int value = sc1.nextInt();
                    productDesc.setPrice(value);
                    availableProducts.remove(i);
                    availableProducts.add(i, productDesc);
                }
            }
        } else {
            System.out.println("empty stock");
        }
    }


    public static void validityProduct() {
        for (int i = 0; i < spoiledProducts.size() && spoiledProducts.size() != 0; i++) {
            {
                ProductDesc productDesc = spoiledProducts.get(i);
                if (ProductDesc.validateItem(productDesc)) {
                    availableProducts.add(productDesc);
                    spoiledProducts.remove(i);
                } else {
                    writtenOffProducts.add(productDesc);
                    spoiledProducts.remove(i);
                }
                i--;
            }
        }
    }


    public static List<ProductDesc> getProduct(ProductDesc product, int q) {
        List<ProductDesc> products1 = new ArrayList<>();
        if (Stock.verifyProduct(product) && (!availableProducts.isEmpty())) {
            for (ProductDesc pro : availableProducts) {
                if (pro.equals(product)) {
                    products1.add(pro);
                }
            }
            if (products1.size() == q) {
                for (ProductDesc prod : products1) {
                    if (prod.equals(product)) {
                        availableProducts.remove(prod);
                    }
                }
                return products1;
            }
            if (products1.size() == 0) {
                System.out.println("Cant find that product");
            }
            if (products1.size() != 0 && products1.size() != q) {
                System.out.println("In this time found this size of goods" + products1.size());
                System.out.println("If you want take this count of goods choose 1 or 2 (1 - yes ,two - no) ");
                Scanner scan = new Scanner(System.in);
                int number = scan.nextInt();
                if (number == 1) {
                    for (ProductDesc prod : products1) {
                        if (prod.equals(product)) {
                            availableProducts.remove(prod);
                        }
                    }
                    return products1;
                } else {
                    System.out.println("you wont take this count of goods");
                }
            }

        } else {
            System.out.println("stock is empty");
        }
        return products1;
    }


    public static List<ProductDesc> getProduct(String description, int q) {
        List<ProductDesc> products1 = new ArrayList<>();
        if ((!availableProducts.isEmpty())) {
            for (ProductDesc i : availableProducts) {
                if (i.equalsName(description)) {
                    products1.add(i);
                }
            }
            if (products1.size() == q) {
                for (ProductDesc prod : products1) {
                    if (prod.equalsName(description)) {
                        availableProducts.remove(prod);
                    }
                }
                return products1;
            }
            if (products1.size() == 0) {
                System.out.println("Cant find this product");
            }
            if (products1.size() != 0 && products1.size() != q) {
                System.out.println("In this time found this size of goods: " + products1.size());
                System.out.println("If you want take this count of goods choose 1 or 2 (1 - yes ,two - no): ");
                Scanner scan = new Scanner(System.in);
                int number = scan.nextInt();
                if (number == 1) {
                    for (ProductDesc prod : products1) {
                        if (prod.equalsName(description)) {
                            availableProducts.remove(prod);
                        }
                    }
                    return products1;
                } else {
                    System.out.println("you wont take this count of goods");
                }
            }
        } else {
            System.out.println("store is empty");
        }
        return products1;
    }


    public static boolean findProduct(String name) {
        if ((!availableProducts.isEmpty())) {
            for (ProductDesc i : availableProducts) {
                if (i.equalsName(name)) {
                    return true;
                }
            }
            System.out.println("Cant find product");
        } else {
            System.out.println("stock is empty");
        }
        return false;
    }


    public static boolean findProduct(ProductDesc productDesc) {
        if ((!availableProducts.isEmpty()) && Stock.verifyProduct(productDesc)) {
            for (ProductDesc i : availableProducts) {
                if (i.equals(productDesc)) {
                    System.out.println("Found product");
                    return true;
                }
            }
            System.out.println("Cant find product");
        } else {
            System.out.println("stock is empty");
        }
        return false;
    }


    public static void showStock() {
        System.out.println(" ");
        if (!spoiledProducts.isEmpty()) {
            System.out.println("All goods together");
            for (ProductDesc pro : spoiledProducts) {
                pro.showProductDesc();
            }
        }

        System.out.println(" ");
        if (!availableProducts.isEmpty()) {
            System.out.println("Valid goods");
            for (ProductDesc pro : availableProducts) {
                pro.showProductDesc();
            }
        }

        System.out.println(" ");
        if (!writtenOffProducts.isEmpty()) {
            System.out.println("not valid goods");
            for (ProductDesc pro : writtenOffProducts) {
                pro.showProductDesc();
            }
        }
    }


    public static void savaDataAvaibelproducts(String path) throws IOException {
        FileOutputStream file = null;
        ObjectOutputStream objectStream = null;
        try {
            file = new FileOutputStream(path);
            objectStream = new ObjectOutputStream(file);
            objectStream.writeObject(availableProducts);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            objectStream.close();
            file.close();
        }
    }


    public static void savaDataIncamproducts(String path) {
        FileOutputStream file;
        try {
            file = new FileOutputStream(path);
            ObjectOutputStream objectStream = new ObjectOutputStream(file);
            objectStream.writeObject(spoiledProducts);
            objectStream.close();
            file.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void savaDataSpusaniProductu(String path) {
        FileOutputStream file;
        ObjectOutputStream objectStream;
        try {
            file = new FileOutputStream(path);
            objectStream = new ObjectOutputStream(file);
            objectStream.writeObject(writtenOffProducts);
            objectStream.close();
            file.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static Object loadDataAvaibeleproducts(String path) {
        Object tmpObject = null;
        FileInputStream file;
        try {
            file = new FileInputStream(path);
            ObjectInputStream objectStream = new ObjectInputStream(file);
            tmpObject = objectStream.readObject();
            objectStream.close();
            file.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return tmpObject;
    }


    public static Object loadDataIncamproducts(String path) {
        Object tmpObject = null;
        FileInputStream file;
        ObjectInputStream objectStream;
        try {
            file = new FileInputStream(path);
            objectStream = new ObjectInputStream(file);
            tmpObject = objectStream.readObject();
            objectStream.close();
            file.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return tmpObject;
    }


    public static Object loadDataSpusani(String path) {
        Object tmpObject = null;
        FileInputStream file = null;
        ObjectInputStream objectStream = null;
        try {
            file = new FileInputStream(path);
            objectStream = new ObjectInputStream(file);
            tmpObject = objectStream.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                objectStream.close();
                file.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return tmpObject;
    }
}
