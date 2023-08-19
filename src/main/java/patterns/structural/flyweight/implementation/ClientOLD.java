package patterns.structural.flyweight.implementation;

public class ClientOLD {
    public static void main(String[] args) throws Exception {
        FlyweightFactory factory = new FlyweightFactory();

        Flyweight concreteFlyweight = factory.getConcreteFlyweight("1");
        concreteFlyweight.print();
        /*
            We didn't cache this object yet... Create ConcreteFlyweight1...
            This is ConcreteFlyweight1
         */

        // We can see here that we reuse the same object!
        for (int i = 0; i < 2; i++) {
            concreteFlyweight = factory.getConcreteFlyweight("1");
            concreteFlyweight.print();
            /*
                This is ConcreteFlyweight1
                This is ConcreteFlyweight1
             */
        }

        // to proof that we have only 1 cached object.
        System.out.println(factory.totalObjectsCreate()); // 1

        // IMPORTANT! Right now it looks like Singleton with Factory+Prototype, BUT! It is because we have ONLY INTRINSIC DATA!
        // NOW let's add EXTRINSIC data too! Type AND Color, so we will modify Flyweight and FlyweightFactory!

    }
}
