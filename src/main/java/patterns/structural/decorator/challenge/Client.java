package patterns.structural.decorator.challenge;

public class Client {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        ShapeDecorator redShapeDecorator = new RedShapeDecorator();

        System.out.println("Circle with normal border");
        circle.draw();
        /*
            Circle with normal border
            Shape:Circle
         */

        redShapeDecorator.setShape(circle);
        redShapeDecorator.draw();
        /*
            Circle of red border
            Shape:Circle
            Border Color: Red
        */

        redShapeDecorator.setShape(rectangle);
        redShapeDecorator.draw();
        /*
            Circle of red border
            Shape:Rectangle
            Border Color: Red
         */
    }
}
