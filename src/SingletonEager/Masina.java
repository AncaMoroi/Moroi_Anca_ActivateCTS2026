package SingletonEager;

public class Masina {
    private static final Masina instance = new Masina();
    String culoare;
    int anAparut;

    private Masina() {
        this.anAparut = 2016;
        this.culoare = "alb";
    }

    public String getCuloare() {
        return culoare;
    }

    public int getAnAparut() {
        return anAparut;
    }

    public static Masina getInstance(){
        return instance;
    }
}
