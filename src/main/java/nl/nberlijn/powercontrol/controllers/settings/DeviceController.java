package nl.nberlijn.powercontrol.controllers.settings;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

import nl.nberlijn.powercontrol.models.DeviceModel;

import java.net.URL;
import java.util.ResourceBundle;

public class DeviceController implements Initializable {

    @FXML
    private TextField nameTextField;

    @FXML
    private TextField hostTextField;

    @FXML
    private TextField portTextField;

    private final DeviceModel deviceModel = new DeviceModel();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        nameTextField.setText(deviceModel.getName());
        hostTextField.setText(deviceModel.getHost());
        portTextField.setText(String.valueOf(deviceModel.getPort()));
    }

    public void store() {
        deviceModel.setName(nameTextField.getText());
        deviceModel.setHost(hostTextField.getText());
        deviceModel.setPort(Integer.valueOf(portTextField.getText()));

        deviceModel.store();
    }

}
