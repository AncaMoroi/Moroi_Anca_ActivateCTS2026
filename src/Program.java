import ChainOfResponsability.clase.*;
import EC7Test2.Composite.IFastFood;
import EC7Test2.Composite.MeniuriFastFood;
import EC7Test2.Composite.ProduseFastFood;
import EX6Test2.adapter.AdapterDelivery;
import EX6Test2.adapter.DeliveryService;
import EX6Test2.adapter.ExternalDelivery;
import EX6Test2.command.*;
import Observer.clase.Customer;
import Observer.clase.OrderNotifier;
import ex5Test2.ChainOfResponsability.*;
import ex5Test2.Composite.MenuCombo;
import ex5Test2.Composite.MenuComponent;
import ex5Test2.Composite.MenuItem;


public class Program {
    public static void main(String[] args) {

        IFastFood pizza = new ProduseFastFood("Pizza", 30);
        IFastFood suc = new ProduseFastFood("Suc", 10);
        IFastFood desert = new ProduseFastFood("Desert", 15);

        MeniuriFastFood meniuPizza = new MeniuriFastFood("Meniu Pizza");
        meniuPizza.addProduse(pizza);
        meniuPizza.addProduse(suc);



        MeniuriFastFood familyMenu = new MeniuriFastFood("Family Menu");
        familyMenu.addProduse(meniuPizza);
        familyMenu.addProduse(desert);

        familyMenu.descriptio();

        System.out.println("Pret total: " + familyMenu.getPrice());




    }
}