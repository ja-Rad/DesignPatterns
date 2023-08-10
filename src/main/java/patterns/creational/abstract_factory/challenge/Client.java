package patterns.creational.abstract_factory.challenge;

public class Client {
    public static void main(String[] args) {
        AbstractFactory hollywoodFactory = FactoryProducer.getFactory("Hollywood");

        Hollywood hollywoodComedyMovie = hollywoodFactory.getHollywoodMovie("Comedy");
        Hollywood hollywoodActionMovie = hollywoodFactory.getHollywoodMovie("Action");
        hollywoodComedyMovie.getMovieName(); // Hollywood comedy movie...
        hollywoodActionMovie.getMovieName(); // Hollywood action movie...


        AbstractFactory bollywoodFactory = FactoryProducer.getFactory("Bollywood");

        Bollywood bollywoodComedyMovie = bollywoodFactory.getBollywoodMovie("Comedy");
        Bollywood bollywoodActionMovie = bollywoodFactory.getBollywoodMovie("Action");
        bollywoodComedyMovie.getMovieName(); // Bollywood comedy movie...
        bollywoodActionMovie.getMovieName(); // Bollywood action movie...

    }
}
