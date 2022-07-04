package observer;

public class PhoneClient extends MyObserver {

    public PhoneClient(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    public void addMessage(String message) {
        subject.setState(message);
    }

    @Override
    void update() {
        System.out.println("Phone stream: " + subject.getState());
    }
}
