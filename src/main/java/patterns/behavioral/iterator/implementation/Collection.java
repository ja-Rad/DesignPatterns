package patterns.behavioral.iterator.implementation;

public interface Collection {
    Iterator createIterator();
}

class NotificationCollection implements Collection {

    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    Notification[] notificationList;

    public NotificationCollection() {
        this.notificationList = new Notification[MAX_ITEMS];

        addItem("Notification 1");
        addItem("Notification 2");
        addItem("Notification 3");
    }

    private void addItem(String s) {
        Notification notification = new Notification(s);
        if (numberOfItems >= MAX_ITEMS) {
            System.out.println("full");
        } else {
            notificationList[numberOfItems] = notification;
            numberOfItems++;
        }
    }

    @Override
    public Iterator createIterator() {
        return new NotificationIterator(notificationList);
    }
}
