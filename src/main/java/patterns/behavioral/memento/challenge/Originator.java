package patterns.behavioral.memento.challenge;

public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    // save
    public Memento saveStateToMemento() {
        return new Memento(state);
    }

    // restore
    public void getStateFromMemento(Memento memento) {
        state = memento.getState();
    }
}
