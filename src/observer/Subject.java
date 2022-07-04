package observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    private List<MyObserver> observers = new ArrayList<>();

    abstract void setState(String state);
    abstract String getState();

    public void attach(MyObserver o) {
        observers.add(o);
    }

    public void detach(MyObserver o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        for (MyObserver observer : observers) {
            observer.update();
        }
    }
}
