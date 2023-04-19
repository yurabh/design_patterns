package behavioral_design_patterns.state.client;

import behavioral_design_patterns.state.State;
import behavioral_design_patterns.state.TVContext;
import behavioral_design_patterns.state.TVStartState;
import behavioral_design_patterns.state.TVStopState;

public class TVClient {
    public static void main(String[] args) {
        TVContext context = new TVContext();
        State tvStartState = new TVStartState();
        State tvStopState = new TVStopState();

        context.setState(tvStartState);
        context.doAction();


        context.setState(tvStopState);
        context.doAction();
    }
}
