package behavioral_design_patterns.mediator.domain;

import behavioral_design_patterns.mediator.ChatMediator;

public abstract class User {
    protected ChatMediator mediator;
    protected String name;

    protected User(ChatMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void send(String message);

    public abstract void receive(String message);
}
