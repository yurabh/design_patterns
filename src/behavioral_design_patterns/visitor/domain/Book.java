package behavioral_design_patterns.visitor.domain;

import behavioral_design_patterns.visitor.ItemElement;
import behavioral_design_patterns.visitor.ShoppingCartVisitor;

public class Book implements ItemElement {
    private final int price;
    private final String isbnNumber;

    public Book(int price, String isbNumber) {
        this.price = price;
        this.isbnNumber = isbNumber;
    }

    public int getPrice() {
        return price;
    }

    public String getIsbnNumber() {
        return isbnNumber;
    }

    @Override
    public int accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
