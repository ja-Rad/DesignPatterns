package patterns.behavioral.iterator.implementation;

public class Client {
    public static void main(String[] args) {
        NotificationCollection notificationCollection = new NotificationCollection();

        NotificationBar notificationBar = new NotificationBar(notificationCollection);
        notificationBar.printNotifications();
        /*
            Notification 1
            Notification 2
            Notification 3
         */
    }
}
