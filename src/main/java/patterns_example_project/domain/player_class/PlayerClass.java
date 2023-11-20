package patterns_example_project.domain.player_class;

import patterns_example_project.domain.player_character.Skill;

import java.util.Set;

public interface PlayerClass {
    Long getHealth();

    Long getClassBased();

    Set<Skill> getMainSkills();

    Set<Skill> getSecondarySkills();
}
