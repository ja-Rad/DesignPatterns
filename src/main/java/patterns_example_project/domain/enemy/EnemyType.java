package patterns_example_project.domain.enemy;

public class EnemyType {
    private String name;
    private String texture;
    private String location;
    private CreatureType type;

    public EnemyType(String name, String texture, String location, CreatureType type) {
        this.name = name;
        this.texture = texture;
        this.location = location;
        this.type = type;
    }

    @Override
    public String toString() {
        return "EnemyType{" +
                "name='" + name + '\'' +
                ", texture='" + texture + '\'' +
                ", location='" + location + '\'' +
                ", type=" + type +
                '}';
    }
}
