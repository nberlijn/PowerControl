package nl.nberlijn.powercontrol.app.services.command;

import javafx.concurrent.Task;
import javafx.scene.control.Alert;
import nl.nberlijn.powercontrol.app.data.objects.Command;

/**
 * Class representing a command task.
 *
 * @author Nils Berlijn
 * @version 1.0
 * @since 1.0
 */
public class CommandTask extends Task<Boolean> {

    /**
     * The command model.
     */
    private final Command command;

    /**
     * A command task constructor.
     * Initializes the command model and initializes the on succeeded event.
     *
     * @param command The command model
     */
    public CommandTask(Command command) {
        this.command = command;

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

    /**
     * Calls a service.
     * Tries to execute a new command executor.
     *
     * @return If the call has been succeeded
     * @see CommandExecutor
     */
    @Override
    protected Boolean call() {
        return new CommandExecutor(command).execute();
    }

}
