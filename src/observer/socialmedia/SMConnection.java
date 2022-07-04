package observer.socialmedia;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class SMConnection {
    private String status = "";
    private PropertyChangeSupport support = new PropertyChangeSupport(this);

    public void setStatus(String status) {
        // Order is important
        support.firePropertyChange("status", this.status, status);
        this.status = status;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener("status", listener);
    }
}
