package patterns.structural.proxy.challenge;

public interface Subject {
    void getInternetConnection(String hostName) throws NotValidHostnameException;
}

class RealSubject implements Subject {

    @Override
    public void getInternetConnection(String hostName) throws NotValidHostnameException {
        System.out.println("Connecting to " + hostName);
    }
}