package nl.nberlijn.powercontrol.gui.controllers.commands;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.layout.GridPane;

import nl.nberlijn.powercontrol.api.persistence.repository.Repository;
import nl.nberlijn.powercontrol.gui.services.CommandService;
import nl.nberlijn.powercontrol.persistence.models.Command;
import nl.nberlijn.powercontrol.persistence.models.Commands;

import java.util.List;

/**
 * Class representing the commands controller.
 *
 * @author Nils Berlijn
 * @version 1.0
 * @since 1.0
 */
@SuppressWarnings("unused")
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
     * The command model.
     */
    private Repository<Commands> commandsRepository;

    /**
     * private CommandsModel commandsModel = new CommandsModel();
     * <p>
     * /**
     * Handles the command button.
     * Starts a new command service based on the pressed command button.
     *
     * @param actionEvent The action event for handling the button
     * @see CommandService
     */
    @FXML
    public void handleCommandButton(ActionEvent actionEvent) {
        Button commandButton = (Button) actionEvent.getSource();

        Commands commands = commandsRepository.get();
        List<Command> commandList = commands.getCommands();

        commandList.stream().filter(command ->
                command.getName().equals(commandButton.getText())).forEach(command ->
                        new CommandService(command, commandsPane, progressIndicator).start()
        );
    }

}
