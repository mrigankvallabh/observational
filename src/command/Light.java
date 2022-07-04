package command;

public class Light {

    private boolean isOn = false;

    public void toggle() {
        if (isOn) {
            off();
            isOn = false;
        } else {
            on();
            isOn = true;
        }
    }

    public void on() {
        System.out.println("Lights Switched On");
    }

    public void off() {
        System.out.println("Lights Switched Off");
    }

}
