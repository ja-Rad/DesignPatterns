package patterns.behavioral.chain_of_responsibility.challenge;

public class IssueRaiser {
    public ReceiverInterface receiverInterface;

    public IssueRaiser(ReceiverInterface receiverInterface) {
        this.receiverInterface = receiverInterface;
    }

    public void raiseMessage(Message message) {
        if (receiverInterface != null) {
            receiverInterface.processMessage(message);
        }
    }
}
