package behavioral_design_patterns.mediator.impl;

import behavioral_design_patterns.mediator.ChatMediator;
import behavioral_design_patterns.mediator.domain.User;

public class UserImpl extends User {
    public UserImpl(ChatMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void send(String message) {
        System.out.println(this.name.concat(" ").concat(" Sending Message: ").concat(message));
        mediator.sendMessage(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println(this.name.concat(" ").concat("Received Message: ").concat(message));
    }
}
