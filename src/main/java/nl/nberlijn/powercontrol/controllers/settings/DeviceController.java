package nl.nberlijn.powercontrol.controllers.settings;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import nl.nberlijn.powercontrol.models.DeviceModel;

/**
 * Class representing a device controller.
 *
 * @author Nils Berlijn
 * @version 1.0
 * @since 1.0
 */
public class DeviceController {

    /**
     * The device model.
     */
    private final DeviceModel deviceModel = new DeviceModel();
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
     * The port text field.
     */
    @FXML
    private TextField portTextField;

    /**
     * Initializes the fields with text from the device model.
     */
    public void initializeFields() {
        nameTextField.setText(deviceModel.getName());
        hostTextField.setText(deviceModel.getHost());
        portTextField.setText(String.valueOf(deviceModel.getPort()));
    }

    /**
     * Stores the data input from the fields to the device model and finally store it.
     */
    public void store() {
        deviceModel.setName(nameTextField.getText());
        deviceModel.setHost(hostTextField.getText());
        deviceModel.setPort(Integer.valueOf(portTextField.getText()));

        deviceModel.store();
    }

}
