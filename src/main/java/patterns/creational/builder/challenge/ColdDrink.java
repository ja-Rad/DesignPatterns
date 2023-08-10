package patterns.creational.builder.challenge;

public abstract class ColdDrink implements Item {
    @Override
    public Packing getPacking() {
        return new Bottle();
    }
}

class Coke extends ColdDrink {

    @Override
    public String getName() {
        return "Coke";
    }

    @Override
    public Float getPrice() {
        return 30.0f;
    }
}

class Pepsi extends ColdDrink {

    @Override
    public String getName() {
        return "Pepsi";
    }

    @Override
    public Float getPrice() {
        return 35.0f;
    }
}
