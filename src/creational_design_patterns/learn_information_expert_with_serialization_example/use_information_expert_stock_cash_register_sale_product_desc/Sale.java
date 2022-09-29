package creational_design_patterns.learn_information_expert_with_serialization_example.use_information_expert_stock_cash_register_sale_product_desc;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Sale {

    private LocalDate data;
    private LocalDate time;
    private List<SalesLineItem> salesItem;


    public Sale(LocalDate data, LocalDate time, List<SalesLineItem> salesItem) {
        this.data = data;
        this.time = time;
        this.salesItem = salesItem;
    }


    public Sale() {
        this.data = LocalDate.now();
        this.time = LocalDate.now();
        this.salesItem = new ArrayList<>();
    }


    public void addSaleLineItem() {
        data = LocalDate.now();
        time = LocalDate.now();
        System.out.print("Enter count of product you want to search: ");
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        List<SalesLineItem> salesLineItems = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            System.out.print("Enter goods id which you want add to: ");
            Scanner scan1 = new Scanner(System.in);
            int id = scan1.nextInt();
            if (!Stock.findProduct(id)) {
                System.out.println("can't find goods: ");
                System.out.println(" ");
            } else {
                salesItem.add(SalesLineItem.addSalesItem(Stock.findProductInStock(id)));
                salesLineItems.add(SalesLineItem.addSalesItem(Stock.findProductInStock(id)));
            }
        }
        salesItem.addAll(salesLineItems);
    }


    public boolean verifyItems() {
        for (SalesLineItem i : salesItem) {
            if (Stock.verifyProduct(i.getItem())) {
                return true;
            }
        }
        return false;
    }


    public double getTotol() {
        double sumTotal = 0;
        for (SalesLineItem i : salesItem) {
            sumTotal += i.getSubTotal();
        }
        return sumTotal;
    }


    public void showSale() {
        System.out.println(" ");
        System.out.println("Sale");
        System.out.println("data: " + data);
        System.out.println("time: " + time);
        for (SalesLineItem i : salesItem) {
            i.showSalesItem();
        }
        System.out.println(" ");
    }


    public void setData(LocalDate data) {
        this.data = data;
    }


    public void setTime(LocalDate time) {
        this.time = time;
    }


    public void setSalesItem(ArrayList<SalesLineItem> salesItem) {
        this.salesItem = salesItem;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sale sale = (Sale) o;
        return Objects.equals(data, sale.data) &&
                Objects.equals(time, sale.time) &&
                Objects.equals(salesItem, sale.salesItem);
    }


    @Override
    public int hashCode() {
        return Objects.hash(data, time, salesItem);
    }


    @Override
    public String toString() {
        return "Sale{" +
                "data=" + data +
                ", time=" + time +
                ", salesItem=" + salesItem +
                '}';
    }
}
