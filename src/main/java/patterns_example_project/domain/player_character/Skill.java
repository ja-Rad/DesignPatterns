package patterns_example_project.domain.player_character;

import java.util.Objects;

public class Skill {
    private String action;
    private int damage;
    private int cost;

    private Skill(SkillBuilder builder) {
        this.action = builder.action;
        this.damage = builder.damage;
        this.cost = builder.cost;
    }

    public static SkillBuilder builder() {
        return new SkillBuilder();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Skill skill = (Skill) o;
        return damage == skill.damage && cost == skill.cost && Objects.equals(action, skill.action);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, damage, cost);
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Skill{" +
                "action='" + action + '\'' +
                ", damage=" + damage +
                ", cost=" + cost +
                '}';
    }

    public static class SkillBuilder {
        private String action;
        private int damage;
        private int cost;

        private SkillBuilder() {
        }

        public SkillBuilder(String action, int damage, int cost) {
            this.action = action;
            this.damage = damage;
            this.cost = cost;
        }

        public SkillBuilder setAction(String action) {
            this.action = action;
            return this;
        }

        public SkillBuilder setDamage(int damage) {
            this.damage = damage;
            return this;
        }

        public SkillBuilder setCost(int cost) {
            this.cost = cost;
            return this;
        }

        public Skill build() {
            return new Skill(this);
        }
    }
}
