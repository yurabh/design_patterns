package creational_design_patterns.learn_information_expert_with_serialization_example.use_information_expert_stock_cash_register_sale_product_desc;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
import java.util.Scanner;

public class ProductDesc implements Serializable {

    private static final long serialVersionUID = 54L;
    private String description;
    private int price;
    private int itemId;
    private LocalDate dateOf;
    private LocalDate dataOfEndDate;


    public ProductDesc(int itemId, String description, int price, LocalDate dateOf, LocalDate dataOfEndDate) {
        this.itemId = itemId;
        this.description = description;
        this.price = price;
        this.dateOf = dateOf;
        this.dataOfEndDate = dataOfEndDate;
    }

    public ProductDesc(String description, int price, int itemId, LocalDate dateOf, LocalDate dataOfEndDate) {
        this.description = description;
        this.price = price;
        this.itemId = itemId;
        this.dateOf = dateOf;
        this.dataOfEndDate = dataOfEndDate;
    }

    public ProductDesc() {
        this.description = null;
        this.price = 0;
        this.itemId = 0;
        this.dateOf = LocalDate.of(2018, 02, 29);
        this.dataOfEndDate = LocalDate.of(2018, 03, 13);
    }


    public ProductDesc(int itemId, String description, int price) {
        this.itemId = itemId;
        this.description = description;
        this.price = price;
    }


    public static LocalDate dateProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter moth: ");
        int mouth = sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Enter date: ");
        int day = sc2.nextInt();
        return LocalDate.of(year, mouth, day);
    }


    public static boolean validateItem(ProductDesc productDesc) {
        LocalDate localDate = productDesc.getDateOf();
        if (productDesc.dataOfEndDate.getYear() > localDate.getYear()) {
            return true;
        }
        return false;
    }


    public boolean equalsName(String name) {
        if (description.equals(name)) {
            return true;
        }
        return false;
    }


    public boolean equalsId(int id) {
        if (itemId == id) {
            return true;
        }
        return false;
    }


    public static boolean verifyProduct(ProductDesc productDesc) {
        if (productDesc.description != null && productDesc.itemId != 0 && productDesc.price != 0) {
            return true;
        } else {
            return false;
        }
    }


    public LocalDate getDateOf() {
        return dateOf;
    }

    public LocalDate getDataOfEndDate() {
        return dataOfEndDate;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ProductDesc that = (ProductDesc) o;
        return Objects.equals(description, that.description);
    }


    @Override
    public int hashCode() {
        return Objects.hash(description, price, itemId);
    }


    @Override
    public String toString() {
        return "ProductDesc{" +
                "description='" + description + '\'' +
                ", price=" + price +
                ", itemId=" + itemId +
                ", dateOf=" + dateOf +
                ", dataOfEndDate=" + dataOfEndDate +
                '}';
    }


    public void showProductDesc() {
        System.out.println(" ");
        System.out.println("Product");
        System.out.println(" ");
        System.out.println("description: " + description);
        System.out.println("price: " + price);
        System.out.println("itemId: " + itemId);
        System.out.println("DataOf: " + dateOf);
        System.out.println("DataEnd: " + dataOfEndDate);
        System.out.println(" ");
    }
}
