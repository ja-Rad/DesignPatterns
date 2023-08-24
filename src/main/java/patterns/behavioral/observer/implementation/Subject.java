package patterns.behavioral.observer.implementation;

import java.util.ArrayList;
import java.util.List;

public interface Subject {
    // methods to register and unregister observers
    void register(Observer observer);

    void unregister(Observer observer);

    // method to notify observers of changes
    void notifyObservers();

    // method to get updates from subject, not required, but added so observers can query
    Object getUpdate(Observer observer);
}

class MyTopic implements Subject {
    private List<Observer> observers;
    private String message;
    private boolean changed;

    public MyTopic() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        if (observer == null) {
            throw new NullPointerException("Null Observer");
        }
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        List<Observer> observersLocal;
        if (!changed) {
            return;
        }

        observersLocal = new ArrayList<>(this.observers);
        this.changed = false;

        for (Observer observer : observersLocal) {
            observer.update();
        }
    }

    @Override
    public Object getUpdate(Observer observer) {
        return this.message;
    }

    // method to post message to the topic, changed state (trigger notifications)
    public void postMessage(String message) {
        System.out.println("Message Posted to Topic: " + message);
        this.message = message;
        this.changed = true;
        notifyObservers();
    }
}
