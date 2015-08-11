package nl.nberlijn.powercontrol.services.command;

import javafx.concurrent.Task;

import nl.nberlijn.powercontrol.models.CommandModel;
import nl.nberlijn.powercontrol.ssh.SSHClientExecutor;

public class CommandTask extends Task<Boolean> {

    private CommandModel commandModel;

    public CommandTask(String command) {
        this.commandModel = new CommandModel(command);
        setOnSucceeded(new CommandEventHandler(getValue(), commandModel.getName()));
    }

    @Override
    protected Boolean call() {
        try {
            new SSHClientExecutor(commandModel).execute();
        } catch (Exception e) {
            return false;
        }

        return true;
    }

}
