package EC7Test2.Composite;

import java.util.ArrayList;
import java.util.List;

public class MeniuriFastFood implements IFastFood{
    private String denumire;
    private List<IFastFood> item = new ArrayList<>();

    public MeniuriFastFood(String denumire) {
        this.denumire = denumire;
    }

    public void addProduse(IFastFood produse) {
        item.add(produse);
    }

    public void removeProduse(IFastFood produse) {
        item.remove(produse);
    }
    @Override
    public float getPrice() {
        float total = 0;
        for (IFastFood item : item){
            total += item.getPrice();
        }
        return total;
    }

    @Override
    public void descriptio() {
        System.out.println("Denumire " + denumire);
        for (IFastFood item : item) {

            item.descriptio();
        }
    }
}
