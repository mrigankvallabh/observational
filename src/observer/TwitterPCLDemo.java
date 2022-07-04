package observer;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class TwitterPCLDemo {
    public static void main(String[] args) {
        TwitterStream1 stream = new TwitterStream1();
        Client1 c1 = new Client1("Bryan");
        Client1 c2 = new Client1("Hache");

        stream.addPropertyChangeListener(c1);
        stream.addPropertyChangeListener(c2);

        stream.setTweet("A new Tweet");
    }
}

class TwitterStream1 {
    private String tweet = "";
    private PropertyChangeSupport support = new PropertyChangeSupport(this);
    
    public void setTweet(String tweet) {
        support.firePropertyChange("tweet", this.tweet, tweet);
        this.tweet = tweet;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener("tweet", listener);
    }
}

class Client1 implements PropertyChangeListener {
    private String name;

    Client1(String name) {
        this.name = name;
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println("Update " + name + "'s stream, someone tweeted: " + (String) evt.getNewValue());
    }
}