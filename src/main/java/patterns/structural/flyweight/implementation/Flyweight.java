package patterns.structural.flyweight.implementation;

// For Clients to set Intrinsic data
public interface Flyweight {
    void print();

    // ↓modifications↓ (adding EXTRINSIC DATA)
    void setExtrinsicData(String data);
}

// ↓modifications↓ (adding ConcreteFlyweight)
class ConcreteFlyweight implements Flyweight {
    private String flyweightType;
    private String extrinsicData;

    public ConcreteFlyweight(String concreteType) {
        this.flyweightType = concreteType;
    }

    @Override
    public void print() {
        System.out.println("This is " + flyweightType + " with Extrinsic data: " + extrinsicData);
    }

    @Override
    public void setExtrinsicData(String data) {
        this.extrinsicData = data;
    }
}


// ↓modifications↓ (WE DON`T NEED DIFFERENT Concrete types here)
//class ConcreteFlyweight1 implements Flyweight {
//
//    @Override
//    public void print() {
//        System.out.println("This is ConcreteFlyweight1");
//    }
//}
//
//class ConcreteFlyweight2 implements Flyweight {
//
//    @Override
//    public void print() {
//        System.out.println("This is ConcreteFlyweight2");
//    }
//}

