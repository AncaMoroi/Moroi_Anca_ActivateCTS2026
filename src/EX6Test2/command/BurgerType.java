package EX6Test2.command;

public class BurgerType implements OrdineComenzi{
    private Bucatar bucatar;

    public BurgerType(Bucatar bucatar) {
        this.bucatar = bucatar;
    }

    @Override
    public void execute() {
        bucatar.createBurger();
    }
}
