package patterns_example_project.domain.player_character;

import patterns_example_project.domain.player_class.MainStats;

import java.util.Map;
import java.util.Set;

public interface CharacterInfo {
    MainStats<Long, Long> getMainStats();

    Map<String, Set<Skill>> getSkills();
}
