package adapter.obiecte.inchirieremasini;

public class Masina {

    private String Model;
    private int anFabricate;

    public String getModel() {
        return Model;
    }

    public int getAnFabricate() {
        return anFabricate;
    }

    public void setModel(String model) {
        Model = model;
    }

    public void setAnFabricate(int anFabricate) {
        this.anFabricate = anFabricate;
    }

    public Masina(String model, int anFabricate) {
        Model = model;
        this.anFabricate = anFabricate;
    }

    @Override
    public String toString() {
        return "Masina{" +
                "Model='" + Model + '\'' +
                ", anFabricate=" + anFabricate +
                '}';
    }
}
