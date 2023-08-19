package patterns.structural.proxy.implementation;

public class Proxy implements Subject {

    private RealSubject realSubject;
    private String someVariable;

    public Proxy(String someVariable) {
        this.someVariable = someVariable;
    }

    // Loads realSubject on demand (here we save memory)
    @Override
    public void display() {
        if (realSubject == null) {
            realSubject = new RealSubject(someVariable);
        }

        realSubject.display();
    }
}
