import adapter.obiecte.inchirieremasini.Masina;
import adapter.obiecte.inchirieremasini.MasiniInchiriate;
import adapter.obiecte.obiecte.IPachetTuristic;
import adapter.obiecte.obiecte.PachetMasinaInchiriata;
import adapterEx1.comanda.AdapterComandaRestaurant;
import adapterEx1.comanda.IComandaMancare;
import adapterEx1.obiecte.ComandaRestaurant;
import adapterEx1.obiecte.PlasareComandaRestaurant;
import facade.hotel.Facade;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Program {
    public static void main(String[] args) {


        //Facade
        Facade hotelFacade = new Facade();
        hotelFacade.checkIn("Andrei Popescu", "204");


    }
}