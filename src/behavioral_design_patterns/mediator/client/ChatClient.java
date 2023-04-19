package behavioral_design_patterns.mediator.client;

import behavioral_design_patterns.mediator.ChatMediator;
import behavioral_design_patterns.mediator.impl.ChatMediatorImpl;
import behavioral_design_patterns.mediator.domain.User;
import behavioral_design_patterns.mediator.impl.UserImpl;

public class ChatClient {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediatorImpl();

        User userFirst = new UserImpl(mediator, "Pankaj");
        User userSecond = new UserImpl(mediator, "Lisa");
        User userThird = new UserImpl(mediator, "Saurabh");
        User userFourth = new UserImpl(mediator, "David");

        mediator.addUser(userFirst);
        mediator.addUser(userSecond);
        mediator.addUser(userThird);
        mediator.addUser(userFourth);

        userFirst.send("Hi All gays this is I");
    }
}
