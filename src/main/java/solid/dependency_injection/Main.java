package solid.dependency_injection;

interface Service {
    void write(String message);
}

class ServiceA implements Service {

    @Override
    public void write(String message) {
        System.out.println("Hello World! " + message);
    }
}

class ClientOfThisService {
    private Service myService;

    //injects via the constructor
    public ClientOfThisService(Service myService) {
        this.myService = myService;
    }

    public void doSomething() {
        myService.write("This is a message");
    }
}

public class Main {
    public static void main(String[] args) {

        // the injector
        Service service = new ServiceA();

        // this injects via constructor
        ClientOfThisService client = new ClientOfThisService(service);
        client.doSomething();
    }
}