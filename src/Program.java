import Command.*;
import Ex1Test2.Decorator.FriscaDecorator;
import Ex1Test2.Decorator.LapteDecorator;
import Ex1Test2.Decorator.ZaharDecorator;
import Ex1Test2.clasa.BasicCoffeE;
import Ex1Test2.clasa.CoffeInterface;
import Proxy.clase.CoffeObjProxy;
import Proxy.clase.CoffeService;
import Proxy.clase.ObjCoffeeMachine;
import Proxy.clase.Proxy;
import adapter.obiecte.inchirieremasini.Masina;
import adapter.obiecte.inchirieremasini.MasiniInchiriate;
import adapter.obiecte.obiecte.IPachetTuristic;
import adapter.obiecte.obiecte.PachetMasinaInchiriata;
import adapterEx1.comanda.AdapterComandaRestaurant;
import adapterEx1.comanda.IComandaMancare;
import adapterEx1.obiecte.ComandaRestaurant;
import adapterEx1.obiecte.PlasareComandaRestaurant;
import composite1.clase.CategorieComposite;
import composite1.clase.ItemComponent;
import composite1.clase.ProdusLeaf;
import decorator.coffeeShop.clasa.BasicCoffe;
import decorator.coffeeShop.clasa.ICoffe;
import decorator.coffeeShop.decorator.Milk;
import decorator.coffeeShop.decorator.SugarDecorator;
import facade.hotel.Facade;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Program {
    public static void main(String[] args) {


//        //Facade
//        Facade hotelFacade = new Facade();
//        hotelFacade.checkIn("Andrei Popescu", "204");
//
//        //Decorator
//        ICoffe c1 = new BasicCoffe(10, 200);
//        c1.prepare();
//
//        ICoffe c2 = new Milk(new BasicCoffe(10,200));
//        c2.prepare();
//
//        ICoffe c3 = new SugarDecorator(new BasicCoffe(10, 200));
//        c3.prepare();
//
//        ItemComponent espresso = new ProdusLeaf("Espresso", 10);
//        ItemComponent cappuccino = new ProdusLeaf("Cappuccino", 15);
//        ItemComponent latte = new ProdusLeaf("Latte", 18);
//        CategorieComposite bauturi = new CategorieComposite("Bauturi");
//        CategorieComposite cafele = new CategorieComposite("Cafele");
//
//        cafele.adauga(espresso);
//        cafele.adauga(cappuccino);
//
//        CategorieComposite meniu = new CategorieComposite("Meniu Coffee Shop");
//        meniu.adauga(bauturi);
//        meniu.adauga(cafele);
//
//        meniu.afisare();


//        //proxy
//        CoffeObjProxy cappucino = new CoffeObjProxy("Espresso", 12);
//
//        CoffeObjProxy luxuryCoffee = new CoffeObjProxy("Golden Coffee", 50);
//
//        CoffeService coffeeShop = new Proxy();
//
//        coffeeShop.serverCoffee(cappucino);
//
//
//        coffeeShop.serverCoffee(luxuryCoffee);


        /// Comand
        ChefReceiver chef = new ChefReceiver();

        OrderCommand pizzaOrder = new PizzaCommand(chef);

        OrderCommand pasta = new PastaCommand(chef);

        ChelnerInvoker chelner = new ChelnerInvoker();

        chelner.setOrderCommand(pizzaOrder);
        chelner.placeOrder();

        chelner.setOrderCommand(pasta);
        chelner.placeOrder();

        CoffeInterface coffee = new BasicCoffeE("Espresso", 10);
        System.out.println("Descriere: " + coffee.getDescription());
        System.out.println("Pret: " + coffee.getPrice());
        coffee = new LapteDecorator(coffee);
        System.out.println("Descriere: " + coffee.getDescription());
        System.out.println("Pret: " + coffee.getPrice());
        coffee = new FriscaDecorator(coffee);
        System.out.println("Descriere: " + coffee.getDescription());
        System.out.println("Pret: " + coffee.getPrice());
        coffee =  new ZaharDecorator((coffee));
        System.out.println("Descriere: " + coffee.getDescription());
        System.out.println("Pret: " + coffee.getPrice());

        coffee.prepare();




    }
}