package patterns.structural.proxy.challenge;

public class Client {
    public static void main(String[] args) {
        Subject subject = new Proxy();
        try {
            subject.getInternetConnection("school.org"); // Connecting to school.org
            subject.getInternetConnection("casino.com"); // Access Denied
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
