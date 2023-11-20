package patterns_example_project.service;

import patterns_example_project.domain.enemy.EnemyFactory;
import patterns_example_project.domain.player_character.PlayerCharacter;
import patterns_example_project.domain.quest.Quest;
import patterns_example_project.repository.QuestRepository;

import java.util.Random;

public class QuestService {

    private static final QuestRepository questRepository = QuestRepository.getInstance();
    private static final Random random = new Random();

    private QuestService() {
    }

    public static QuestService getInstance() {
        return QuestService.QuestServiceHelper.uniqueInstance;
    }

    public void generateQuests() {
        if (questRepository.getQuestsSize() == 0) {
            questRepository.addQuest(
                    Quest.builder()
                            .setQuestGiver(generateRandomString(10))
                            .setDescription(generateRandomString(30))
                            .setQuestEnemy(EnemyFactory.createStormwindWolfCommon(10, 3, 6, 2, 3))
                            .setTargetProgress(2)
                            .setRewardedLevel(1)
                            .setGoldReward(1000)
                            .build()
            );
            questRepository.addQuest(
                    Quest.builder()
                            .setQuestGiver(generateRandomString(10))
                            .setDescription(generateRandomString(30))
                            .setQuestEnemy(EnemyFactory.createStormwindGoblinCommon(15, 5, 7, 3, 4))
                            .setTargetProgress(2)
                            .setRewardedLevel(1)
                            .setGoldReward(2000)
                            .build()
            );
            questRepository.addQuest(
                    Quest.builder()
                            .setQuestGiver(generateRandomString(10))
                            .setDescription(generateRandomString(30))
                            .setQuestEnemy(EnemyFactory.createWestfallWolfCommon(12, 8, 8, 4, 5))
                            .setTargetProgress(3)
                            .setRewardedLevel(3)
                            .setGoldReward(3000)
                            .build()
            );
            questRepository.addQuest(
                    Quest.builder()
                            .setQuestGiver(generateRandomString(10))
                            .setDescription(generateRandomString(30))
                            .setQuestEnemy(EnemyFactory.createWestfallGoblinCommon(15, 10, 12, 5, 7))
                            .setTargetProgress(4)
                            .setRewardedLevel(3)
                            .setGoldReward(3000)
                            .build()
            );
        }
    }

    public boolean isQuestCompleted(PlayerCharacter playerCharacter) {
        return playerCharacter.getCurrentQuest() == null;
    }

    public void assignQuest(PlayerCharacter playerCharacter) {
        int questsSize = questRepository.getQuestsSize();
        int randomInt = random.nextInt(questsSize);

        Quest quest = questRepository.getQuestById((long) randomInt + 1);
        playerCharacter.setCurrentQuest(quest);

        System.out.println("Player with username: " + playerCharacter.getUsername() + " has assigned a new Quest: " + quest);
    }

    private String generateRandomString(int targetStringLength) {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        return random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }

    private static class QuestServiceHelper {
        private static final QuestService uniqueInstance = new QuestService();
    }

}
