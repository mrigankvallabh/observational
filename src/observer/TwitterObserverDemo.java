package observer;

import java.util.Observable;
import java.util.Observer;

@SuppressWarnings(value = "deprecation")
public class TwitterObserverDemo {
    public static void main(String[] args) {
        TwitterStream stream = new TwitterStream();
        Client c1 = new Client("Bryan");
        Client c2 = new Client("Hache");

        stream.addObserver(c1);
        stream.addObserver(c2);

        stream.someoneTweeted();
    }
}

@SuppressWarnings(value = "deprecation")
class TwitterStream extends Observable {
    protected void someoneTweeted() {
        setChanged();
        notifyObservers();
    }
}

@SuppressWarnings(value = "deprecation")
class Client implements Observer {
    private String name;

    Client(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Update " + name + "'s stream, someone tweeted.");
    }
}