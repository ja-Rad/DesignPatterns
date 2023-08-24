package patterns.behavioral.state.challenge;

public class AlertStateContext {
    private MobileAlertState mobileAlertState;

    public AlertStateContext() {
        this.mobileAlertState = new Vibration(); // default state
    }

    public MobileAlertState getMobileAlertState() {
        return mobileAlertState;
    }

    public void setMobileAlertState(MobileAlertState mobileAlertState) {
        this.mobileAlertState = mobileAlertState;
    }

    public void alert() {
        this.mobileAlertState.alert();
    }
}
