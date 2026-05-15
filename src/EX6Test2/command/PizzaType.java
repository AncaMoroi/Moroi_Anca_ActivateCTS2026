package EX6Test2.command;

import Command.OrderCommand;

public class PizzaType implements OrdineComenzi {

    public Bucatar bucatar;

    public PizzaType(Bucatar bucatar) {
        this.bucatar = bucatar;
    }


    @Override
    public void execute() {
        bucatar.createPizza();
    }
}
