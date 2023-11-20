package patterns_example_project.domain.enemy;

import patterns_example_project.domain.battle.BattleListener;
import patterns_example_project.domain.battle.EnemyListener;

public class Enemy implements Lootable {

    private int id;
    private int hp;
    private int level;
    private int stamina;
    private int armor;
    private int damage;
    private EnemyType enemyType;
    private BattleListener listener;

    public Enemy(int hp, int level, int stamina, int armor, int damage, EnemyType enemyType) {
        this.listener = new EnemyListener();

        this.hp = hp;
        this.level = level;
        this.stamina = stamina;
        this.armor = armor;
        this.damage = damage;
        this.enemyType = enemyType;

    }

    public BattleListener getListener() {
        return listener;
    }

    public void setListener(BattleListener listener) {
        this.listener = listener;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public EnemyType getEnemyType() {
        return enemyType;
    }

    public void setEnemyType(EnemyType enemyType) {
        this.enemyType = enemyType;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "Enemy{" +
                "id=" + id +
                ", hp=" + hp +
                ", level=" + level +
                ", stamina=" + stamina +
                ", armor=" + armor +
                ", damage=" + damage +
                ", enemyType=" + enemyType +
                ", listener=" + listener +
                '}';
    }
}
