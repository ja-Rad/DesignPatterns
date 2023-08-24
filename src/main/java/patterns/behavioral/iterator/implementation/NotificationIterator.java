package patterns.behavioral.iterator.implementation;

public class NotificationIterator implements Iterator {
    Notification[] notificationList;
    int pos = 0;

    public NotificationIterator(Notification[] notificationList) {
        this.notificationList = notificationList;
    }

    @Override
    public boolean hasNext() {
        if (pos >= notificationList.length || notificationList[pos] == null) {
            return false;
        }
        return true;
    }

    @Override
    public Notification next() {
        Notification notification = notificationList[pos];
        pos++;

        return notification;
    }
}
