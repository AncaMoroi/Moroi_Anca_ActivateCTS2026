package prototype;

public class Masini implements IListaMasini{
    private String marca;
    private int anFabricate;
    private double pret;

    public Masini() {

    }

    public Masini(String marca, int anFabricate, double pret) {
        this.marca = marca;
        this.anFabricate = anFabricate;
        this.pret = pret;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAnFabricate(int anFabricate) {
        this.anFabricate = anFabricate;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    @Override
    public void incarcaListaMasini() {
        this.marca = "Dacia";
        this.anFabricate = 2012;
        this.pret = 2000.00;
    }

    @Override
    public IListaMasini copiaza() {
        Masini copie = new Masini();
        copie.setAnFabricate((this.anFabricate));
        copie.setMarca((this.marca));
        copie.setPret((this.pret));

        return copie;
    }

    @Override
    public String toString() {
        return "Masini{" +
                "marca='" + marca + '\'' +
                ", anFabricate=" + anFabricate +
                ", pret=" + pret +
                '}';
    }
}
