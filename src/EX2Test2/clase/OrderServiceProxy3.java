package EX2Test2.clase;

public class OrderServiceProxy3 implements OrderService{

    private RealOrderService2 order;
    private String functie;

    public OrderServiceProxy3( String functie) {
        this.order = new RealOrderService2();
        this.functie = functie;
    }

    @Override
    public void viewOrders() {
        if (functie.equalsIgnoreCase("manager") || functie.equalsIgnoreCase("ospatar")) {
            order.viewOrders();
        }
    }

    @Override
    public void deleteOrder() {
        if (functie.equalsIgnoreCase("manager")) {
            order.deleteOrder();
        } else {
            System.out.println("Cere managerului sa stearga comanda");
        }
    }
}
