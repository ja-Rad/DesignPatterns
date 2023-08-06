package solid.liskov_substitution_principle;

abstract class Vehicle {
    abstract int getSpeed();

    abstract int getCubicCapacity();

}

class Car extends Vehicle {
    int getSpeed() {
        return 0;
    }

    int getCubicCapacity() {
        return 0;
    }

    boolean sHarchBack() {
        return false;
    }
}

class Bus extends Vehicle {
    int getSpeed() {
        return 1;
    }

    int getCubicCapacity() {
        return 1;
    }

    String getEmergency() {
        return "NO";
    }
}

public class Main {
    public static void main(String[] args) {
        // Following LSP we should be able to do this:
        // SUB-type object can replace SUPER-type objects without AFFECTING functionality. IT JUST WORKS!
        Vehicle vehicle = new Bus();
        vehicle.getSpeed(); // This is BUS but we can use getSpeed() from Vehicle

        vehicle = new Car(); // Now this is CAR

        vehicle.getCubicCapacity(); // BUT still we can USE getCubicCapacity() from Vehicle!

        // Basically the idea is that WHEN WE USE INHERITANCE the INHERITANCE SHOULD BE SMART!
        // BAD CASE EXAMPLE (Violation of LSP): BIRD -> FLYING BIRD -> PENGUIN
        // (Penguins Don`t fly! But for some reason they have method from FLYING BIRD. Now penguin.fly() is possible! THIS IS BAD!)

        // GOOD CAGE EXAMPLE (LSP dictates following): BIRD -> WATER BIRD -> PENGUIN
        // (Now LSP works! Because penguin.swim() And this is logically correct!)

        // So basically LSP is about making inheritance logically correct and NOT STUPID!
    }
}

