package patterns_example_project.domain.enemy;

public interface Visitor {

    void visit(Enemy enemy);

    int getGold();
}

