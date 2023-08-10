package patterns.creational.factory.challenge;

public class AnimalFactory {

    public Animal getAnimalType(String animalType) {
        if (animalType == null) {
            return null;

        } else if (animalType.equalsIgnoreCase("DUCK")) {
            return new Duck();

        } else if (animalType.equalsIgnoreCase("TIGER")) {
            return new Tiger();

        } else {
            return null;
        }
    }

}
