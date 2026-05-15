package EC7Test2.Composite;

public class ProduseFastFood implements IFastFood{

    private String produse;
    private float price;

    public ProduseFastFood(String produse, float price) {
        this.produse = produse;
        this.price = price;
    }

    @Override
    public float getPrice() {
        return price;
    }

    @Override
    public void descriptio() {
        System.out.println("are pretul de " + price);
    }
}
