package behavioral_design_patterns.mediator;

import behavioral_design_patterns.mediator.domain.User;

public interface ChatMediator {
    void sendMessage(String message, User user);

    void addUser(User user);
}
