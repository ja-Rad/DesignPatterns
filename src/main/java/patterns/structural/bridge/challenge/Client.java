package patterns.structural.bridge.challenge;

public class Client {
    public static void main(String[] args) {
        Shape shape1 = new Triangle(new GreenColor());
        shape1.drawShape();
        shape1.modifyBorder(3);
        shape1.drawShape();
        /*
            Coloring Triangle:
            This Triangle colored with: Green Color with 20 inch border.
            Now we are changing the border length 3 times
            This Triangle colored with: Green Color with 60 inch border.
         */

        Shape shape2 = new Rectangle(new RedColor());
        shape2.drawShape();
        shape2.modifyBorder(3);
        shape2.drawShape();
        /*
            Coloring Rectangle:
            This Rectangle colored with: Red Color with 50 inch border.
            Now we are changing the border length 3 times
            This Rectangle colored with: Red Color with 150 inch border.
         */
    }
}
