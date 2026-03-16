import SingletonEager.Masina;
import SingletonLazy.AplicatieMobila;
import prototype.Masini;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Program {
    public static void main(String[] args) {
        AplicatieMobila aplicatieMobila = AplicatieMobila.getInstance();
        System.out.println(aplicatieMobila);

        Masina masina = Masina.getInstance();
        System.out.println(masina);


        Masini prototype = new Masini();
        prototype.incarcaListaMasini();

        Masini copiazaMasini = (Masini) prototype.copiaza();
        copiazaMasini.setMarca("BMW");
        System.out.println(prototype);
        System.out.println(copiazaMasini);
    }
}