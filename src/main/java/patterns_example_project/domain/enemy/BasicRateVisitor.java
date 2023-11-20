package patterns_example_project.domain.enemy;

public class BasicRateVisitor implements Visitor {

    private int totalGold;

    @Override
    public void visit(Enemy enemy) {
        if (enemy.getLevel() < 5) {
            totalGold += 10;
        } else {
            totalGold += 20;
        }
    }

    @Override
    public int getGold() {
        return totalGold;
    }
}
