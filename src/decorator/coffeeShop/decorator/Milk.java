package decorator.coffeeShop.decorator;

import decorator.coffeeShop.clasa.BasicCoffe;
import decorator.coffeeShop.clasa.ICoffe;

public  class Milk extends Decorator {

    public Milk(BasicCoffe basicCoffe) {
        super(basicCoffe);

    }

    @Override
    public void prepare() {
        super.prepare();
        System.out.println("Se adauga laptele");
    }
}
