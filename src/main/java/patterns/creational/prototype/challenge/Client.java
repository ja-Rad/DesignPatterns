package patterns.creational.prototype.challenge;

public class Client {
    public static void main(String[] args) {
        BasicCarCache.loadContext();

        BasicCar greenNano = BasicCarCache.getCar("Green Nano");
        BasicCar fordYellow1 = BasicCarCache.getCar("Ford Yellow");
        greenNano.getCarInfo();
        fordYellow1.getCarInfo();

        BasicCar fordYellow2 = BasicCarCache.getCar("Ford Yellow");
        fordYellow2.getCarInfo();
    }
}
