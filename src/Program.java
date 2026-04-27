import adapter.obiecte.inchirieremasini.Masina;
import adapter.obiecte.inchirieremasini.MasiniInchiriate;
import adapter.obiecte.obiecte.IPachetTuristic;
import adapter.obiecte.obiecte.PachetMasinaInchiriata;
import adapterEx1.comanda.AdapterComandaRestaurant;
import adapterEx1.comanda.IComandaMancare;
import adapterEx1.obiecte.ComandaRestaurant;
import adapterEx1.obiecte.PlasareComandaRestaurant;
import decorator.coffeeShop.clasa.BasicCoffe;
import decorator.coffeeShop.clasa.ICoffe;
import decorator.coffeeShop.decorator.Milk;
import decorator.coffeeShop.decorator.SugarDecorator;
import facade.hotel.Facade;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Program {
    public static void main(String[] args) {


        //Facade
        Facade hotelFacade = new Facade();
        hotelFacade.checkIn("Andrei Popescu", "204");

        //Decorator
        ICoffe c1 = new BasicCoffe(10, 200);
        c1.prepare();



        ICoffe c2 = new Milk(new BasicCoffe(10,200));
        c2.prepare();



        ICoffe c3 = new SugarDecorator(new BasicCoffe(10, 200));
        c3.prepare();


    }
}