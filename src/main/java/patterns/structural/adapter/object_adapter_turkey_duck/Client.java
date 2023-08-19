package patterns.structural.adapter.object_adapter_turkey_duck;

public class Client {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();

        Turkey wildTurkey = new WildTurkey();

        mallardDuck.quack(); // MallardDuck: quack()
        mallardDuck.fly(); // MallardDuck: fly()
        System.out.println();

        wildTurkey.gobble(); // WildTurkey: gobble()
        wildTurkey.fly(); // WildTurkey: fly()
        System.out.println();

        // We want turkey to adapt to duck. Turkey should become a Duck!
        Duck wildTurkeyAdaptedToDuck = new TurkeyAdapter(wildTurkey);
        wildTurkeyAdaptedToDuck.quack(); // WildTurkey: gobble()
        wildTurkeyAdaptedToDuck.fly(); // WildTurkey: fly() WildTurkey: fly() WildTurkey: fly() WildTurkey: fly() WildTurkey: fly()
    }
}
