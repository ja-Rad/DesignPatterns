package solid.dependency_injection;

public class Client {
    // Internal reference to the service used by this client
    private ExampleService service;

    // HARD-CODED Dependency.
    // Specify impl in the constructor with new().
    public Client() {
        this.service = new ExampleService();
    }

    // Method within this client that uses the services
    public String greet() {
        return "Hello " + service.getName();
    }
}

class ExampleService {
    String getName() {
        return "";
    }
}