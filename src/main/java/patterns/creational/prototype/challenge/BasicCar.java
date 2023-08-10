package patterns.creational.prototype.challenge;

public abstract class BasicCar implements Cloneable {
    protected String modelName;
    protected String price = "0.00$";

    @Override
    public BasicCar clone() {
        try {
            BasicCar clone = (BasicCar) super.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public String getModelName() {
        return modelName;
    }

    public void getCarInfo() {
        System.out.println("Car is: " + this.modelName + " and its price is " + this.price + " Object address: " + this);
    }
}

class Nano extends BasicCar {
    public Nano() {
        this.modelName = "Green Nano";
        this.price = "189,818.00$";
    }
}

class Ford extends BasicCar {
    public Ford() {
        this.modelName = "Ford Yellow";
        this.price = "561,925.00$";
    }
}
