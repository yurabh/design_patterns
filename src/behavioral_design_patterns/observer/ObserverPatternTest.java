package behavioral_design_patterns.observer;

public class ObserverPatternTest {
    public static void main(String[] args) {
        MyTopic topic = new MyTopic();

        Observer topicSubscriber = new MyTopicSubscriber("Obj1");
        Observer myTopicSubscriber = new MyTopicSubscriber("Obj2");
        Observer subscriber = new MyTopicSubscriber("Obj3");

        topic.register(topicSubscriber);
        topic.register(myTopicSubscriber);
        topic.register(subscriber);

        topicSubscriber.setSubject(topic);
        myTopicSubscriber.setSubject(topic);
        subscriber.setSubject(topic);

        topicSubscriber.update();

        topic.postMessage("Message to the topic");
    }
}
