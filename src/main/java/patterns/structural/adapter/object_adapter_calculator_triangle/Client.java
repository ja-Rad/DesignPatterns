package patterns.structural.adapter.object_adapter_calculator_triangle;

public class Client {
    public static void main(String[] args) {
        Calculator calculator = new CalculatorImplAdapter(new Triangle(20, 10));

        System.out.println(calculator.getArea(null));
    }
}
