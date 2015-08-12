package nl.nberlijn.powercontrol.controllers.settings;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import nl.nberlijn.powercontrol.models.DeviceModel;

import java.net.URL;
import java.util.ResourceBundle;

public class EditDeviceController implements Initializable {

    @FXML
    private TextField nameTextField;

    @FXML
    private TextField hostTextField;

    @FXML
    private TextField portTextField;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        DeviceModel deviceModel = new DeviceModel();

        nameTextField.setText(deviceModel.getName());
        hostTextField.setText(deviceModel.getHost());
        portTextField.setText(String.valueOf(deviceModel.getPort()));
    }

}
