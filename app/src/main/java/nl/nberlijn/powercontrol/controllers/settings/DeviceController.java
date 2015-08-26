package nl.nberlijn.powercontrol.controllers.settings;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import nl.nberlijn.powercontrol.data.objects.Device;

/**
 * Class representing the device controller.
 *
 * @author Nils Berlijn
 * @version 1.0
 * @since 1.0
 */
@SuppressWarnings("unused")
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

    public Device getFields() {
        Device device = new Device();
        device.setName(nameTextField.getText());
        device.setHost(hostTextField.getText());
        device.setPort(Integer.valueOf(portTextField.getText()));

        return device;
    }

    public void setFields(Device device) {
        nameTextField.setText(device.getName());
        hostTextField.setText(device.getHost());
        portTextField.setText(String.valueOf(device.getPort()));
    }

}
