package behavioral_design_patterns.visitor.impl;

import behavioral_design_patterns.visitor.ShoppingCartVisitor;
import behavioral_design_patterns.visitor.domain.Book;
import behavioral_design_patterns.visitor.domain.Fruit;

public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {
    @Override
    public int visit(Book book) {
        int cost;
        if (book.getPrice() > 50) {
            cost = book.getPrice() - 5;
        } else {
            cost = book.getPrice();
        }
        System.out.println("Book ISBN: ".concat(book.getIsbnNumber()).concat(" cost: ") + cost);
        return cost;
    }

    @Override
    public int visit(Fruit fruit) {
        int cost = fruit.getPricePerKg() * fruit.getWeight();
        System.out.println(fruit.getName().concat(" cost:") + cost);
        return cost;
    }
}
