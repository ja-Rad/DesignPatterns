package patterns_example_project.domain.player_character;

import patterns_example_project.domain.player_class.MainStats;
import patterns_example_project.domain.player_class.PlayerClass;

import java.util.Map;
import java.util.Set;

import static java.util.Map.entry;
import static java.util.Map.ofEntries;

public class PlayerCharacterInfo implements CharacterInfo {
    private static final String MAIN = "MAIN";
    private static final String SECONDARY = "SECONDARY";
    protected PlayerClass playerClass;
    private MainStats<Long, Long> stats;


    private PlayerCharacterInfo(PlayerCharacterInfoBuilder builder) {
        this.playerClass = builder.playerClass;
    }

    public static PlayerCharacterInfo.PlayerCharacterInfoBuilder builder() {
        return new PlayerCharacterInfo.PlayerCharacterInfoBuilder();
    }

    @Override
    public MainStats<Long, Long> getMainStats() {
        Long health = playerClass.getHealth();
        Long classBased = playerClass.getClassBased();

        stats = new MainStats<>(health, classBased);

        return stats;
    }

    public void setMainStats(MainStats<Long, Long> mainStats) {
        stats = new MainStats<>(mainStats.getHealth(), mainStats.getClassBased());
    }

    @Override
    public Map<String, Set<Skill>> getSkills() {
        Set<Skill> mainSkills = playerClass.getMainSkills();
        Set<Skill> secondarySkills = playerClass.getSecondarySkills();

        return ofEntries(
                entry(MAIN, mainSkills),
                entry(SECONDARY, secondarySkills)
        );
    }

    @Override
    public String toString() {
        return "PlayerCharacterInfo{" +
                "playerClass=" + playerClass +
                ", stats=" + stats +
                '}';
    }

    public static class PlayerCharacterInfoBuilder {
        private PlayerClass playerClass;

        private PlayerCharacterInfoBuilder() {
        }

        public PlayerCharacterInfoBuilder(PlayerClass playerClass) {
            this.playerClass = playerClass;
        }

        public PlayerCharacterInfoBuilder setPlayerClass(PlayerClass playerClass) {
            this.playerClass = playerClass;
            return this;
        }

        public PlayerCharacterInfo build() {
            return new PlayerCharacterInfo(this);
        }
    }
}
