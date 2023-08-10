package patterns.creational.prototype.implementation;

public abstract class Shape implements Cloneable {
    protected String type;
    private String id;

    abstract void draw();

    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    protected Object clone() {
        Object clone = null;

        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }
}

class Rectangle extends Shape {
    public Rectangle() {
        this.type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Rectangle: draw()");
    }
}

class Square extends Shape {
    public Square() {
        this.type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Square: draw()");
    }
}

class Circle extends Shape {
    public Circle() {
        this.type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Circle: draw()");
    }
}
