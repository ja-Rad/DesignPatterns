package patterns.structural.decorator.challenge;

// decorator
public abstract class ShapeDecorator implements Shape {
    private Shape shape;

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void draw() {
        if (shape != null) {
            shape.draw();
        }
    }
}

// concrete decorators
class RedShapeDecorator extends ShapeDecorator {
    @Override
    public void draw() {
        System.out.println("Circle of red border");
        super.draw();
        System.out.println("Border Color: Red");
    }
}

class GreenShapeDecorator extends ShapeDecorator {
    @Override
    public void draw() {
        System.out.println("Circle of green border");
        super.draw();
        System.out.println("Border Color: Green");
    }
}