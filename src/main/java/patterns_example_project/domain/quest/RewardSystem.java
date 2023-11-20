package patterns_example_project.domain.quest;

import patterns_example_project.domain.player_character.PlayerCharacter;
import patterns_example_project.service.QuestService;

public class RewardSystem {

    private PlayerCharacter playerCharacter;
    private QuestService questService;

    public RewardSystem(PlayerCharacter playerCharacter, QuestService questService) {
        this.playerCharacter = playerCharacter;
        this.questService = questService;
    }

    public void giveReward(int additionalGold) {
        Quest currentQuest = playerCharacter.getCurrentQuest();

        int goldReward = currentQuest.getGoldReward();
        int rewardedLevel = currentQuest.getRewardedLevel();
        String questGiver = currentQuest.getQuestGiver();
        int targetProgress = currentQuest.getTargetProgress();

        System.out.println("Player finished quest: " + targetProgress + "/" + targetProgress);
        System.out.println("Player reported to " + questGiver);
        System.out.println("Player received: " + goldReward + " gold " + rewardedLevel + " levels");
        System.out.println("Player additionally receives " + additionalGold + " gold for looting enemies");

        playerCharacter.setLevel(playerCharacter.getLevel() + rewardedLevel);
        playerCharacter.setGold(playerCharacter.getGold() + goldReward + additionalGold);

        playerCharacter.setCurrentQuest(null);
        questService.isQuestCompleted(playerCharacter);
    }
}
