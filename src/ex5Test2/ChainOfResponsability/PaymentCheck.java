package ex5Test2.ChainOfResponsability;

public class PaymentCheck extends RestaurantHandler{
    @Override
    public void handler(OrderRestaurant orderRestaurant) {
        if (!orderRestaurant.isPlata()) {
            System.out.println("Plata neefectuata");
            return;
        }
        System.out.println("Plata acceptata");
        super.handler(orderRestaurant);
    }
}
