package Observer.clase;

public class Customer implements Observer{

    private String nume;

    public Customer(String nume) {
        this.nume = nume;
    }

    @Override
    public void notificare(String mesage) {
        System.out.println( nume + " a primit notificarea " + mesage);
    }
}
