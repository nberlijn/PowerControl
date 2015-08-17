package nl.nberlijn.powercontrol.services;

import javafx.concurrent.Task;
import javafx.scene.control.Alert;

import nl.nberlijn.powercontrol.models.Command;
import nl.nberlijn.powercontrol.ssh.SSHClientExecutor;

class CommandTask extends Task<Boolean> {

    private final Command command;

    public CommandTask(String command) {
        this.command = new Command(command);

        setOnSucceeded(event -> {
            if (getValue().equals(true)) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Succeeded");
                alert.setHeaderText("Succeeded");
                alert.setContentText("The command " + this.command.getName().toLowerCase() + " has been successful executed");
                alert.showAndWait();
            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Failed");
                alert.setHeaderText("Failed");
                alert.setContentText("Something went wrong while executing the " + this.command.getName().toLowerCase() + " command");
                alert.showAndWait();
            }
        });
    }

    @Override
    protected Boolean call() {
        try {
            new SSHClientExecutor(command).execute();
        } catch (Exception e) {
            return false;
        }

        return true;
    }

}
