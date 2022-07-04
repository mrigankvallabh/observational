package observer.socialmedia;

public class SMMain {
    public static void main(String[] args) {
        SMConnection bob = new SMConnection();
        SMConnection sally = new SMConnection();
        SMFeed feed = new SMFeed();
        bob.addPropertyChangeListener(feed);
        sally.addPropertyChangeListener(feed);

        sally.setStatus("Going to Oracle HackerX Conference");
        bob.setStatus("GraalVm is great but needs high learning cost");

        feed.printStatuses();
    }
}
