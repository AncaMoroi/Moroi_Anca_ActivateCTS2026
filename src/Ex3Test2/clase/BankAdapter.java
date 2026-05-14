package Ex3Test2.clase;

public class BankAdapter implements PaymentProcessor{

    private MetodaPlataVeche metodaVeche;

    public BankAdapter(MetodaPlataVeche metodaVeche) {
        this.metodaVeche = metodaVeche;
    }


    @Override
    public void pay(double amount) {
        metodaVeche.makePayment(amount);
    }
}
