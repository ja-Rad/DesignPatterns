package patterns.structural.proxy.implementation;

public class Client {
    public static void main(String[] args) {
        Subject subject = new Proxy("someVariable1");

        // subject will doSomethingWithVariable()
        subject.display();
        /*
            Doing something with: someVariable1
            RealSubject's someVariable: someVariable1
         */
        System.out.println("-------------------------------------------------");
        subject.display();
        /*
            RealSubject's someVariable: someVariable1
         */
    }
}
