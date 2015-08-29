package nl.nberlijn.powercontrol.persistence.seeds;

import nl.nberlijn.powercontrol.api.persistence.seeder.Seed;
import nl.nberlijn.powercontrol.api.persistence.seeder.Seeder;
import nl.nberlijn.powercontrol.persistence.models.Command;
import nl.nberlijn.powercontrol.persistence.models.Commands;
import nl.nberlijn.powercontrol.persistence.models.Host;
import nl.nberlijn.powercontrol.persistence.models.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Class representing a Commands Seed.
 *
 * @author Nils Berlijn
 * @version 1.0
 * @since 1.0
 */
@Seed(location = "storage")
@SuppressWarnings("unused")
public class CommandsSeed implements Seeder<Commands> {

    /**
     * Seeds the Commands.
     *
     * @return The commands
     */
    @Override
    public Commands seed() {
        Commands commands = new Commands();
        List<Command> commandList = new ArrayList<>();

        Host powerOnHost = new Host();
        powerOnHost.setHost("host.com");
        powerOnHost.setName("Power on");
        powerOnHost.setPort(22);

        User powerOnUser = new User();
        powerOnUser.setUser("user");
        powerOnUser.setPassword("password");

        Command powerOnCommand = new Command();
        powerOnCommand.setHost(powerOnHost);
        powerOnCommand.setUser(powerOnUser);
        powerOnCommand.setTimeout(10000);
        powerOnCommand.setCommand("power on command");

        Host powerOffHost = new Host();
        powerOffHost.setHost("host.com");
        powerOffHost.setName("Power off");
        powerOffHost.setPort(22);

        User powerOffUser = new User();
        powerOffUser.setUser("user");
        powerOffUser.setPassword("password");

        Command powerOffCommand = new Command();
        powerOffCommand.setHost(powerOffHost);
        powerOffCommand.setUser(powerOffUser);
        powerOffCommand.setTimeout(10000);
        powerOffCommand.setCommand("power off command");

        commandList.add(powerOnCommand);
        commandList.add(powerOffCommand);

        commands.setCommands(commandList);

        return commands;
    }

}
