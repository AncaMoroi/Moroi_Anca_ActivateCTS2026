package composite1.clase;

import java.util.ArrayList;
import java.util.List;

public class CategorieComposite implements ItemComponent{
    private String nume;
    private List<ItemComponent> list = new ArrayList<>();

    public CategorieComposite(String nume) {
        this.nume = nume;
    }

    public void adauga(ItemComponent item) {
        list.add(item);
    }

    @Override
    public void afisare() {
        System.out.println("Categorie: " + nume);
       for (ItemComponent item: list) {
           item.afisare();
        }
    }

    @Override
    public float getPret() {
        float total = 0 ;
        for (ItemComponent item : list) {
            total += item.getPret();
        }
        return total;
    }
}
