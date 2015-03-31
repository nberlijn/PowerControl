package nl.nberlijn.powercontrol;

import nl.nberlijn.powercontrol.commands.*;
import nl.nberlijn.powercontrol.config.Config;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

public final class Main {

    public static void main(String[] args) {
        // commandDemo();
        configDemo();
    }

    private static void commandDemo() {
        // Receiver
        Device device = new Device();

        // Commands
        Command powerOn = new PowerOnCommand(device);
        Command powerOff = new PowerOffCommand(device);

        // Invoker
        Switch powerSwitch = new Switch();

        // Switch commands
        powerSwitch.execute(powerOn);
        powerSwitch.execute(powerOff);
        powerSwitch.execute(powerOff);
        powerSwitch.execute(powerOn);
    }

    private static void configDemo() {
        // Config
        PropertiesConfiguration propertiesConfiguration = Config.INSTANCE.getConfiguration();

        // Read property from the config
        System.out.println(propertiesConfiguration.getProperty("power_on.name"));

        // Update config
        propertiesConfiguration.setProperty("power_on.name", "Power on");

        try {
            propertiesConfiguration.save();
        } catch (ConfigurationException e) {
            System.err.println(e.getMessage());
        }
    }

}
