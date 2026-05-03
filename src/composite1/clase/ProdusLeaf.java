package composite1.clase;

public class ProdusLeaf implements ItemComponent{
    private String nume;
    private float pret;

    public ProdusLeaf(String nume, float pret) {
        this.nume = nume;
        this.pret = pret;
    }

    @Override
    public void afisare() {
        System.out.println("Produsul "+nume+" are pretul de " +pret+ " ron");
    }

    @Override
    public float getPret() {
        return pret;
    }
}
