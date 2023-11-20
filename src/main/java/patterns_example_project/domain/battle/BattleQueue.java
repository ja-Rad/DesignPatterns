package patterns_example_project.domain.battle;

import patterns_example_project.domain.enemy.Enemy;
import patterns_example_project.domain.player_character.PlayerCharacter;

import java.util.ArrayList;
import java.util.List;

public class BattleQueue {
    private static List<Enemy> enemies = new ArrayList<>();
    private static int counter = 1;
    private PlayerCharacter playerCharacter;

    public BattleQueue(PlayerCharacter playerCharacter) {
        this.playerCharacter = playerCharacter;
    }

    public static void addEnemiesToQueue(Enemy enemy, int target) {
        for (int i = 0; i < target; i++) {
            Enemy newEnemy = deepCopy(enemy);
            newEnemy.setId(counter++);
            enemies.add(newEnemy);
        }
    }

    public static Enemy deepCopy(Enemy original) {
        Enemy newEnemy = new Enemy(
                original.getHp(),
                original.getLevel(),
                original.getStamina(),
                original.getArmor(),
                original.getDamage(),
                original.getEnemyType()
        );
        return newEnemy;
    }

    public PlayerCharacter getPlayerCharacter() {
        return playerCharacter;
    }

    public void setPlayerCharacter(PlayerCharacter playerCharacter) {
        this.playerCharacter = playerCharacter;
    }

    public List<Enemy> getEnemies() {
        return enemies;
    }
}
