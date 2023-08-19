package patterns.structural.bridge.challenge;

public abstract class Shape {

    protected Color color;
    private int borderSize;

    public Shape(Color color) {
        this.color = color;
    }

    abstract void drawShape();

    abstract void modifyBorder(int times);

    public int getBorderSize() {
        return borderSize;
    }

    public void setBorderSize(int borderSize) {
        this.borderSize = borderSize;
    }
}

class Triangle extends Shape {

    public Triangle(Color color) {
        super(color);
        this.setBorderSize(20);
        System.out.println("Coloring Triangle: ");
    }

    @Override
    void drawShape() {
        System.out.print("This Triangle colored with: ");
        color.fillWithColor(this.getBorderSize());
    }

    @Override
    void modifyBorder(int times) {
        this.setBorderSize(this.getBorderSize() * times);
        System.out.println("Now we are changing the border length " + times + " times");
    }
}

class Rectangle extends Shape {

    public Rectangle(Color color) {
        super(color);
        this.setBorderSize(50);
        System.out.println("Coloring Rectangle: ");
    }

    @Override
    void drawShape() {
        System.out.print("This Rectangle colored with: ");
        color.fillWithColor(this.getBorderSize());
    }

    @Override
    void modifyBorder(int times) {
        this.setBorderSize(this.getBorderSize() * times);
        System.out.println("Now we are changing the border length " + times + " times");
    }
}

