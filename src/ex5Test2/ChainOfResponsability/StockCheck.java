package ex5Test2.ChainOfResponsability;

public class StockCheck extends RestaurantHandler{

    @Override
    public void handler(OrderRestaurant orderRestaurant) {
        if (orderRestaurant.getStock() == 0) {
            System.out.println("Nu mai este stock");
            return;
        }
        System.out.println("Exista in stock");
        super.handler(orderRestaurant);
    }
}
