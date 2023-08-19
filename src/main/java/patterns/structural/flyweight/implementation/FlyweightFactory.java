package patterns.structural.flyweight.implementation;

import java.util.HashMap;
import java.util.Map;

// Usually we store here cached objects. Stores if exists, creates if absent.
public class FlyweightFactory {
    private Map<String, Flyweight> objectsCache = new HashMap<>();

    public int totalObjectsCreate() {
        return objectsCache.size();
    }

    public Flyweight getConcreteFlyweight(String flyweightType) throws Exception {

        Flyweight flyweight = null;

        if (objectsCache.containsKey(flyweightType)) {
            flyweight = objectsCache.get(flyweightType);
        } else {
            switch (flyweightType) {
                case "Type1":
                    System.out.println("We didn't cache Type1 object yet... Create ConcreteFlyweight Type1...");
                    flyweight = new ConcreteFlyweight("Type1");
                    objectsCache.put("Type1", flyweight);
                    break;

                case "Type2":
                    System.out.println("We didn't cache Type2 object yet... Create ConcreteFlyweight Type2...");
                    flyweight = new ConcreteFlyweight("Type2");
                    objectsCache.put("Type2", flyweight);
                    break;

                default:
                    throw new Exception("Flyweight Factory can only create Type1 and Type2 objects...");
            }
        }

        return flyweight;
    }
    // ↓modifications↓ (WE DON`T NEED this method anymore)
//    public Flyweight getConcreteFlyweight(String objectCategory) throws Exception {
//
//        Flyweight flyweight = null;
//
//        if (objectsCache.containsKey(objectCategory)) {
//            flyweight = objectsCache.get(objectCategory);
//        } else {
//            switch (objectCategory) {
//                case "1":
//                    System.out.println("We didn't cache this object yet... Create ConcreteFlyweight1...");
//                    flyweight = new ConcreteFlyweight1(); // ↓modifications↓ (adding EXTRINSIC DATA)
//                    objectsCache.put("1", flyweight);
//                    break;
//
//                case "2":
//                    System.out.println("We didn't cache this object yet... Create ConcreteFlyweight2...");
//                    flyweight = new ConcreteFlyweight2();
//                    objectsCache.put("1", flyweight);
//                    break;
//
//                default:
//                    throw new Exception("Flyweight Factory only knows how to create ConcreteFlyweight1 and ConcreteFlyweight2");
//            }
//        }
//
//        return flyweight;
//    }
}
