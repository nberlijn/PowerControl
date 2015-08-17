package nl.nberlijn.powercontrol.controllers.main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.layout.GridPane;

import nl.nberlijn.powercontrol.config.Commands;
import nl.nberlijn.powercontrol.services.command.CommandService;

/**
 * Class representing a commands controller.
 *
 * @author Nils Berlijn
 * @version 1.0
 * @since 1.0
 */
public class CommandsController {

    /**
     * The commands pane.
     */
    @FXML
    private GridPane commandsPane;

    /**
     * The progress indicator.
     */
    @FXML
    private ProgressIndicator progressIndicator;

    /**
     * Handles the command button.
     * Starts a new command service based on the pressed command button.
     *
     * @param actionEvent The action event for handling the button
     */
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
