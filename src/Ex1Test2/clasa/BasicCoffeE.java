package Ex1Test2.clasa;

public class BasicCoffeE implements CoffeInterface{
    private String denumire;
    private int pret;

    public BasicCoffeE(String denumire, int pret) {
        super();
        this.denumire = denumire;
        this.pret = pret;
    }


    @Override
    public void prepare() {
    }

    @Override
    public String getDescription() {
        return denumire;
    }

    @Override
    public int getPrice() {
        return pret;
    }
}
