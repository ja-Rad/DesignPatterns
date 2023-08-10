package patterns.creational.abstract_factory.implementation;

public class Client {
    public static void main(String[] args) {
        AbstractFactory shape = FactoryProducer.getFactory("SHAPE");
        Shape circle = shape.getShape("CIRCLE");
        circle.draw();

        AbstractFactory color = FactoryProducer.getFactory("COLOR");
        Color red = color.getColor("RED");
        red.fill();
    }
}
