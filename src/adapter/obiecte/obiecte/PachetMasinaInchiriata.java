package adapter.obiecte.obiecte;

import adapter.obiecte.inchirieremasini.MasiniInchiriate;

public class PachetMasinaInchiriata implements IPachetTuristic{
    private MasiniInchiriate masiniInchiriate;

    public PachetMasinaInchiriata(MasiniInchiriate masiniInchiriate) {
        this.masiniInchiriate = masiniInchiriate;
    }

    @Override
    public void descriere() {
        System.out.println(this.masiniInchiriate.toString());
    }

    @Override
    public void inchiriazaMasina() {
        this.masiniInchiriate.inchirizaMasina();
    }
}
