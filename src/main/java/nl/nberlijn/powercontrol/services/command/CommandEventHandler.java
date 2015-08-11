package nl.nberlijn.powercontrol.services.command;

import javafx.concurrent.WorkerStateEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;

public class CommandEventHandler implements EventHandler<WorkerStateEvent> {

    private Boolean value;
    private String commandName;

    public CommandEventHandler(Boolean value, String commandName) {
        this.value = value;
        this.commandName = commandName;
    }

    @Override
    public void handle(WorkerStateEvent event) {
        if (value.equals(true)) {
            alertMessage(Alert.AlertType.INFORMATION, "Succeeded", "Succeeded", "The command " + commandName + " has been successful executed");
        } else {
            alertMessage(Alert.AlertType.ERROR, "Failed", "Failed", "Something went wrong while executing the " + commandName + " command");
        }
    }

    private void alertMessage(Alert.AlertType type, String title, String headerText, String contentText) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(headerText);
        alert.setContentText(contentText);
        alert.showAndWait();
    }

}
