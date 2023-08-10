package patterns.creational.builder.challenge;

public abstract class Burger implements Item {
    @Override
    public Packing getPacking() {
        return new Wrapper();
    }
}

class VegBurger extends Burger {

    @Override
    public String getName() {
        return "Veg Burger";
    }

    @Override
    public Float getPrice() {
        return 25.0f;
    }
}

class ChickenBurger extends Burger {

    @Override
    public String getName() {
        return "Chicken Burger";
    }

    @Override
    public Float getPrice() {
        return 50.5f;
    }
}
