package patterns.behavioral.observer.challenge;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public interface Subject {
    void registerObserver(Observer observer);

    void unregisterObserver(Observer observer);

    void notifyObservers();
}

class CricketData implements Subject {
    int runs;
    int wickets;
    float overs;
    List<Observer> observerList;

    public CricketData() {
        this.observerList = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        Iterator<Observer> iterator = observerList.iterator();
        while (iterator.hasNext()) {
            Observer observer = iterator.next();
            observer.update(runs, wickets, overs);
        }
    }

    // get latest runs from stadium
    private int getLatestRuns() {
        return 90;
    }

    // get latest wickets from stadium
    private int getLatestWickets() {
        return 2;
    }

    // get latest overs from stadium
    private float getLatestOvers() {
        return (float) 10.2;
    }

    // This method is used to update displays when data changes
    public void dataChanged() {
        runs = getLatestRuns();
        wickets = getLatestWickets();
        overs = getLatestOvers();

        notifyObservers();
    }
}
