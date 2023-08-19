package patterns.structural.adapter.object_adapter_turkey_duck;

public interface Turkey {
    void gobble();

    void fly();
}

class WildTurkey implements Turkey {

    @Override
    public void gobble() {
        System.out.println("WildTurkey: gobble()");
    }

    @Override
    public void fly() {
        System.out.println("WildTurkey: fly()");
    }
}
