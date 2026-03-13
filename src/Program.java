import SingletonEager.Masina;
import SingletonLazy.AplicatieMobila;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Program {
    public static void main(String[] args) {
        AplicatieMobila aplicatieMobila = AplicatieMobila.getInstance();
        System.out.println(aplicatieMobila);

        Masina masina = Masina.getInstance();
        System.out.println(masina);
    }
}