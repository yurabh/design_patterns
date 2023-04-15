package behavioral_design_patterns.observer;

public interface Observer {
    void update();

    void setSubject(Subject sub);
}
