package patterns.behavioral.chain_of_responsibility.challenge;

public interface ReceiverInterface {
    boolean processMessage(Message message);

    void setNextChain(ReceiverInterface nextChain);
}

class FaxErrorHandler implements ReceiverInterface {
    private ReceiverInterface receiverInterface;


    @Override
    public boolean processMessage(Message message) {
        if (message.getText().contains("Fax")) {
            System.out.println("FaxErrorHandler processed " + message.getPriority() + " priority issue: " + message.getText());
            return true;

        } else {
            if (receiverInterface != null) {
                receiverInterface.processMessage(message);
            }
            return false;
        }
    }

    @Override
    public void setNextChain(ReceiverInterface nextChain) {
        this.receiverInterface = nextChain;
    }
}

class EmailErrorHandler implements ReceiverInterface {
    private ReceiverInterface receiverInterface;


    @Override
    public boolean processMessage(Message message) {
        if (message.getText().contains("Email")) {
            System.out.println("EmailErrorHandler processed " + message.getPriority() + " priority issue: " + message.getText());
            return true;

        } else {
            if (receiverInterface != null) {
                receiverInterface.processMessage(message);
            }
            return false;
        }
    }

    @Override
    public void setNextChain(ReceiverInterface nextChain) {
        this.receiverInterface = nextChain;
    }
}
