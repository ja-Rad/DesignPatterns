package patterns.behavioral.chain_of_responsibility.implementation;

public class Client {
    private DispenseChain chain1;

    public Client() {
        // initialize the chain
        this.chain1 = new Dollar50Dispenser();
        DispenseChain chain2 = new Dollar20Dispenser();
        DispenseChain chain3 = new Dollar10Dispenser();

        // set the chain of responsibility
        chain1.setNextChain(chain2);
        chain2.setNextChain(chain3);
    }

    public static void main(String[] args) {
        Client atmDispenser = new Client();
        int accountBalance = 180; // our bank account

        // process the request
        atmDispenser.chain1.dispense(new Currency(accountBalance));
        /*
            Dispensing 3 50$ bill
            Dispensing 1 20$ bill
            Dispensing 1 10$ bill
         */

    }
}
