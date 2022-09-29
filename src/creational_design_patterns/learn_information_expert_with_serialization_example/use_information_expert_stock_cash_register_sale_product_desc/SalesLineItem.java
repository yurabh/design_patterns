package creational_design_patterns.learn_information_expert_with_serialization_example.use_information_expert_stock_cash_register_sale_product_desc;

import java.util.Objects;

public class SalesLineItem {

    private ProductDesc item;
    private int quantity;

    public SalesLineItem() {
        this.item = null;
        this.quantity = 0;
    }

    public SalesLineItem(ProductDesc item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public static SalesLineItem addSalesItem(ProductDesc product) {
        SalesLineItem ob = new SalesLineItem();
        ob.item = product;
        ob.quantity = 1;
        return ob;
    }

    public int getSubTotal() {
        return item.getPrice() * quantity;
    }

    public void showSalesItem() {
        System.out.println("SalesLineItem: ");
        item.showProductDesc();
        System.out.println("quantity: " + quantity);
        System.out.println(" ");
    }

    public ProductDesc getItem() {
        return item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setItem(ProductDesc item) {
        this.item = item;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SalesLineItem that = (SalesLineItem) o;
        return quantity == that.quantity &&
                Objects.equals(item, that.item);
    }

    @Override
    public int hashCode() {
        return Objects.hash(item, quantity);
    }

    @Override
    public String toString() {
        return "SalesLineItem{" +
                "item=" + item +
                ", quantity=" + quantity +
                '}';
    }
}
