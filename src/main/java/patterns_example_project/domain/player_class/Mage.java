package patterns_example_project.domain.player_class;

import patterns_example_project.domain.player_character.Skill;

import java.util.HashSet;
import java.util.Set;

public class Mage implements PlayerClass {
    private final Long health = 6_000L;
    private final Long mana = 1_500L;
    private Set<Skill> skills;


    @Override
    public Long getHealth() {
        return health;
    }

    @Override
    public Long getClassBased() {
        return mana;
    }

    @Override
    public Set<Skill> getMainSkills() {
        skills = new HashSet<>();
        skills.add(Skill.builder()
                .setAction("Fireball")
                .setCost(20)
                .setDamage(6)
                .build());
        skills.add(Skill.builder()
                .setAction("Ignite")
                .setCost(10)
                .setDamage(4)
                .build());
        return skills;
    }

    @Override
    public Set<Skill> getSecondarySkills() {
        skills = new HashSet<>();
        skills.add(Skill.builder()
                .setAction("Ice Spike")
                .setCost(6)
                .setDamage(2)
                .build());
        skills.add(Skill.builder()
                .setAction("Arcane missile")
                .setCost(3)
                .setDamage(1)
                .build());
        return skills;
    }
}
