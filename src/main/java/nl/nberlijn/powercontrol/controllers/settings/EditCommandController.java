package nl.nberlijn.powercontrol.controllers.settings;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import nl.nberlijn.powercontrol.models.CommandModel;

public class EditCommandController {

    @FXML
    private TextField nameTextField;

    @FXML
    private TextField hostTextField;

    @FXML
    private TextField userTextField;

    @FXML
    private TextField passwordTextField;

    @FXML
    private TextField portTextField;

    @FXML
    private TextField timeoutTextField;

    @FXML
    private TextField commandTextField;

    private CommandModel commandModel;

    public void initialize(String command) {
        commandModel = new CommandModel(command);

        nameTextField.setText(commandModel.getName());
        hostTextField.setText(commandModel.getHost());
        userTextField.setText(commandModel.getUser());
        passwordTextField.setText(commandModel.getPassword());
        portTextField.setText(String.valueOf(commandModel.getPort()));
        timeoutTextField.setText(String.valueOf(commandModel.getTimeout()));
        commandTextField.setText(commandModel.getCommand());

        /*
        buttonsController.getOkButton().setOnAction(e -> {
            update();
            Stage stage = (Stage) buttonsController.getOkButton().getScene().getWindow();
            stage.close();
        });

        buttonsController.getCancelButton().setOnAction(e -> {
            Stage stage = (Stage) buttonsController.getCancelButton().getScene().getWindow();
            stage.close();
        });

        buttonsController.getApplyButton().setOnAction(e -> update());
        */
    }

    public void update() {
        commandModel.setName(nameTextField.getText());
        commandModel.setHost(hostTextField.getText());
        commandModel.setUser(userTextField.getText());
        commandModel.setPassword(passwordTextField.getText());
        commandModel.setPort(Integer.valueOf(portTextField.getText()));
        commandModel.setTimeout(Integer.valueOf(timeoutTextField.getText()));
        commandModel.setCommand(commandTextField.getText());
        commandModel.update();
    }

}
