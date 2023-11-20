package patterns_example_project.domain.enemy;

public interface Lootable {
    void accept(Visitor visitor);
}
