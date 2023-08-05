package principles_and_strategies_of_design.programming_to_an_interface;

interface DisplayModule {
    public void display();
}

class Monitor implements DisplayModule {
    @Override
    public void display() {
        System.out.println("Display via MONITOR");
    }
}

class Projector implements DisplayModule {
    @Override
    public void display() {
        System.out.println("Display via PROJECTOR");
    }
}

public class Computer {

    DisplayModule dm;

    public void setDm(DisplayModule dm) {
        this.dm = dm;
    }

    public void display() {
        dm.display();
    }

    public static void main(String[] args) {
        Computer cm = new Computer();

        DisplayModule dm1 = new Monitor();
        DisplayModule dm2 = new Projector();

        cm.setDm(dm1);
        cm.display(); // Display via MONITOR

        cm.setDm(dm2);
        cm.display(); // Display via PROJECTOR
    }
}



















