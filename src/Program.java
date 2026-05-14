import ChainOfResponsability.clase.*;
import Observer.clase.Customer;
import Observer.clase.OrderNotifier;
import ex5Test2.ChainOfResponsability.*;


public class Program {
    public static void main(String[] args) {

        // comanda clientului
        OrderRestaurant order = new OrderRestaurant(
                5,
                "Bucuresti, Sector 3",
                true
        );


        RestaurantHandler stock = new StockCheck();
        RestaurantHandler payment = new PaymentCheck();
        RestaurantHandler address = new AdresCheck();
        RestaurantHandler kitchen = new Kitchen();

        stock.setNext(payment);
        payment.setNext(address);
        address.setNext(kitchen);
        stock.handler(order);


    }
}