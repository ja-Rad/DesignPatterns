package patterns_example_project.domain.enemy;

import java.util.HashMap;
import java.util.Map;

public class EnemyTypeFactory {
    static Map<String, EnemyType> enemyTypes = new HashMap<>();

    public static Map<String, EnemyType> getEnemyTypes() {
        return enemyTypes;
    }

    public static void setEnemyTypes(Map<String, EnemyType> enemyTypes) {
        EnemyTypeFactory.enemyTypes = enemyTypes;
    }

    public static EnemyType getEnemyType(String enemyName, String texture, String location, CreatureType type) {
        EnemyType result = enemyTypes.get(enemyName);

        if (result == null) {
            result = new EnemyType(enemyName, texture, location, type);
            enemyTypes.put(enemyName, result);
        }
        System.out.println("Cached enemy types: " + enemyTypes);
        return result;
    }
}
