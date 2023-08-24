package patterns.behavioral.chain_of_responsibility.challenge;

public class Client {
    public static void main(String[] args) {
        ReceiverInterface faxErrorHandler = new FaxErrorHandler();
        ReceiverInterface emailErrorHandler = new EmailErrorHandler();

        faxErrorHandler.setNextChain(emailErrorHandler);

        IssueRaiser raiser = new IssueRaiser(faxErrorHandler);

        Message message1 = new Message("Fax is reaching late to the destination", MessagePriority.NORMAL);
        Message message2 = new Message("Email cannot be sent", MessagePriority.HIGH);

        raiser.raiseMessage(message1);
        raiser.raiseMessage(message2);
    }
}
