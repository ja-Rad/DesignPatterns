package patterns_example_project.service;

import patterns_example_project.domain.battle.BattleArena;
import patterns_example_project.domain.battle.BattleQueue;
import patterns_example_project.domain.enemy.BasicRateVisitor;
import patterns_example_project.domain.enemy.Enemy;
import patterns_example_project.domain.enemy.Lootable;
import patterns_example_project.domain.player_character.PlayerCharacter;
import patterns_example_project.domain.player_class.MainStats;
import patterns_example_project.domain.quest.RewardSystem;

import java.util.Random;

public class BattleManagerService {

    private static final Random random = new Random();
    BasicRateVisitor basicRateVisitor = new BasicRateVisitor();
    private BattleQueue battleQueue;
    private BattleArena battleArena;
    private RewardSystem rewardSystem;
    private QuestService questService = QuestService.getInstance();

    private BattleManagerService() {
    }

    public static BattleManagerService getInstance() {
        return BattleManagerService.BattleManagerServiceHelper.uniqueInstance;
    }

    public void manageBattle(PlayerCharacter playerCharacter) {
        Long startingHealth = playerCharacter.getCharacterInfo().getMainStats().getHealth();
        Long startingClassBased = playerCharacter.getCharacterInfo().getMainStats().getClassBased();

        Enemy questEnemy = playerCharacter.getCurrentQuest().getQuestEnemy();
        int targetProgress = playerCharacter.getCurrentQuest().getTargetProgress();
        battleQueue = new BattleQueue(playerCharacter);
        battleQueue.addEnemiesToQueue(questEnemy, targetProgress);

        int gold = getGoldForLooting();

        // start battle
        battleArena = new BattleArena(battleQueue.getPlayerCharacter(), battleQueue.getEnemies());
        long uniqueBattleId = random.nextLong();
        boolean hasPlayerWon = battleArena.startBattle(uniqueBattleId);

        if (hasPlayerWon) {
            rewardSystem = new RewardSystem(playerCharacter, questService);
            rewardSystem.giveReward(gold);
            System.out.println("Player finished quest...");
        } else {
            System.out.println("Player failed quest...");
        }

        playerCharacter.getCharacterInfo().setMainStats(MainStats.of(startingHealth, startingClassBased));
    }

    private int getGoldForLooting() {
        for (Lootable enemy : battleQueue.getEnemies()) {
            enemy.accept(basicRateVisitor);
        }
        int gold = basicRateVisitor.getGold();
        System.out.println("LOOT VISITOR: Player can potentially receive: " + gold + " for looting enemies... \n");
        return gold;
    }

    private static class BattleManagerServiceHelper {
        private static final BattleManagerService uniqueInstance = new BattleManagerService();
    }
}
