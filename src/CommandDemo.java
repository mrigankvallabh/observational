import java.util.ArrayList;
import java.util.List;

import command.AllLightsCommand;
import command.Command;
import command.Light;
import command.Switch;
import command.ToggleCommand;

public class CommandDemo {

    public static void main(String[] args) {
        Light light1 = new Light();
        Light light2 = new Light();
        Switch lightSwitch = new Switch();

        List<Light> lights = new ArrayList<>();
        lights.add(light1);
        lights.add(light2);
    
        Command onCommand = new ToggleCommand(light1);

        lightSwitch.storeAndExecute(onCommand);
        lightSwitch.storeAndExecute(onCommand);
        lightSwitch.storeAndExecute(onCommand);

        Command allLightsOff = new AllLightsCommand(lights);
        allLightsOff.execute();
    }

}
