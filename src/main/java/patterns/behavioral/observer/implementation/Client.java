package patterns.behavioral.observer.implementation;

public class Client {
    public static void main(String[] args) {
        // create subject
        MyTopic topic = new MyTopic();

        // create observers
        Observer observer1 = new MyTopicSubscriber("Observer1");
        Observer observer2 = new MyTopicSubscriber("Observer2");
        Observer observer3 = new MyTopicSubscriber("Observer3");

        // register observers to the subject, could have added the registration as part of the observer
        topic.register(observer1);
        topic.register(observer2);
        topic.register(observer3);

        // attach observer to subject
        observer1.setSubject(topic);
        observer2.setSubject(topic);
        observer3.setSubject(topic);

        // check if any update is available, not required
        observer1.update(); // Observer1:: No new message

        // now send message to subject, trigger notifyAll
        topic.postMessage("New message");
        /*
            Message Posted to Topic: New message
            Observer1:: Consuming message::New message
            Observer2:: Consuming message::New message
            Observer3:: Consuming message::New message
         */
    }
}
