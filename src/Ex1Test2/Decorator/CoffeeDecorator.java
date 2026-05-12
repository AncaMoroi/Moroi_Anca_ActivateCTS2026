package Ex1Test2.Decorator;

import Ex1Test2.clasa.BasicCoffeE;
import Ex1Test2.clasa.CoffeInterface;

public abstract class CoffeeDecorator implements CoffeInterface {

    protected CoffeInterface coffe;

    public CoffeeDecorator(CoffeInterface coffe) {
        this.coffe = coffe;
    }

    @Override
    public String getDescription() {
        return coffe.getDescription();
    }

    @Override
    public int getPrice() {
        return coffe.getPrice();
    }

    @Override
    public void prepare() {
        coffe.prepare();
    }
}
