package decorator.coffeeShop.decorator;

import decorator.coffeeShop.clasa.BasicCoffe;


public class SugarDecorator extends Decorator {

    public SugarDecorator(BasicCoffe basicCoffe) {
        super(basicCoffe);

    }

    @Override
    public void prepare() {
        super.prepare();
        System.out.println("Se adauga zahar");
    }
}
