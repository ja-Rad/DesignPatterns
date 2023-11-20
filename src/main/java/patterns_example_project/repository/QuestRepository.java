package patterns_example_project.repository;

import patterns_example_project.domain.quest.Quest;

import java.util.ArrayList;
import java.util.List;

public class QuestRepository {
    private final List<Quest> quests = new ArrayList<>();
    private long questIdCounter = 0;

    private QuestRepository() {

    }

    public static QuestRepository getInstance() {
        return QuestRepository.QuestRepositoryHelper.uniqueInstance;
    }

    private Long generateQuestId() {
        questIdCounter++;
        return questIdCounter;
    }

    public Quest getQuestById(Long id) {
        return quests.stream()
                .filter(quest -> id.equals(quest.getId()))
                .findFirst()
                .orElse(null);
    }

    public void addQuest(Quest quest) {
        quest.setId(generateQuestId());
        quests.add(quest);
    }

    public int getQuestsSize() {
        return quests.size();
    }

    private static class QuestRepositoryHelper {
        private static final QuestRepository uniqueInstance = new QuestRepository();
    }

}
