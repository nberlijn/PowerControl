package nl.nberlijn.powercontrol.controllers.settings;

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

import nl.nberlijn.powercontrol.config.Commands;
import nl.nberlijn.powercontrol.config.Views;
import nl.nberlijn.powercontrol.models.Command;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

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

    /**
     * The array commands.
     */
    private final String[] commands = Commands.COMMANDS;

    /**
     * The array commands controller.
     */
    private final CommandController[] commandController = new CommandController[commands.length];

    /**
     * Initializes the settings controller.
     * Initialises the device fields and adds the available commands to the commands accordion.
     *
     * @param url            The url
     * @param resourceBundle The resource bundle
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        deviceController.initializeFields();

        try {
            TitledPane[] titledPanes = new TitledPane[commands.length];

            for (int i = 0; i < commands.length; i++) {
                FXMLLoader fxmlLoader = new FXMLLoader();
                GridPane gridPane = fxmlLoader.load(getClass().getResource(Views.COMMAND_FORM_FILE_PATH).openStream());
                Command command = new Command(commands[i]);

                commandController[i] = fxmlLoader.getController();
                commandController[i].setCommand(command);
                commandController[i].initializeFields();

                AnchorPane anchorPane = new AnchorPane(gridPane);
                titledPanes[i] = new TitledPane(command.getName(), anchorPane);
            }

            commandsAccordion.getPanes().addAll(titledPanes);
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
        deviceController.store();

        for (int i = 0; i < commands.length; i++) {
            commandController[i].store();
        }

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
