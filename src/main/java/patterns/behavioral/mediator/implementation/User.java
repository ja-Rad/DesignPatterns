package patterns.behavioral.mediator.implementation;

public abstract class User {
    protected ChatMediator chatMediator;
    protected String name;

    public User(ChatMediator chatMediator, String name) {
        this.chatMediator = chatMediator;
        this.name = name;
    }

    public abstract void send(String message);

    public abstract void receive(String message);
}

class UserImpl extends User {

    public UserImpl(ChatMediator chatMediator, String name) {
        super(chatMediator, name);
    }

    @Override
    public void send(String message) {
        System.out.println(this.name + "|| Sending Message: " + message);
        this.chatMediator.sendMessage(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println(this.name + "|| Received Message: " + message);
    }
}
