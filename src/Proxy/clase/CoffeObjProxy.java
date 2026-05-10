package Proxy.clase;

public class CoffeObjProxy {

    private String denumire;
    private double pret;

    public CoffeObjProxy(String denumire, double pret) {
        this.denumire = denumire;
        this.pret = pret;
    }

    public String getDenumire() {
        return denumire;
    }

    public double getPret() {
        return pret;
    }
}
