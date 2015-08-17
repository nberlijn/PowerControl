package nl.nberlijn.powercontrol.controllers.main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.layout.GridPane;

import nl.nberlijn.powercontrol.config.Commands;
import nl.nberlijn.powercontrol.services.command.CommandService;

public class CommandsController {

    @FXML
    private GridPane commandsPane;

    @FXML
    private ProgressIndicator progressIndicator;

    @FXML
    public void handleCommandButton(ActionEvent actionEvent) {
        Button commandButton = (Button) actionEvent.getSource();
        String[] commands = Commands.COMMANDS;

        for (String command : commands) {
            if (command.equals(commandButton.getText())) {
                new CommandService(command, commandsPane, progressIndicator).start();
            }
        }
    }

}
