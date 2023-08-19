package patterns.structural.adapter.object_adapter_turkey_duck;

public class TurkeyAdapter implements Duck {
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        // because turkey doesn`t fly like duck (it need to fly 5 times to be as efficient as duck...)
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
