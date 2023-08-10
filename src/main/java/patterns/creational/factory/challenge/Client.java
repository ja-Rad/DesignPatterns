package patterns.creational.factory.challenge;

public class Client {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();

        Animal duck = animalFactory.getAnimalType("DUCK");
        duck.eat();

        Animal tiger = animalFactory.getAnimalType("TIGER");
        tiger.eat();

        Animal something = animalFactory.getAnimalType("something");
        something.eat();
    }
}
