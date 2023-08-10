package patterns.creational.abstract_factory.challenge;

public interface Hollywood {
    void getMovieName();
}

class HollywoodComedyMovie implements Hollywood {

    @Override
    public void getMovieName() {
        System.out.println("Hollywood comedy movie...");
    }
}

class HollywoodActionMovie implements Hollywood {

    @Override
    public void getMovieName() {
        System.out.println("Hollywood action movie...");
    }
}