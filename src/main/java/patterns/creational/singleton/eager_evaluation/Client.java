package patterns.creational.singleton.eager_evaluation;

public class Client {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        s1.setData(10);
        System.out.println(s1.getData()); // 10

        Singleton s2 = Singleton.getInstance();
        System.out.println(s2.getData()); // 10
        // Singleton is accessed again and the value is the same. So it is like a global instance.

        // For Eager evaluation it is NOT RECOMMENDED to use this approach for File System, Database
        // (because JVM spends too many resources on them).
        // For File System, Database - use getInstance();
    }
}
