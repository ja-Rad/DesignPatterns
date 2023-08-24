package patterns.behavioral.state;

// Basic example that shows why we need State pattern
// This class IS NOT a part of this pattern! Just an example of the situation that can be fixed by State pattern!
public class TVRemoteBasic {
    private String state;

    public static void main(String[] args) {
        TVRemoteBasic tv = new TVRemoteBasic();
        tv.setState("ON"); // SEE! Client needs to know which states are available to him in order to use the necessary action!
        tv.doAction(); // TV is turned ON

        tv.setState("OFF");
        tv.doAction(); // TV is turned OFF
    }

    public void setState(String state) {
        this.state = state;
    }

    public void doAction() {
        if (state.equalsIgnoreCase("ON")) {
            System.out.println("TV is turned ON");
        } else if (state.equalsIgnoreCase("OFF")) {
            System.out.println("TV is turned OFF");
        }
    }
}
