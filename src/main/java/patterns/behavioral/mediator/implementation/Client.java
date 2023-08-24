package patterns.behavioral.mediator.implementation;

public class Client {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediatorImpl();

        User user1 = new UserImpl(mediator, "Jason");
        User user2 = new UserImpl(mediator, "Shrek");
        User user3 = new UserImpl(mediator, "Pudge");
        User user4 = new UserImpl(mediator, "Nicolas");
        // Now mediator knows about all of them

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);

        user1.send("Hi all!");
        /*
            Jason|| Sending Message: Hi all!
            Shrek|| Received Message: Hi all!
            Pudge|| Received Message: Hi all!
            Nicolas|| Received Message: Hi all!
         */
    }
}
