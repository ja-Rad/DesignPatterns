package patterns.structural.adapter.object_adapter_turkey_duck;

public interface Duck {
    void quack();

    void fly();
}

class MallardDuck implements Duck {

    @Override
    public void quack() {
        System.out.println("MallardDuck: quack()");
    }

    @Override
    public void fly() {
        System.out.println("MallardDuck: fly()");
    }
}
