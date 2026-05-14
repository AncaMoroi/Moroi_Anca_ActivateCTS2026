package EX4Test2.clase;

public class Facade {
    private  Inventory inventory;
    private Kitchen kitchen;
    private Plata plata;

    public Facade() {
        this.inventory = new Inventory();
        this.kitchen = new Kitchen();
        this.plata = new Plata();
    }

    public void placeOrder(String product, int quantity, double pret) {
        if (inventory.checkStock(quantity)) {
            inventory.removeStock(quantity);
            kitchen.cookOrder(product);
            plata.sumaRestaurant(pret);
        }
        else {
            System.out.println("Stock insuficient");
        }
    }

    //acces la subsisteme

    public Inventory getInventory() {
        return inventory;
    }
}
