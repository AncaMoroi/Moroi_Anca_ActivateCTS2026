package ex5Test2.ChainOfResponsability;

public abstract class RestaurantHandler {
    protected RestaurantHandler next;

    public void setNext(RestaurantHandler next) {
        this.next = next;
    }

    public void handler(OrderRestaurant orderRestaurant) {
        if (next != null) {
            next.handler(orderRestaurant);
        }
    }
}
