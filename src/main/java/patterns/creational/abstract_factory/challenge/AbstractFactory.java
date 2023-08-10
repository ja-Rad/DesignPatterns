package patterns.creational.abstract_factory.challenge;

public abstract class AbstractFactory {
    public abstract Hollywood getHollywoodMovie(String genreType);

    public abstract Bollywood getBollywoodMovie(String genreType);

}

class HollywoodFactory extends AbstractFactory {

    @Override
    public Hollywood getHollywoodMovie(String genreType) {
        if (genreType.equalsIgnoreCase("COMEDY")) {
            return new HollywoodComedyMovie();

        } else if (genreType.equalsIgnoreCase("ACTION")) {
            return new HollywoodActionMovie();
        }

        return null;
    }

    @Override
    public Bollywood getBollywoodMovie(String genreType) {
        return null;
    }
}

class BollywoodFactory extends AbstractFactory {

    @Override
    public Hollywood getHollywoodMovie(String genreType) {
        return null;
    }

    @Override
    public Bollywood getBollywoodMovie(String genreType) {
        if (genreType.equalsIgnoreCase("COMEDY")) {
            return new BollywoodComedyMovie();

        } else if (genreType.equalsIgnoreCase("ACTION")) {
            return new BollywoodActionMovie();
        }

        return null;
    }
}