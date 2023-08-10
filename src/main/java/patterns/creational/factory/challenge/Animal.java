package patterns.creational.factory.challenge;

public interface Animal {
    void eat();
}

class Duck implements Animal {

    @Override
    public void eat() {
        System.out.println("Duck: eat()");
    }
}

class Tiger implements Animal {

    @Override
    public void eat() {
        System.out.println("Tiger: eat()");
    }
}
