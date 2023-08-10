package patterns.creational.singleton.challenge;

public class Captain {
    private Captain() {
    }

    public static Captain getInstance() {
        return SingletonHelper.uniqueInstance;
    }

    private static class SingletonHelper {
        private static final Captain uniqueInstance = new Captain();
    }
}
