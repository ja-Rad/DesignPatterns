package patterns.structural.flyweight.implementation;

public class Client {
    public static void main(String[] args) throws Exception {
        FlyweightFactory factory = new FlyweightFactory();

        Flyweight type1_1 = factory.getConcreteFlyweight("Type1");
        type1_1.print();

        Flyweight type1_2 = factory.getConcreteFlyweight("Type1");
        type1_2.setExtrinsicData("abc");
        type1_2.print();

        Flyweight type1_3 = factory.getConcreteFlyweight("Type1");
        type1_3.setExtrinsicData("def");
        type1_3.print();
        /*
            We didn't cache Type1 object yet... Create ConcreteFlyweight Type1...
            This is Type1 with Extrinsic data: null
            This is Type1 with Extrinsic data: abc
            This is Type1 with Extrinsic data: def
         */

        System.out.println(factory.totalObjectsCreate()); // 1
    }
}
