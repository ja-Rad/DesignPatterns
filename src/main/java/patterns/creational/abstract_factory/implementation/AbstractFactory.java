package patterns.creational.abstract_factory.implementation;

public abstract class AbstractFactory {
    abstract Color getColor(String colorType);

    abstract Shape getShape(String shapeType);
}

class ShapeFactory extends AbstractFactory {

    @Override
    Color getColor(String colorType) {
        return null;
    }

    @Override
    Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;

        } else if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();

        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();

        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();

        } else {
            return null;
        }
    }
}

class ColorFactory extends AbstractFactory {

    @Override
    Color getColor(String colorType) {
        if (colorType == null) {
            return null;

        } else if (colorType.equalsIgnoreCase("BLUE")) {
            return new Blue();

        } else if (colorType.equalsIgnoreCase("GREEN")) {
            return new Green();

        } else if (colorType.equalsIgnoreCase("RED")) {
            return new Red();

        } else {
            return null;
        }
    }

    @Override
    Shape getShape(String shapeType) {
        return null;
    }
}
