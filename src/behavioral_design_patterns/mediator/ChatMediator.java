package behavioral_design_patterns.mediator;

public interface ChatMediator {
    void sendMessage(String msg, User user);

    void addUser(User user);
}