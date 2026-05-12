package Ex1Test2.Decorator;

import Ex1Test2.clasa.BasicCoffeE;
import Ex1Test2.clasa.CoffeInterface;

public class LapteDecorator extends CoffeeDecorator{

    public LapteDecorator(CoffeInterface coffe) {
        super(coffe);
    }

    @Override
    public String getDescription() {
        return coffe.getDescription() + " lapte ";
    }

    @Override
    public int getPrice() {
        return coffe.getPrice() + 3;
    }

    @Override
    public void prepare() {
        super.prepare();

    }
}
