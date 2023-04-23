package behavioral_design_patterns.visitor.domain;

import behavioral_design_patterns.visitor.ItemElement;
import behavioral_design_patterns.visitor.ShoppingCartVisitor;

public class Fruit implements ItemElement {
    private final int pricePerKg;
    private final int weight;
    private final String name;

    public Fruit(int priceKg, int weight, String name) {
        this.pricePerKg = priceKg;
        this.weight = weight;
        this.name = name;
    }

    public int getPricePerKg() {
        return pricePerKg;
    }


    public int getWeight() {
        return weight;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public int accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
