package adapterEx1.obiecte;

public class ComandaRestaurant {
    private  String numePreparat;

    public String getNumePreparat() {
        return numePreparat;
    }

    public void setNumePreparat(String numePreparat) {
        this.numePreparat = numePreparat;
    }

    public ComandaRestaurant(String numePreparat) {
        this.numePreparat = numePreparat;
    }



    @Override
    public String toString() {
        return    numePreparat + '\'' ;
    }
}
