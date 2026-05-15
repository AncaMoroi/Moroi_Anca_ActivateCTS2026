package EX6Test2.command;

public class CerinteChelner {
    private OrdineComenzi ordineComenzi;

    public void setOrdineComenzi(OrdineComenzi ordineComenzi) {
        this.ordineComenzi = ordineComenzi;
    }

    public void setOrder() {
        ordineComenzi.execute();
    }
}
