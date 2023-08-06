package solid.interface_segregation_principle;

interface Shape {
    public double area();

//    public double volume(); // Volume? But 2D shaped doesn`t have volume... Better idea: create another interface: SolidShape for 3D
}

interface SolidShape {
    public double volume();
}

interface ManageShapeInterface {
    public double calculate();
}

class Cube implements Shape, SolidShape, ManageShapeInterface {
    @Override
    public double area() {
        return 1.0;
    }

    @Override
    public double volume() {
        return 1.0;
    }

    @Override
    public double calculate() {
        return this.area() + this.volume();
    }
}

class Square implements Shape, ManageShapeInterface {

    @Override
    public double area() {
        return 2.0;
    }

    @Override
    public double calculate() {
        return this.area();
    }
}

public class Main {
    public static void main(String[] args) {

    }
}
