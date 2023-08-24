package patterns.behavioral.mediator.implementation;

import java.util.ArrayList;
import java.util.List;

public interface ChatMediator {
    void sendMessage(String message, User user);

    void addUser(User user);
}

class ChatMediatorImpl implements ChatMediator {

    private List<User> users;

    public ChatMediatorImpl() {
        users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, User currentUser) {
        for (User user : users) {
            // message should not be sent and received by the same user
            if (user != currentUser) {
                user.receive(message);
            }
        }
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }
}
