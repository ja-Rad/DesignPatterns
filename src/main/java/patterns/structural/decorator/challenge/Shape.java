package patterns.structural.decorator.challenge;

// component
public interface Shape {
    void draw();
}

// concrete components
class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape:Rectangle");
    }
}

// concrete components
class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape:Circle");
    }
}
