package ChainOfResponsability.clase;

public class  StockHandler extends OrderHandler{
    @Override
    public void handle(Order order) {
       if(!order.inStock) {
           System.out.println("Producul nu este in stock");
           return;
       }
        System.out.println("Produsul este in stoc");
       super.handle(order);
    }
}
