package behavioral_design_patterns.visitor;

import behavioral_design_patterns.visitor.domain.Book;
import behavioral_design_patterns.visitor.domain.Fruit;

public interface ShoppingCartVisitor {
    int visit(Book book);

    int visit(Fruit fruit);
}
