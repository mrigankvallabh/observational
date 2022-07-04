import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App {
    private static final Logger LOGGER = Logger.getLogger(App.class.getName());
    public static void main(String[] args) throws Exception {
        LOGGER.setLevel(Level.FINER);
        ConsoleHandler handler = new ConsoleHandler();
        handler.setLevel(Level.FINER);
        LOGGER.addHandler(handler);

        LOGGER.finest("Finest Level");
        LOGGER.finer("Finer Level");
        LOGGER.fine("Fine Level");
    }
}
