package observer;

public abstract class MyObserver {
    protected Subject subject;
    abstract void update();
}
