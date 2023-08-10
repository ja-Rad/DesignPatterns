package patterns.creational.singleton.bill_pugh;

public class Singleton {
    // an instance attribute
    private int data = 0;

    // private constructor. No client can create an object!
    private Singleton() {
    }

    public static Singleton getInstance() {
        return SingletonHelper.uniqueInstance;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    // Nested class is referenced after getInstance() is called
    // When Singleton class is loaded SingletonHelper is NOT loaded into memory
    // ONLY when getInstance() is called SingletonHelper IS loaded into memory and will create instance
    // So basically, It solves Eager evaluation
    private static class SingletonHelper {
        private static final Singleton uniqueInstance = new Singleton();
    }
}
