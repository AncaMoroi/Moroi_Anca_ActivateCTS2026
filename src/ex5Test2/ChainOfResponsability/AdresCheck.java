package ex5Test2.ChainOfResponsability;

public class AdresCheck extends RestaurantHandler{
    @Override
    public void handler(OrderRestaurant orderRestaurant) {
        if (orderRestaurant.getAdresa() == null) {
            System.out.println("Trebuie completata adresa");
            return;
        }
        System.out.println("Adresa validata");
        super.handler(orderRestaurant);
    }
}
