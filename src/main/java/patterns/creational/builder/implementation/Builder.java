package patterns.creational.builder.implementation;

public interface Builder {
    void buildBody();

    void insertWheels();

    void addHeadlights();

    Product getVehicle();
}

class Car implements Builder {
    private Product product = new Product();

    @Override
    public void buildBody() {
        product.add("Car: buildBody()...");
    }

    @Override
    public void insertWheels() {
        product.add("Car: insertWheels()...");
    }

    @Override
    public void addHeadlights() {
        product.add("Car: addHeadlights()...");
    }

    @Override
    public Product getVehicle() {
        return product;
    }
}

class MotorCycle implements Builder {
    private Product product = new Product();

    @Override
    public void buildBody() {
        product.add("MotorCycle: buildBody()...");
    }

    @Override
    public void insertWheels() {
        product.add("MotorCycle: insertWheels()...");
    }

    @Override
    public void addHeadlights() {
        product.add("MotorCycle: addHeadlights()...");
    }

    @Override
    public Product getVehicle() {
        return product;
    }
}