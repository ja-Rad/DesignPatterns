package patterns.behavioral.iterator.implementation;

public class NotificationBar {
    NotificationCollection notificationCollection;

    public NotificationBar(NotificationCollection notificationCollection) {
        this.notificationCollection = notificationCollection;
    }

    public void printNotifications() {
        Iterator iterator = notificationCollection.createIterator();
        while (iterator.hasNext()) {
            Notification next = iterator.next();
            System.out.println(next.getNotification());
        }
    }
}
