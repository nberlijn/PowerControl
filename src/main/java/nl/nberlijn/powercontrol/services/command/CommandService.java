package nl.nberlijn.powercontrol.services.command;

import javafx.concurrent.Service;
import javafx.concurrent.Task;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.layout.GridPane;

public class CommandService extends Service<Boolean> {

    private String command;
    private GridPane commandsPane;
    private ProgressIndicator progressIndicator;

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
