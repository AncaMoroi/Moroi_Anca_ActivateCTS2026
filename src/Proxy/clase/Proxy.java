package Proxy.clase;

public class Proxy implements CoffeService{
    private ObjCoffeeMachine machine;

    @Override
    public void serverCoffee(CoffeObjProxy coffeObjProxy) {

        System.out.println("Verific comanda");


        if (machine == null) {
            machine = new ObjCoffeeMachine();
        }

        if (coffeObjProxy.getPret() > 25) {
            System.out.println("Cafeaua este prea scumpa");
            return;
        }

        machine.serverCoffee(coffeObjProxy);
    }
}
