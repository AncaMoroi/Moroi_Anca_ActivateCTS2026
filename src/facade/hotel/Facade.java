package facade.hotel;

public class Facade {
    private CamereLibere camereLibere;
    private CuratenieCamere curatenie;
    private Restaurant restaurant;


    public Facade() {
        camereLibere = new CamereLibere();
        curatenie = new CuratenieCamere();
        restaurant = new Restaurant();

    }

    public void checkIn(String client, String camera) {
        System.out.println("Se incepe procesul de checkin pentru " + client);

        camereLibere.verificaDisponibilitate(camera);
        curatenie.curataCamera(camera);
        restaurant.pregatesteMasa(client);

        System.out.println("Checkin  " + client);
    }
}
