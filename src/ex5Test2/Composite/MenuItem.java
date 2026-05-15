package ex5Test2.Composite;



public class MenuItem implements MenuComponent {
    private String nume;
    private double price;

    public MenuItem(String nume, double price) {
        this.nume = nume;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void display() {
        System.out.println("Comanda ce contine " +  nume + " are pretul de " + price);
    }
}
