package patterns.structural.proxy.challenge;

public class NotValidHostnameException extends RuntimeException {
    public NotValidHostnameException(String message) {
        super(message);
    }
}
