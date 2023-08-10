package patterns.creational.singleton.eager_evaluation;

public class Singleton {
    // private ref to single instance
    // Eager initialisation
    private static Singleton uniqueInstance = new Singleton();

    // an instance attribute
    private int data = 0;

    // private constructor. No client can create an object!
    private Singleton() {
    }

    // no null check, because it is already created
    public static Singleton getInstance() {
        return uniqueInstance;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
