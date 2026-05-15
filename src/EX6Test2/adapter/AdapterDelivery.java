package EX6Test2.adapter;

public class AdapterDelivery implements DeliveryService{
   private ExternalDelivery external;

    public AdapterDelivery(ExternalDelivery external) {
        this.external = external;
    }


    @Override
    public void deliverOrder(String adresa) {
        external.sendPackage(adresa);
    }
}
