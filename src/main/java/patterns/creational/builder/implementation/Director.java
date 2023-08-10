package patterns.creational.builder.implementation;

public class Director {
    Builder builder;

    public void construct(Builder builder) {
        this.builder = builder;
        this.builder.buildBody();
        this.builder.insertWheels();
        this.builder.addHeadlights();
    }
}
