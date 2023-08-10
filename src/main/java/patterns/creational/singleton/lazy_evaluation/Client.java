package patterns.creational.singleton.lazy_evaluation;

public class Client {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        s1.setData(10);
        System.out.println(s1.getData()); // 10

        Singleton s2 = Singleton.getInstance();
        System.out.println(s2.getData()); // 10
        // Singleton is accessed again and the value is the same. So it is like a global instance.
    }
}
