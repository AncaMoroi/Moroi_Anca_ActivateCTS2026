package ex5Test2.Composite;

import java.util.ArrayList;
import java.util.List;

public class MenuCombo implements MenuComponent{
    private String nume;
    private List<MenuComponent> items = new ArrayList<>();

    public MenuCombo(String nume) {
        this.nume = nume;
    }

    public void addItem(MenuComponent item){
        items.add(item);
    }

    public void removeItem(MenuComponent item) {
        items.remove(item);
    }

    @Override
    public double getPrice() {
        double total = 0;
        for (MenuComponent item : items) {
            total += item.getPrice();
        }
        return total;
    }

    @Override
    public void display() {
        System.out.println("Meniu: " + nume);
            for(MenuComponent item : items ) {
                item.display();
            }
        System.out.println("Total meniu " +  getPrice() + "lei");
    }
}
