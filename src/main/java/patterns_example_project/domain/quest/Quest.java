package patterns_example_project.domain.quest;

import patterns_example_project.domain.enemy.Enemy;

public class Quest {
    private Long id;
    private String questGiver;
    private String description;
    private Enemy questEnemy;
    private int currentProgress;
    private int targetProgress;
    private int rewardedLevel;
    private int goldReward;

    private Quest(QuestBuilder builder) {
        this.id = builder.id;
        this.questGiver = builder.questGiver;
        this.description = builder.description;
        this.questEnemy = builder.questEnemy;
        this.currentProgress = builder.currentProgress;
        this.targetProgress = builder.targetProgress;
        this.rewardedLevel = builder.rewardedLevel;
        this.goldReward = builder.goldReward;
    }

    public static QuestBuilder builder() {
        return new QuestBuilder();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestGiver() {
        return questGiver;
    }

    public void setQuestGiver(String questGiver) {
        this.questGiver = questGiver;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Enemy getQuestEnemy() {
        return questEnemy;
    }

    public void setQuestEnemy(Enemy questEnemy) {
        this.questEnemy = questEnemy;
    }

    public int getCurrentProgress() {
        return currentProgress;
    }

    public void setCurrentProgress(int currentProgress) {
        this.currentProgress = currentProgress;
    }

    public int getTargetProgress() {
        return targetProgress;
    }

    public void setTargetProgress(int targetProgress) {
        this.targetProgress = targetProgress;
    }

    public int getRewardedLevel() {
        return rewardedLevel;
    }

    public void setRewardedLevel(int rewardedLevel) {
        this.rewardedLevel = rewardedLevel;
    }

    public int getGoldReward() {
        return goldReward;
    }

    public void setGoldReward(int goldReward) {
        this.goldReward = goldReward;
    }

    @Override
    public String toString() {
        return "Quest{" +
                "id=" + id +
                ", questGiver='" + questGiver + '\'' +
                ", description='" + description + '\'' +
                ", questEnemy=" + questEnemy +
                ", currentProgress=" + currentProgress +
                ", targetProgress=" + targetProgress +
                ", rewardedLevel=" + rewardedLevel +
                ", goldReward=" + goldReward +
                '}';
    }

    public static class QuestBuilder {
        private Long id;
        private String questGiver;
        private String description;
        private Enemy questEnemy;
        private int currentProgress;
        private int targetProgress;
        private int rewardedLevel;
        private int goldReward;

        private QuestBuilder() {
        }

        public QuestBuilder(Long id, String questGiver, String description, Enemy questEnemy, int currentProgress, int targetProgress, int rewardedLevel, int goldReward) {
            this.id = id;
            this.questGiver = questGiver;
            this.description = description;
            this.questEnemy = questEnemy;
            this.currentProgress = currentProgress;
            this.targetProgress = targetProgress;
            this.rewardedLevel = rewardedLevel;
            this.goldReward = goldReward;
        }

        public QuestBuilder setId(Long id) {
            this.id = id;
            return this;
        }

        public QuestBuilder setQuestGiver(String questGiver) {
            this.questGiver = questGiver;
            return this;
        }

        public QuestBuilder setDescription(String description) {
            this.description = description;
            return this;
        }

        public QuestBuilder setQuestEnemy(Enemy questEnemy) {
            this.questEnemy = questEnemy;
            return this;
        }

        public QuestBuilder setCurrentProgress(int currentProgress) {
            this.currentProgress = currentProgress;
            return this;
        }

        public QuestBuilder setTargetProgress(int targetProgress) {
            this.targetProgress = targetProgress;
            return this;
        }

        public QuestBuilder setRewardedLevel(int rewardedLevel) {
            this.rewardedLevel = rewardedLevel;
            return this;
        }

        public QuestBuilder setGoldReward(int goldReward) {
            this.goldReward = goldReward;
            return this;
        }

        public Quest build() {
            return new Quest(this);
        }
    }
}
