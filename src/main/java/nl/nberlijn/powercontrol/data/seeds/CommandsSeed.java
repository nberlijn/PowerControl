package nl.nberlijn.powercontrol.data.seeds;

import nl.nberlijn.powercontrol.data.objects.Command;
import nl.nberlijn.powercontrol.data.objects.Commands;
import nl.nberlijn.powercontrol.kernel.seeder.Seed;
import nl.nberlijn.powercontrol.kernel.seeder.Seeder;

import java.util.ArrayList;
import java.util.List;

@Seed
@SuppressWarnings("unused")
public class CommandsSeed implements Seeder<Commands> {

    @Override
    public Commands seed() {
        Commands commands = new Commands();
        List<Command> commandList = new ArrayList<>();

        Command powerOn = new Command();
        powerOn.setName("Power on");
        powerOn.setHost("host.com");
        powerOn.setUser("user");
        powerOn.setPassword("password");
        powerOn.setPort(22);
        powerOn.setTimeout(10000);
        powerOn.setCommand("power on command");

        Command powerOff = new Command();
        powerOff.setName("Power off");
        powerOff.setHost("host.com");
        powerOff.setUser("user");
        powerOff.setPassword("password");
        powerOff.setPort(22);
        powerOff.setTimeout(10000);
        powerOff.setCommand("power off command");

        commandList.add(powerOn);
        commandList.add(powerOff);

        commands.setCommands(commandList);

        return commands;
    }

}
