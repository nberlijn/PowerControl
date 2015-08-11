package nl.nberlijn.powercontrol.services.command;

import javafx.concurrent.Task;

import javafx.concurrent.WorkerStateEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import nl.nberlijn.powercontrol.models.CommandModel;
import nl.nberlijn.powercontrol.ssh.SSHClientExecutor;

public class CommandTask extends Task<Boolean> {

    private CommandModel commandModel;

    public CommandTask(String command) {
        this.commandModel = new CommandModel(command);

        setOnSucceeded(new EventHandler<WorkerStateEvent>() {
            @Override
            public void handle(WorkerStateEvent event) {
                if (getValue().equals(true)) {
                    alertMessage(Alert.AlertType.INFORMATION, "Succeeded", "Succeeded", "The command " + commandModel.getName() + " has been successful executed");
                } else {
                    alertMessage(Alert.AlertType.ERROR, "Failed", "Failed", "Something went wrong while executing the " + commandModel.getName() + " command");
                }
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
