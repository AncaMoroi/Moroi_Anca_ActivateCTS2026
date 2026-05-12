package Ex1Test2.Decorator;


import Ex1Test2.clasa.BasicCoffeE;
import Ex1Test2.clasa.CoffeInterface;

public class ZaharDecorator extends CoffeeDecorator {

    public ZaharDecorator(CoffeInterface coffe) {
        super(coffe);
    }

    @Override
    public String getDescription() {
        return coffe.getDescription() + " zahar";
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
