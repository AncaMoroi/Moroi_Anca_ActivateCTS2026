package EX4Test2.clase;

public class Inventory {
    private int stock = 10;


    public boolean checkStock(int quantity) {
        return stock >= quantity;
    }

    public void removeStock(int quantity) {
        stock -= quantity;
        System.out.println("Mai aveti " + stock + "stock ramas");
    }

    public void addStock(int quantity){
        stock += quantity;
        System.out.println("Acum aveti " + stock + "stock ramas");
    }
}
