package solid.open_closed_principle;

interface Shape {
    public double calculateArea();
}

class Rectangle implements Shape {
    public double length;
    public double width;

    @Override
    public double calculateArea() {
        return length * width;
    }
}

class Circle implements Shape {
    public double radius;

    @Override
    public double calculateArea() {
        return 3.14 * radius * radius;
    }
}

// This class is BAD. Because we can`t extend it, and we need to ALWAYS modify it!
class AreaCalculator {
//    public double calculateRectangleArea(Rectangle rectangle) {
//        return rectangle.length * rectangle.width;
//    }
//    public double calculateCircleArea(Circle circle) {
//        return 3.14 * circle.radius * circle.radius;
//    }
    public double calculateShapeArea(Shape shape) {
        return shape.calculateArea();
    }
}

public class Main {

}
