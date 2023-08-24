package patterns.behavioral.memento.challenge;

public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("State #1");
        originator.setState("State #2");
        caretaker.addMemento(originator.saveStateToMemento());

        originator.setState("State #3");
        caretaker.addMemento(originator.saveStateToMemento());
        originator.setState("State #4");


        System.out.println("Current state: " + originator.getState()); // Current state: State #4

        originator.getStateFromMemento(caretaker.getMemento(0));
        System.out.println("First saved state: " + originator.getState()); // First saved state: State #2

        originator.getStateFromMemento(caretaker.getMemento(1));
        System.out.println("Second saved state: " + originator.getState()); // Second saved state: State #3
    }
}
