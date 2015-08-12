package nl.nberlijn.powercontrol.services.command;

import javafx.concurrent.Task;

import javafx.scene.control.Alert;
import nl.nberlijn.powercontrol.models.CommandModel;
import nl.nberlijn.powercontrol.ssh.SSHClientExecutor;

class CommandTask extends Task<Boolean> {

    private final CommandModel commandModel;

    public CommandTask(String command) {
        this.commandModel = new CommandModel(command);

        setOnSucceeded(event -> {
            if (getValue().equals(true)) {
                alertMessage(Alert.AlertType.INFORMATION, "Succeeded", "Succeeded", "The command " + commandModel.getName().toLowerCase() + " has been successful executed");
            } else {
                alertMessage(Alert.AlertType.ERROR, "Failed", "Failed", "Something went wrong while executing the " + commandModel.getName().toLowerCase() + " command");
            }
        });
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

    private void alertMessage(Alert.AlertType type, String title, String headerText, String contentText) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(headerText);
        alert.setContentText(contentText);
        alert.showAndWait();
    }

}
