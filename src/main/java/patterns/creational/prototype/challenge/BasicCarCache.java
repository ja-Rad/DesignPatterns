package patterns.creational.prototype.challenge;

import java.util.Hashtable;
import java.util.Map;

public class BasicCarCache {
    private static Map<String, BasicCar> carMap = new Hashtable<>();

    public static BasicCar getCar(String modelName) {
        BasicCar cachedCar = carMap.get(modelName);
        return cachedCar.clone();
    }

    public static void loadContext() {
        Nano nano = new Nano();
        carMap.put(nano.getModelName(), nano);

        Ford ford = new Ford();
        carMap.put(ford.getModelName(), ford);
    }
}
