package Observer.clase;

import java.util.ArrayList;
import java.util.List;

public class OrderNotifier {
    private List<Observer> observerList = new ArrayList<>();

    public void attachObserver(Observer observer) {
        observerList.add(observer);
    }

    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    public void notifyObservers(String message) {
        for (Observer observer: observerList) {
            observer.notificare(message);
        }
    }
}
