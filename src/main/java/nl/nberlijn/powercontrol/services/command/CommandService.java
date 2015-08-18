package nl.nberlijn.powercontrol.services.command;

import javafx.concurrent.Service;
import javafx.concurrent.Task;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.layout.GridPane;

/**
 * Class representing a command service.
 *
 * @author Nils Berlijn
 * @version 1.0
 * @since 1.0
 */
public class CommandService extends Service<Boolean> {

    /**
     * The command.
     */
    private final String command;

    /**
     * The commands pane.
     */
    private final GridPane commandsPane;

    /**
     * The progress indicator.
     */
    private final ProgressIndicator progressIndicator;

    /**
     * A command service constructor.
     * Initializes the variables.
     *
     * @param command           The command
     * @param commandsPane      The commands pane
     * @param progressIndicator The progress indicator
     */
    public CommandService(String command, GridPane commandsPane, ProgressIndicator progressIndicator) {
        this.command = command;
        this.commandsPane = commandsPane;
        this.progressIndicator = progressIndicator;
    }

    /**
     * Creates a new task.
     * Binds this command service to the commands pane and progress indicator.
     * Finally it returns a new command task.
     *
     * @return A new command
     * @see CommandTask
     */
    @Override
    protected Task<Boolean> createTask() {
        commandsPane.disableProperty().bind(runningProperty());
        progressIndicator.visibleProperty().bind(runningProperty());
        progressIndicator.progressProperty().bind(progressProperty());

        return new CommandTask(command);
    }

}
