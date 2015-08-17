package nl.nberlijn.powercontrol.controllers.settings;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import nl.nberlijn.powercontrol.models.Device;

/**
 * Class representing a device controller.
 *
 * @author Nils Berlijn
 * @version 1.0
 * @since 1.0
 */
public class DeviceController {

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
     * The device model.
     */
    private final Device device = new Device();

    /**
     * Initializes the fields with text from the device model.
     */
    public void initializeFields() {
        nameTextField.setText(device.getName());
        hostTextField.setText(device.getHost());
        portTextField.setText(String.valueOf(device.getPort()));
    }

    /**
     * Stores the data input from the fields to the device model and finally store it.
     */
    public void store() {
        device.setName(nameTextField.getText());
        device.setHost(hostTextField.getText());
        device.setPort(Integer.valueOf(portTextField.getText()));

        device.store();
    }

}
