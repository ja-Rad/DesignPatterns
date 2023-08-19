package patterns.structural.bridge.implementation;

public class Client {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Car(new Produce(), new Assemble());
        vehicle1.manufacture();
        /*
            Car
            Produced
            And Assembled
         */

        Vehicle vehicle2 = new Bike(new Produce(), new Assemble());
        vehicle2.manufacture();
        /*
            Bike
            Produced
            And Assembled
         */
    }
}
