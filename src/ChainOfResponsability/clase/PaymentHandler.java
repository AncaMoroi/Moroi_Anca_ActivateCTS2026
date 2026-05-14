package ChainOfResponsability.clase;

public class PaymentHandler extends OrderHandler{
    @Override
    public void handle(Order order) {
        if(!order.paid) {
            System.out.println("Plata nu a fost efecutata");
            return;
        }
        System.out.println("Plata a fost acceptata");
        super.handle(order);
    }
}
