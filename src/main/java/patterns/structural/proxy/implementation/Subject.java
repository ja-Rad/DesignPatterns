package patterns.structural.proxy.implementation;

public interface Subject {
    void display();
}

class RealSubject implements Subject {

    private String someVariable;

    public RealSubject(String someVariable) {
        this.someVariable = someVariable;
        doSomethingWithVariable(someVariable);
    }

    private void doSomethingWithVariable(String someVariable) {
        System.out.println("Doing something with: " + someVariable);
    }

    @Override
    public void display() {
        System.out.println("RealSubject's someVariable: " + someVariable);
    }


}