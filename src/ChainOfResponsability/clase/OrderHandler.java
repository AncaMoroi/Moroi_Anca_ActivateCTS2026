package ChainOfResponsability.clase;

public abstract class OrderHandler {
    protected OrderHandler next;

    public void setNext(OrderHandler next) {
        this.next = next;
    }

    public void handle(Order order) {
        if (next != null) {
            next.handle(order);
        }
    }
}
