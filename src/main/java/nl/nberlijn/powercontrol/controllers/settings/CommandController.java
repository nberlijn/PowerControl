package nl.nberlijn.powercontrol.controllers.settings;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import nl.nberlijn.powercontrol.models.CommandModel;

public class CommandController {

    @FXML
    private TextField nameTextField;

    @FXML
    private TextField hostTextField;

    @FXML
    private TextField userTextField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private TextField portTextField;

    @FXML
    private TextField timeoutTextField;

    @FXML
    private TextField commandTextField;

    private CommandModel commandModel;

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

    public void update() {
        commandModel.setName(nameTextField.getText());
        commandModel.setHost(hostTextField.getText());
        commandModel.setUser(userTextField.getText());
        commandModel.setPassword(passwordField.getText());
        commandModel.setPort(Integer.valueOf(portTextField.getText()));
        commandModel.setTimeout(Integer.valueOf(timeoutTextField.getText()));
        commandModel.setCommand(commandTextField.getText());

        commandModel.update();
    }

    public void setCommandModel(CommandModel commandModel) {
        this.commandModel = commandModel;
    }

}
