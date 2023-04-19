package behavioral_design_patterns.observer.client;

import behavioral_design_patterns.observer.Observer;
import behavioral_design_patterns.observer.Topic;
import behavioral_design_patterns.observer.TopicSubscriber;

public class ObserverPatternClient {
    public static void main(String[] args) {
        Topic topic = new Topic();

        Observer topicSubscriber = new TopicSubscriber("Obj1");
        Observer myTopicSubscriber = new TopicSubscriber("Obj2");
        Observer subscriber = new TopicSubscriber("Obj3");

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
