package behavioral_design_patterns.strategy.domain;

public class Item {
    private final String upcCode;
    private final int price;

    public Item(String upcCode, int cost) {
        this.upcCode = upcCode;
        this.price = cost;
    }

    public String getUpcCode() {
        return upcCode;
    }

    public int getPrice() {
        return price;
    }
}
