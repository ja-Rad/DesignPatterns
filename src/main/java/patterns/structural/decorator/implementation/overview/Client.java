package patterns.structural.decorator.implementation.overview;

public class Client {
    public static void main(String[] args) {
        ConcreteComponent component = new ConcreteComponent();

        ConcreteDecorator1 decorator1 = new ConcreteDecorator1();
        ConcreteDecorator2 decorator2 = new ConcreteDecorator2();

        // Decorating component object with decorator1
        decorator1.setComponent(component);
        decorator1.doJob();
        /*
            ConcreteComponent: doJob() I'm CLOSED FOR MODIFICATION!
            ConcreteDecorator1: doJob() is doing additional functionality
         */


        // Decorating component object with decorator1 AND decorator2
        // by passing decorator1 to setter!
        decorator2.setComponent(decorator1);
        decorator2.doJob();
        /*
            ConcreteComponent: doJob() I'm CLOSED FOR MODIFICATION!
            ConcreteDecorator1: doJob() is doing additional functionality
            ConcreteDecorator2: doJob() is doing additional functionality
         */
    }
}
