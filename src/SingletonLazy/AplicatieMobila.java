package SingletonLazy;

public class AplicatieMobila {

    private String nume;
    private float dimensiunel;
    private static AplicatieMobila aplicatieMobila = null;

    private AplicatieMobila(String nume, float dimensiunel) {
        this.nume = nume;
        this.dimensiunel = dimensiunel;
    }

    public static synchronized AplicatieMobila getInstance() {
        if (aplicatieMobila == null){
            aplicatieMobila = new AplicatieMobila("test",4);
        }
        return aplicatieMobila;
    }
}
