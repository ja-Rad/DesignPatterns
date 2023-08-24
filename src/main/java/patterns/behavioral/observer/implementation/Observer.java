package patterns.behavioral.observer.implementation;

public interface Observer {
    // method to update the observer, used by subject
    void update();

    // attach with subject to observe, not required, but, added so that the observer
    // can query the subject to see if an update has occurred
    void setSubject(Subject subject);
}

class MyTopicSubscriber implements Observer {
    private String name;

    // not required, could just pass subjects state to update method, but, also used to attach
    private Subject topic;

    public MyTopicSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        // this method could take data of subjects state that was changed, do not need to ask topic for it
        String message = (String) topic.getUpdate(this);
        if (message == null) {
            System.out.println(name + ":: No new message");
        } else {
            System.out.println(name + ":: Consuming message::" + message);
        }
    }

    @Override
    public void setSubject(Subject subject) {
        // not required, added so observer can ask subject for state
        this.topic = subject;
    }
}
