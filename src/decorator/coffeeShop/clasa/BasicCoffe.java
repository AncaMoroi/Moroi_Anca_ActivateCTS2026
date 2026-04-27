package decorator.coffeeShop.clasa;

public class BasicCoffe implements ICoffe {

    private double pret;
    private int ml;

    public BasicCoffe(double pret, int ml) {
        super();
        this.pret = pret;
        this.ml = ml;
    }

    public void prepare() {
        System.out.println("Se macina cafeaua la pretul de"+pret+"si la"+ml+"ml" );
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public int getMl() {
        return ml;
    }

    public void setMl(int ml) {
        this.ml = ml;
    }
}
