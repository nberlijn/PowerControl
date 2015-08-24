package nl.nberlijn.powercontrol.controllers.settings;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import nl.nberlijn.powercontrol.objects.Command;

/**
 * Class representing the command controller.
 *
 * @author Nils Berlijn
 * @version 1.0
 * @since 1.0
 */
@SuppressWarnings("unused")
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

    public Command getFields() {
        Command command = new Command();
        command.setName(nameTextField.getText());
        command.setHost(hostTextField.getText());
        command.setUser(userTextField.getText());
        command.setPassword(passwordField.getText());
        command.setPort(Integer.valueOf(portTextField.getText()));
        command.setTimeout(Integer.valueOf(timeoutTextField.getText()));
        command.setCommand(commandTextField.getText());

        return command;
    }

    public void setFields(Command command) {
        nameTextField.setEditable(false);
        nameTextField.setDisable(true);

        nameTextField.setText(command.getName());
        hostTextField.setText(command.getHost());
        userTextField.setText(command.getUser());
        passwordField.setText(command.getPassword());
        portTextField.setText(String.valueOf(command.getPort()));
        timeoutTextField.setText(String.valueOf(command.getTimeout()));
        commandTextField.setText(command.getCommand());
    }

}
