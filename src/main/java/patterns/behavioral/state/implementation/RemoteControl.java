package patterns.behavioral.state.implementation;

// State
public abstract class RemoteControl {
    public abstract void pressSwitch(TV context);
}

// Concrete State
class On extends RemoteControl {

    @Override
    public void pressSwitch(TV context) {
        System.out.println("I'm currently On. Pressing Switch to turn Off...");
        context.setState(new Off());
    }
}

class Off extends RemoteControl {

    @Override
    public void pressSwitch(TV context) {
        System.out.println("I'm currently Off. Pressing Switch to turn On...");
        context.setState(new On());
    }
}
