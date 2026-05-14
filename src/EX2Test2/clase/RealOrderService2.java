package EX2Test2.clase;

public class RealOrderService2 implements OrderService{

    @Override
    public void viewOrders() {
        System.out.println("Afisare comenzi");

    }

    @Override
    public void deleteOrder() {
        System.out.println("Stergere comenzi");
    }
}
