package Command;

public class ChelnerInvoker {

    private OrderCommand orderCommand;


    public void setOrderCommand(OrderCommand orderCommand) {
        this.orderCommand = orderCommand;
    }

    public void placeOrder() {
        orderCommand.execute();
    }
}
