package EC7Test2.Observer;

import java.util.ArrayList;
import java.util.List;

public class OrderClients {
    private List<INotification> notificationList = new ArrayList<>();

    public void addNotified(INotification notification) {
        notificationList.add(notification);
    }

    public void removeNotified(INotification notification) {
        notificationList.add(notification);
    }

    public void NotifyAll(String mesaj) {
        for(INotification notification : notificationList) {
            notification.notify(mesaj);
        }
    }
}
