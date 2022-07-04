package mediator;

import java.util.Timer;
import java.util.TimerTask;

public class TimerDemo {
    static TimerDemo object;
    public static void main(String[] args) throws InterruptedException {
        object = new TimerDemo();
        Timer timer = new Timer();
        TimerTask task = new SomeTimerTask();
        timer.schedule(task, 1000, 3000);
        System.out.println(task.scheduledExecutionTime());

        synchronized(object) {
            object.wait();
        }
        System.out.println("Cancel the timer task: " + task.cancel());
        timer.cancel();
    }
}

/**
 * SomeTimerTask
 */
class SomeTimerTask extends TimerTask {
    private static int i = 0;
    @Override
    public void run() {
        System.out.println("Timer ran " + ++i);
        if (i == 4) {
            synchronized(TimerDemo.object) {
                TimerDemo.object.notify();
            }
        }
    }
}