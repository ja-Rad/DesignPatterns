package patterns_example_project.domain.player_class;

import patterns_example_project.domain.player_character.Skill;

import java.util.HashSet;
import java.util.Set;

public class Warrior implements PlayerClass {
    Set<Skill> skills;
    private Long health = 10_000L;
    private Long rage = 500L;

    public Long getRage() {
        return rage;
    }

    public void setRage(Long rage) {
        this.rage = rage;
    }

    @Override
    public Long getHealth() {
        return health;
    }

    public void setHealth(Long health) {
        this.health = health;
    }

    @Override
    public Long getClassBased() {
        return rage;
    }

    @Override
    public Set<Skill> getMainSkills() {
        skills = new HashSet<>();
        skills.add(Skill.builder()
                .setAction("Execution")
                .setCost(15)
                .setDamage(6)
                .build());
        skills.add(Skill.builder()
                .setAction("Bloodbath")
                .setCost(14)
                .setDamage(5)
                .build());
        return skills;
    }

    @Override
    public Set<Skill> getSecondarySkills() {
        skills = new HashSet<>();
        skills.add(Skill.builder()
                .setAction("Bash")
                .setCost(10)
                .setDamage(3)
                .build());
        return skills;
    }
}
