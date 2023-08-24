package patterns.behavioral.chain_of_responsibility.implementation;

// Handler
public interface DispenseChain {
    void setNextChain(DispenseChain nextChain);

    void dispense(Currency currency);
}

class Dollar50Dispenser implements DispenseChain {

    private DispenseChain dispenseChain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.dispenseChain = nextChain;
    }

    @Override
    public void dispense(Currency currency) {
        if (currency.getAmount() >= 50) {
            int billNumber = currency.getAmount() / 50;
            int remainder = currency.getAmount() % 50;

            System.out.println("Dispensing " + billNumber + " 50$ bill");

            if (remainder > 0) {
                this.dispenseChain.dispense(new Currency(remainder));
            }

        } else {
            this.dispenseChain.dispense(currency);
        }
    }
}

class Dollar20Dispenser implements DispenseChain {

    private DispenseChain dispenseChain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.dispenseChain = nextChain;
    }

    @Override
    public void dispense(Currency currency) {
        if (currency.getAmount() >= 20) {
            int billNumber = currency.getAmount() / 20;
            int remainder = currency.getAmount() % 20;

            System.out.println("Dispensing " + billNumber + " 20$ bill");

            if (remainder > 0) {
                this.dispenseChain.dispense(new Currency(remainder));
            }

        } else {
            this.dispenseChain.dispense(currency);
        }
    }
}

class Dollar10Dispenser implements DispenseChain {

    private DispenseChain dispenseChain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.dispenseChain = nextChain;
    }

    @Override
    public void dispense(Currency currency) {
        if (currency.getAmount() >= 10) {
            int billNumber = currency.getAmount() / 10;
            int remainder = currency.getAmount() % 10;

            System.out.println("Dispensing " + billNumber + " 10$ bill");

            if (remainder > 0) {
                this.dispenseChain.dispense(new Currency(remainder));
            }

        } else {
            this.dispenseChain.dispense(currency);
        }
    }
}

