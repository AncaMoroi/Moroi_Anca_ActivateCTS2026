package EC7Test2.Observer;

public class ClientNotification implements INotification {
    private String numeClient;

    public ClientNotification(String numeClient) {
        this.numeClient = numeClient;
    }


    @Override
    public void notify(String mesaj) {
        System.out.println("Clientul" + numeClient + "este notificat" +
                "");
    }
}
