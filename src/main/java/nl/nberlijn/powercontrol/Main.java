package nl.nberlijn.powercontrol;

import nl.nberlijn.powercontrol.commands.*;
import nl.nberlijn.powercontrol.controllers.CommandController;
import nl.nberlijn.powercontrol.controllers.PowerOnCommandController;
import nl.nberlijn.powercontrol.models.CommandModel;
import nl.nberlijn.powercontrol.models.PowerOnCommandModel;
import nl.nberlijn.powercontrol.views.CommandView;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

public final class Main {

    public static void main(String[] args) {
        // commandDemo();
        // configDemo();
        mvcDemo();
    }

    private static void commandDemo() {
        // Receiver
        Device device = new Device();

        // Commands
        Command powerOn = new PowerOnCommand(device);
        Command powerOff = new PowerOffCommand(device);

        // Invoker
        Switch switcher = new Switch();

        // Switch commands
        switcher.execute(powerOn);
        switcher.execute(powerOff);
        switcher.execute(powerOff);
        switcher.execute(powerOn);
    }

    private static void configDemo() {
        try {
            // Config
            PropertiesConfiguration powerOnConfiguration = new PropertiesConfiguration("power_on.properties");

            // Read property from the config
            System.out.println(powerOnConfiguration.getProperty("name"));

            // Update config
            powerOnConfiguration.setProperty("name", "Power on");

            // Read property from the config
            System.out.println(powerOnConfiguration.getProperty("name"));
        } catch (ConfigurationException e) {
            System.err.println(e.getMessage());
        }
    }

    private static void mvcDemo() {
        // MVC
        CommandModel powerOnCommandModel = new PowerOnCommandModel();
        CommandView powerOnCommandView = new CommandView();
        CommandController powerOnCommandController = new PowerOnCommandController(powerOnCommandModel, powerOnCommandView);

        // Update the view
        powerOnCommandController.updateView();

        // Update some data
        powerOnCommandModel.setName("Name update");
        powerOnCommandModel.setHost("Host update");
        powerOnCommandModel.setUser("User update");
        powerOnCommandModel.setPassword("Password update");
        powerOnCommandModel.setPort(8787);
        powerOnCommandModel.setTimeout(5000);
        powerOnCommandModel.setCommand("Command update");
        powerOnCommandModel.save();

        // Update the view
        powerOnCommandController.updateView();
    }

}
