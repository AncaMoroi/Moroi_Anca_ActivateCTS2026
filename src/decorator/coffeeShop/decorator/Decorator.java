package decorator.coffeeShop.decorator;

import decorator.coffeeShop.clasa.BasicCoffe;
import decorator.coffeeShop.clasa.ICoffe;

public abstract class Decorator implements ICoffe {
    protected BasicCoffe basicCoffe;

    public Decorator(BasicCoffe basicCoffe) {
        this.basicCoffe = basicCoffe;
    }

    @Override
    public void prepare() {
        basicCoffe.prepare();
        System.out.println("Se prepara cafeaua");
    }
}
