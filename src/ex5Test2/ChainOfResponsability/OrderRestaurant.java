package ex5Test2.ChainOfResponsability;

public class OrderRestaurant {

    private int stock;
    private String adresa;
    private boolean plata;

    public OrderRestaurant(int stock, String adresa, boolean plata) {
        this.stock = stock;
        this.adresa = adresa;
        this.plata = plata;
    }

    public int getStock() {
        return stock;
    }

    public String getAdresa() {
        return adresa;
    }

    public boolean isPlata() {
        return plata;
    }
}
