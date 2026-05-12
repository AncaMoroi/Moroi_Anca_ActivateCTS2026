package Command;

public class PizzaCommand  implements OrderCommand{

    private ChefReceiver chef;

    public PizzaCommand(ChefReceiver chef) {
        this.chef = chef;
    }


    @Override
    public void execute() {
        chef.cookPizza();
    }
}
