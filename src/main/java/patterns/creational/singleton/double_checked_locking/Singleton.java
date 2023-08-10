package patterns.creational.singleton.double_checked_locking;

public class Singleton {
    // private ref to single instance
    // volatile - data will be in sync across all threads; ensures that data will be handled correctly when initialised
    private static volatile Singleton uniqueInstance = null;

    // an instance attribute
    private int data = 0;

    // private constructor. No client can create an object!
    private Singleton() {
    }

    // Doesn`t work on jvm earlier than java 1.4,
    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) { // we only sync the 1st time through
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
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
