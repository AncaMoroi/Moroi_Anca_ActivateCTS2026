package adapter.obiecte.inchirieremasini;

public class MasiniInchiriate {
    private Masina masina;

    public MasiniInchiriate(Masina masina){
        this.masina = masina;
    }

    public void inchirizaMasina() {
        System.out.println("Aceasta masina a fost inchiriata"+masina.toString());
    }

    @Override
    public String toString() {
        return "MasiniInchiriate{" +
                "masina=" + masina +
                '}';
    }
}
