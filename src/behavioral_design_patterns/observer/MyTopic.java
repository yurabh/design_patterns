package behavioral_design_patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class MyTopic implements Subject {
    private final List<Observer> observers;
    private String message;
    private boolean changed;
    private final Object mutex = new Object();

    public MyTopic() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        if (observer == null) throw new NullPointerException("Null Observer");
        synchronized (mutex) {
            if (!observers.contains(observer)) observers.add(observer);
        }
    }

    @Override
    public void unregister(Observer observer) {
        synchronized (mutex) {
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        List<Observer> observersLocal;
        synchronized (mutex) {
            if (!changed) return;
            observersLocal = new ArrayList<>(this.observers);
            this.changed = false;
        }
        for (Observer observer : observersLocal) {
            observer.update();
        }
    }

    @Override
    public Object getUpdate(Observer observer) {
        return this.message;
    }

    public void postMessage(String message) {
        System.out.println("Message Posted to Topic: " + message);
        this.message = message;
        this.changed = true;
        notifyObservers();
    }
}
