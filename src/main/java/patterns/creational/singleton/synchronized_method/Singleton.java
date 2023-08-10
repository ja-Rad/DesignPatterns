package patterns.creational.singleton.synchronized_method;

public class Singleton {
    // private ref to single instance
    private static Singleton uniqueInstance = null;

    // an instance attribute
    private int data = 0;

    // private constructor. No client can create an object!
    private Singleton() {
    }

    // by adding synchronized keyword to getInstance(),
    // we force every thread to wait its turn before it can enter the method
    // ensures that here is NO RACE-CONDITIONS
    // reduces performance: each thread checks getInstance() and synchronized is overhead after first pass...
    public static synchronized Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }

        return uniqueInstance;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
