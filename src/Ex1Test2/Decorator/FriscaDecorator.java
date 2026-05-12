package Ex1Test2.Decorator;

import Ex1Test2.clasa.BasicCoffeE;
import Ex1Test2.clasa.CoffeInterface;

public class FriscaDecorator extends CoffeeDecorator{


    public FriscaDecorator(CoffeInterface coffe) {
        super(coffe);
    }

    @Override
    public String getDescription() {
        return coffe.getDescription() + "frisca";
    }

    @Override
    public int getPrice() {
        return coffe.getPrice() + 2;
    }

    @Override
    public void prepare() {
        super.prepare();
    }
}
