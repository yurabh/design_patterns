package behavioral_design_patterns.visitor;

public interface ItemElement {
    int accept(ShoppingCartVisitor visitor);
}
