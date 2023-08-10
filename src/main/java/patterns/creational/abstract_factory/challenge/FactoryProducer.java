package patterns.creational.abstract_factory.challenge;

public class FactoryProducer {
    public static AbstractFactory getFactory(String movieType) {
        if (movieType.equalsIgnoreCase("HOLLYWOOD")) {
            return new HollywoodFactory();

        } else if (movieType.equalsIgnoreCase("BOLLYWOOD")) {
            return new BollywoodFactory();
        }

        return null;
    }
}
