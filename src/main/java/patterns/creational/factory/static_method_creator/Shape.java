package patterns.creational.factory.static_method_creator;

public interface Shape {
    void draw();
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle: draw()");
    }
}

class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Square: draw()");
    }
}

class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle: draw()");
    }
}

