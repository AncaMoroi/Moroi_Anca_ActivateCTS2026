package Command;

public class PastaCommand implements OrderCommand{

    private ChefReceiver chefReceiver;

    public PastaCommand(ChefReceiver chefReceiver) {
        this.chefReceiver = chefReceiver;
    }


    @Override
    public void execute() {
        chefReceiver.cookPasta();
    }
}
