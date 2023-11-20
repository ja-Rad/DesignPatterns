package patterns_example_project.domain.player_class;

public class MainStats<Health, ClassBased> {
    public final Health health;
    public final ClassBased classBased;

    public MainStats(Health health, ClassBased classBased) {
        this.health = health;
        this.classBased = classBased;
    }

    public static MainStats<Long, Long> of(Long health, Long classBased) {
        return new MainStats<>(health, classBased);
    }

    public Health getHealth() {
        return health;
    }

    public ClassBased getClassBased() {
        return classBased;
    }
}
