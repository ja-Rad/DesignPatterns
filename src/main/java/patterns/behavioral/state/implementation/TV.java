package patterns.behavioral.state.implementation;

public class TV {
    // state
    RemoteControl state;

    public TV(RemoteControl remoteControl) {
        this.state = remoteControl;
    }

    public RemoteControl getState() {
        return state;
    }

    public void setState(RemoteControl state) {
        this.state = state;
    }

    public void pressButton() {
        state.pressSwitch(this);
    }
}
