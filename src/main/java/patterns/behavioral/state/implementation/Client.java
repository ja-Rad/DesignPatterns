package patterns.behavioral.state.implementation;

public class Client {
    public static void main(String[] args) {
        // Initially TV is Off
        TV tv = new TV(new Off());

        // First time press
        tv.pressButton(); // I'm currently Off. Pressing Switch to turn On...

        // Second time press
        tv.pressButton(); // I'm currently On. Pressing Switch to turn Off...
    }
}
