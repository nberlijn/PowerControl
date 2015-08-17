package nl.nberlijn.powercontrol.controllers.settings;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import nl.nberlijn.powercontrol.models.CommandModel;

/**
 * Class representing a command controller.
 *
 * @author Nils Berlijn
 * @version 1.0
 * @since 1.0
 */
public class CommandController {

    /**
     * The name text field.
     */
    @FXML
    private TextField nameTextField;

    /**
     * The host text field.
     */
    @FXML
    private TextField hostTextField;

    /**
     * The user text field.
     */
    @FXML
    private TextField userTextField;

    /**
     * The password text field.
     */
    @FXML
    private PasswordField passwordField;

    /**
     * The port text field.
     */
    @FXML
    private TextField portTextField;

    /**
     * The timeout text field.
     */
    @FXML
    private TextField timeoutTextField;

    /**
     * The commands text field.
     */
    @FXML
    private TextField commandTextField;

    /**
     * The command model.
     */
    private CommandModel commandModel;

    /**
     * Initializes the fields with text from the command model.
     */
    public void initializeFields() {
        nameTextField.setEditable(false);
        nameTextField.setDisable(true);

        nameTextField.setText(commandModel.getName());
        hostTextField.setText(commandModel.getHost());
        userTextField.setText(commandModel.getUser());
        passwordField.setText(commandModel.getPassword());
        portTextField.setText(String.valueOf(commandModel.getPort()));
        timeoutTextField.setText(String.valueOf(commandModel.getTimeout()));
        commandTextField.setText(commandModel.getCommand());
    }

    /**
     * Stores the data input from the fields to the command model and finally store it.
     */
    public void store() {
        commandModel.setName(nameTextField.getText());
        commandModel.setHost(hostTextField.getText());
        commandModel.setUser(userTextField.getText());
        commandModel.setPassword(passwordField.getText());
        commandModel.setPort(Integer.valueOf(portTextField.getText()));
        commandModel.setTimeout(Integer.valueOf(timeoutTextField.getText()));
        commandModel.setCommand(commandTextField.getText());

        commandModel.store();
    }

    /**
     * Sets the commands model.
     *
     * @param commandModel The command model
     */
    public void setCommandModel(CommandModel commandModel) {
        this.commandModel = commandModel;
    }

}
