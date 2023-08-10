package patterns.creational.abstract_factory.challenge;

public interface Bollywood {
    void getMovieName();
}

class BollywoodComedyMovie implements Bollywood {

    @Override
    public void getMovieName() {
        System.out.println("Bollywood comedy movie...");
    }
}

class BollywoodActionMovie implements Bollywood {

    @Override
    public void getMovieName() {
        System.out.println("Bollywood action movie...");
    }
}
