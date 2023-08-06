package solid.interface_segregation_principle;

// Restaurant is like 'FAT' Interface
interface Restaurant {
    void acceptOnlineOrder();

    void takeTelephoneOrder();

    void payOnline();

    void walkInCustomerOrder();

    void payInPerson();
}

class OnlineClientImpl implements Restaurant {

    @Override
    public void acceptOnlineOrder() {
        // makes sense
    }

    @Override
    public void takeTelephoneOrder() {
        // no sense
    }

    @Override
    public void payOnline() {
        // makes sense
    }

    @Override
    public void walkInCustomerOrder() {
        // makes sense
    }

    @Override
    public void payInPerson() {
        // no sense
    }
}

public class Main2 {
    public static void main(String[] args) {

    }
}
