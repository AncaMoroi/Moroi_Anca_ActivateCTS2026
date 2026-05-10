package Proxy.clase;

public class ObjCoffeeMachine implements CoffeService{

public ObjCoffeeMachine() {
    System.out.println("Se pregateste aparatul");
}
    @Override
    public void serverCoffee(CoffeObjProxy coffeObjProxy) {

        System.out.println("Prepar: " + coffeObjProxy.getDenumire() + " la pretul de " + coffeObjProxy.getPret() + " lei." );

    }
}
