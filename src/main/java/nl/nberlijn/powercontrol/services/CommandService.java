package nl.nberlijn.powercontrol.services;

import javafx.concurrent.Service;
import javafx.concurrent.Task;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.layout.GridPane;

public class CommandService extends Service<Boolean> {

    private final String command;
    private final GridPane commandsPane;
    private final ProgressIndicator progressIndicator;

    public CommandService(String command, GridPane commandsPane, ProgressIndicator progressIndicator) {
        this.command = command;
        this.commandsPane = commandsPane;
        this.progressIndicator = progressIndicator;
    }

    @Override
    protected Task<Boolean> createTask() {
        commandsPane.disableProperty().bind(runningProperty());
        progressIndicator.visibleProperty().bind(runningProperty());
        progressIndicator.progressProperty().bind(progressProperty());

        return new CommandTask(command);
    }

}
