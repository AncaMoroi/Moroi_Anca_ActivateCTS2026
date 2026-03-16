package adapterEx1.obiecte;

public class PlasareComandaRestaurant {
    private ComandaRestaurant comandaRestaurant;

    public PlasareComandaRestaurant(ComandaRestaurant comandaRestaurant) {
        this.comandaRestaurant = comandaRestaurant;
    }

    public void trimiteComanda() {
        System.out.println("Comanda cu " + comandaRestaurant.toString());
    }

    @Override
    public String toString() {
        return "PlasareComandaRestaurant:" + " " + comandaRestaurant
                ;
    }
}
