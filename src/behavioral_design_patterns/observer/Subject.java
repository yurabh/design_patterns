package behavioral_design_patterns.observer;

public interface Subject {
    void register(Observer obj);

    void unregister(Observer obj);

    void notifyObservers();

    Object getUpdate(Observer obj);
}
