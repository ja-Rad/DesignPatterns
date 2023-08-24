package patterns.behavioral.state.challenge;

public class Client {
    public static void main(String[] args) {
        AlertStateContext context = new AlertStateContext();
        context.alert(); // Vibration...

        context.setMobileAlertState(new Silent());
        context.alert(); // Silent...
    }
}
