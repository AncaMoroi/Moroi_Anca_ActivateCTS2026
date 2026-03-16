package adapterEx1.comanda;

import adapterEx1.obiecte.ComandaRestaurant;
import adapterEx1.obiecte.PlasareComandaRestaurant;

public class AdapterComandaRestaurant implements IComandaMancare{
    private PlasareComandaRestaurant plasareComandaRestaurant;

    public AdapterComandaRestaurant(PlasareComandaRestaurant plasareComandaRestaurant) {
        this.plasareComandaRestaurant = plasareComandaRestaurant;
    }

    @Override
    public void descriere() {
        System.out.println(plasareComandaRestaurant.toString());
    }

    @Override
    public void plaseazaComanda() {
        plasareComandaRestaurant.trimiteComanda();
    }

}
