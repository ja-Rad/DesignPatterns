package patterns.structural.flyweight.challenge;

// Flyweight
public interface Player {
    // Extrinsic
    void assignWeapon(String weapon);

    // Intrinsic
    void mission();
}

class Terrorist implements Player {
    private String task;
    private String weapon;

    public Terrorist() {
        setTask("PLANT A BOMB");
    }

    @Override
    public void assignWeapon(String weapon) {
        this.setWeapon(weapon);
    }

    @Override
    public void mission() {
        System.out.println("Terrorist with weapon " + weapon + " | " + "Task is " + task);
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
}

class CounterTerrorist implements Player {
    private String task;
    private String weapon;

    public CounterTerrorist() {
        setTask("DIFFUSE BOMB");
    }

    @Override
    public void assignWeapon(String weapon) {
        this.setWeapon(weapon);
    }

    @Override
    public void mission() {
        System.out.println("CounterTerrorist with weapon " + weapon + " | " + "Task is " + task);
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
}


