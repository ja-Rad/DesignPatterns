package patterns.structural.adapter.object_adapter_calculator_triangle;

public class CalculatorImplAdapter implements Calculator {

    private CalculatorImpl calculator;
    private Triangle triangle;

    public CalculatorImplAdapter(Triangle triangle) {
        this.triangle = triangle;
    }

    @Override
    public double getArea(Rectangle rectangle) {
        rectangle = new Rectangle();
        rectangle.setLength(triangle.getHeight());
        rectangle.setWidth(triangle.getBase() * 0.5);

        calculator = new CalculatorImpl();
        return calculator.getArea(rectangle);
    }
}
