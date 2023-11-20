package patterns_example_project.domain.battle;

import patterns_example_project.domain.enemy.Enemy;
import patterns_example_project.domain.player_character.PlayerCharacter;
import patterns_example_project.domain.player_character.Skill;
import patterns_example_project.domain.player_class.MainStats;

import java.util.List;
import java.util.Random;
import java.util.Set;

public class BattleArena {
    private static final Random random = new Random();
    private PlayerCharacter player;
    private List<Enemy> enemies;
    private BattlePublisher battlePublisher;
    private int counter = 0;

    public BattleArena(PlayerCharacter player, List<Enemy> enemies) {
        this.player = player;
        this.enemies = enemies;
    }

    public boolean startBattle(long uniqueBattleId) {
        battlePublisher = new BattlePublisher(uniqueBattleId);
        doSubscription(uniqueBattleId);

        Long playerHealth = player.getCharacterInfo().getMainStats().getHealth();
        Set<Skill> main = player.getCharacterInfo().getSkills().get("MAIN");
        Set<Skill> secondary = player.getCharacterInfo().getSkills().get("SECONDARY");
        Skill randomMainSkill = getRandomElementFromSet(main);
        Skill randomSecondarySkill = getRandomElementFromSet(secondary);

        while (playerHealth > 0) {
            counter++;
            System.out.println("\n" + "\\\\\\\\\\\\");
            System.out.println("ROUND #" + counter);
            System.out.println("//////" + "\n");
            player.getStatus().checkStatus();
            int enemySize = enemies.size();
            if (enemySize == 0) {
                doUnsubscription(uniqueBattleId, "Player WON! Enemy size:");
                return true;
            }

            int randomEnemy = random.nextInt(enemySize);

            Long currentPlayerHealth = player.getCharacterInfo().getMainStats().getHealth();
            Long playerClassBased = player.getCharacterInfo().getMainStats().getClassBased();

            if (playerClassBased > 0) {
                attackRandomEnemy(enemies, randomEnemy, randomMainSkill, uniqueBattleId);
                attackRandomEnemy(enemies, randomEnemy, randomSecondarySkill, uniqueBattleId);
                player.getCharacterInfo().setMainStats(MainStats.of(currentPlayerHealth, playerClassBased - randomMainSkill.getCost() - randomSecondarySkill.getCost()));

                refreshEnemies(enemies);

            } else if (playerClassBased < 0) {
                player.getCharacterInfo().setMainStats(MainStats.of(currentPlayerHealth, playerClassBased + 50));
            }
            attackPlayer(player, enemies, uniqueBattleId);
        }
        doUnsubscription(uniqueBattleId, "Player LOST! Enemy size:");

        return false;
    }

    private void doUnsubscription(long uniqueBattleId, String playerStatus) {
        battlePublisher.notify(uniqueBattleId, playerStatus + enemies.size() + " player stats: " + player);
        System.out.println("\n---------------UNSUBSCRIPTION-----------------");
        battlePublisher.notify(uniqueBattleId, "unsubscribing from: " + uniqueBattleId);
        System.out.println("---------------UNSUBSCRIPTION-----------------\n");
        battlePublisher.unsubscribe(uniqueBattleId, player.getListener());
        for (Enemy enemy : enemies) {
            battlePublisher.unsubscribe(uniqueBattleId, enemy.getListener());
        }
    }

    private void doSubscription(long uniqueBattleId) {
        System.out.println("---------------SUBSCRIPTION-----------------");
        battlePublisher.subscribe(uniqueBattleId, player.getListener());
        for (Enemy enemy : enemies) {
            battlePublisher.subscribe(uniqueBattleId, enemy.getListener());
        }
        battlePublisher.notify(uniqueBattleId, "subscribing to: " + uniqueBattleId);
        System.out.println("---------------SUBSCRIPTION-----------------\n");
    }

    private void attackPlayer(PlayerCharacter player, List<Enemy> enemies, long uniqueBattleId) {
        for (Enemy enemy : enemies) {
            int damage = enemy.getDamage();
            player.getCharacterInfo().setMainStats(MainStats.of(
                    player.getCharacterInfo().getMainStats().getHealth() - damage,
                    player.getCharacterInfo().getMainStats().getClassBased()));
            battlePublisher.notify(uniqueBattleId, ">>ENEMIES's TURN<< by id: " + enemy.getId() + " with " + enemy.getHp() + " hp attacks player inflicting: " + damage + " damage");
        }
    }

    private void refreshEnemies(List<Enemy> enemies) {
        enemies.removeIf(enemy -> enemy.getHp() <= 0);
    }

    private void attackRandomEnemy(List<Enemy> enemies, int randomEnemy, Skill skill, long uniqueBattleId) {
        Enemy enemy = enemies.get(randomEnemy);
        enemy.setHp(enemy.getHp() - skill.getDamage());
        battlePublisher.notify(uniqueBattleId, "<PLAYER's TURN> " + skill.getAction() + " on enemy that cost: " + skill.getCost() + " mana and inflicts: " + skill.getDamage() + " damage");
    }

    private Skill getRandomElementFromSet(Set<Skill> set) {
        return set.stream()
                .skip(random.nextInt(set.size()))
                .findFirst()
                .orElse(null);
    }
}
