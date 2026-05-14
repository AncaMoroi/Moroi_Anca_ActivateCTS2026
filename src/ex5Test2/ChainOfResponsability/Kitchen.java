package ex5Test2.ChainOfResponsability;

public class Kitchen extends RestaurantHandler{
    @Override
    public void handler(OrderRestaurant orderRestaurant) {
        System.out.println("Comanda e in curs de pregatire");
        super.handler(orderRestaurant);
    }
}
