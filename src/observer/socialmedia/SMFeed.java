package observer.socialmedia;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayDeque;
import java.util.Deque;

public class SMFeed implements PropertyChangeListener {
    private Deque<String> statuses = new ArrayDeque<>();

    public void printStatuses() {
        statuses.forEach(System.out::println);
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        statuses.add((String) evt.getNewValue());
    }
}
