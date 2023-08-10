package patterns.creational.builder.implementation;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();

        Builder carBuilder = new Car();
        director.construct(carBuilder);
        Product p1 = carBuilder.getVehicle();
        p1.show();

        Builder motorCycleBuilder = new MotorCycle();
        director.construct(motorCycleBuilder);
        Product p2 = motorCycleBuilder.getVehicle();
        p2.show();
    }
}
