package nl.nberlijn.powercontrol.gui.controllers.settings;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Accordion;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import nl.nberlijn.powercontrol.api.persistence.repository.Repository;
import nl.nberlijn.powercontrol.gui.config.Views;
import nl.nberlijn.powercontrol.persistence.models.Command;
import nl.nberlijn.powercontrol.persistence.models.Commands;
import nl.nberlijn.powercontrol.persistence.models.Device;
import nl.nberlijn.powercontrol.persistence.repository.CommandsRepository;
import nl.nberlijn.powercontrol.persistence.repository.DeviceRepository;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

/**
 * Class representing the settings controller.
 *
 * @author Nils Berlijn
 * @version 1.0
 * @since 1.0
 */
@SuppressWarnings("unused")
public class SettingsController implements Initializable {

    /**
     * The device.
     */
    @FXML
    private GridPane device;
    /**
     * The device controller.
     */
    @FXML
    private DeviceController deviceController;
    /**
     * The commands accordion.
     */
    @FXML
    private Accordion commandsAccordion;

    private final Repository<Device> deviceRepository = new DeviceRepository();

    private final Repository<Commands> commandsRepository = new CommandsRepository();

    private final List<CommandController> commandControllerList = new ArrayList<>();

    /**
     * Initializes the settings controller.
     * Initialises the device fields and adds the available commands to the commands accordion.
     *
     * @param url            The url
     * @param resourceBundle The resource bundle
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        deviceController.setFields(deviceRepository.get());

        Commands commands = commandsRepository.get();
        List<Command> commandList = commands.getCommands();

        try {
            List<TitledPane> titledPaneList = new ArrayList<>();

            for (Command command : commandList) {
                FXMLLoader fxmlLoader = new FXMLLoader();

                GridPane gridPane = fxmlLoader.load(getClass().getResource(Views.COMMAND_FORM_FILE_PATH).openStream());
                AnchorPane anchorPane = new AnchorPane(gridPane);
                TitledPane titledPane = new TitledPane(command.getName(), anchorPane);

                titledPaneList.add(titledPane);

                CommandController commandController = fxmlLoader.getController();
                commandController.setFields(command);

                commandControllerList.add(commandController);
            }

            commandsAccordion.getPanes().addAll(titledPaneList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Handles the ok button.
     * Stores all the changes made and closes the window.
     *
     * @param actionEvent The action event for handling the button
     */
    @FXML
    public void handleOkButton(ActionEvent actionEvent) {
        Device device = deviceController.getFields();
        deviceRepository.update(device);

        Commands commands = new Commands();
        List<Command> commandList = commandControllerList.stream().map(CommandController::getFields).collect(Collectors.toList());
        commands.setCommands(commandList);
        commandsRepository.update(commands);

        deviceRepository.store();
        commandsRepository.store();

        closeWindow(actionEvent);
    }

    /**
     * Handles the cancel button.
     * Cancels current changes and closes the window.
     *
     * @param actionEvent The action event for handling the button
     */
    @FXML
    public void handleCancelButton(ActionEvent actionEvent) {
        closeWindow(actionEvent);
    }

    /**
     * Closes the window.
     *
     * @param actionEvent The action event for handling the button
     */
    private void closeWindow(ActionEvent actionEvent) {
        ((Stage) ((Node) actionEvent.getSource()).getScene().getWindow()).close();
    }

}
