import adapter.obiecte.inchirieremasini.Masina;
import adapter.obiecte.inchirieremasini.MasiniInchiriate;
import adapter.obiecte.obiecte.IPachetTuristic;
import adapter.obiecte.obiecte.PachetMasinaInchiriata;
import adapterEx1.comanda.AdapterComandaRestaurant;
import adapterEx1.comanda.IComandaMancare;
import adapterEx1.obiecte.ComandaRestaurant;
import adapterEx1.obiecte.PlasareComandaRestaurant;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Program {
    public static void main(String[] args) {


        /// /////Adapter////////////////
        Masina masina = new Masina("BMW", 2026);
        MasiniInchiriate serviciuInchiriere = new MasiniInchiriate(masina);

        IPachetTuristic pachet = new PachetMasinaInchiriata(serviciuInchiriere);

        pachet.descriere();
        pachet.inchiriazaMasina();


        ComandaRestaurant cr =new ComandaRestaurant("Carne");
        PlasareComandaRestaurant pc = new PlasareComandaRestaurant(cr);

        AdapterComandaRestaurant acr = new AdapterComandaRestaurant(pc);

        acr.descriere();
        acr.plaseazaComanda();
    }
}