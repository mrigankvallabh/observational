import observer.MessageStream;
import observer.PhoneClient;
import observer.Subject;
import observer.TabletClient;

public class ObserverDemo {
    public static void main(String[] args) {
        Subject subject = new MessageStream();
        PhoneClient client = new PhoneClient(subject);
        TabletClient client2 = new TabletClient(subject);
        client.addMessage("A new message from Phone");
        client2.addMessage("A new message from Tablet");
    }
}
