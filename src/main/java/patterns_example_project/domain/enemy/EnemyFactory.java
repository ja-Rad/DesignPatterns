package patterns_example_project.domain.enemy;

public class EnemyFactory {

    public static Enemy createStormwindWolfCommon(int hp, int level, int stamina, int armor, int damage) {
        EnemyType StormwindWolf = EnemyTypeFactory.getEnemyType("Wolf", "WolfTexture", "Stormwind", CreatureType.COMMON);
        return new Enemy(hp, level, stamina, armor, damage, StormwindWolf);
    }

    public static Enemy createWestfallWolfCommon(int hp, int level, int stamina, int armor, int damage) {
        EnemyType WestfallWolf = EnemyTypeFactory.getEnemyType("Wolf", "WolfTexture", "Westfall", CreatureType.COMMON);
        return new Enemy(hp, level, stamina, armor, damage, WestfallWolf);
    }

    public static Enemy createStormwindGoblinCommon(int hp, int level, int stamina, int armor, int damage) {
        EnemyType StormwindGoblin = EnemyTypeFactory.getEnemyType("Wolf", "WolfTexture", "Stormwind", CreatureType.COMMON);
        return new Enemy(hp, level, stamina, armor, damage, StormwindGoblin);
    }

    public static Enemy createWestfallGoblinCommon(int hp, int level, int stamina, int armor, int damage) {
        EnemyType WestfallGoblin = EnemyTypeFactory.getEnemyType("Wolf", "WolfTexture", "Westfall", CreatureType.COMMON);
        return new Enemy(hp, level, stamina, armor, damage, WestfallGoblin);
    }
}
