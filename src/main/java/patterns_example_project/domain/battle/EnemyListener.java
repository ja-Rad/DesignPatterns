package patterns_example_project.domain.battle;

public class EnemyListener implements BattleListener {

    @Override
    public void update(Long battleId, String notification) {
        System.out.println(this.getClass().getSimpleName() + "---" + battleId + ": " + notification);
    }

    @Override
    public String toString() {
        return "EnemyListener{}";
    }
}
