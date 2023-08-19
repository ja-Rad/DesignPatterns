package patterns.structural.adapter.object_adapter_calculator_triangle;

// Example of a VERY USELESS INTERFACE! Because we cannot use Triangle here. It takes only Rectangles, so we need Adapter!
// And Adapter is going to be FOR A CALCULATOR implementation!
public interface Calculator {
    // target interface (doesn`t work with triangles)
    double getArea(Rectangle rectangle);
}

class CalculatorImpl implements Calculator {

    @Override
    public double getArea(Rectangle rectangle) {
        return rectangle.getLength() * rectangle.getWidth();
    }
}