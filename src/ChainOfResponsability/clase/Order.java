package ChainOfResponsability.clase;

public class Order {
    String item;
    boolean paid;
    boolean inStock;

    public Order(String item, boolean paid, boolean inStock) {
        this.item = item;
        this.paid = paid;
        this.inStock = inStock;
    }
}
