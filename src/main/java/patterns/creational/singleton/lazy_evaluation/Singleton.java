package patterns.creational.singleton.lazy_evaluation;

public class Singleton {
    // private ref to single instance
    private static Singleton uniqueInstance = null;

    // an instance attribute
    private int data = 0;

    // private constructor. No client can create an object!
    private Singleton() {
    }

    public static Singleton getInstance() {
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
