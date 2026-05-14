package ChainOfResponsability.clase;

public class KitchenHandler extends OrderHandler{
    @Override
    public void handle(Order order) {
        System.out.println("Comanda se efectueaza");
    }
}
