package nl.nberlijn.powercontrol.gui.controllers.commands;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

import nl.nberlijn.powercontrol.api.persistence.repository.Repository;
import nl.nberlijn.powercontrol.gui.config.Status;
import nl.nberlijn.powercontrol.persistence.models.Device;
import nl.nberlijn.powercontrol.persistence.repository.DeviceRepository;

import java.net.Socket;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Class representing the status controller.
 *
 * @author Nils Berlijn
 * @version 1.0
 * @since 1.0
 */
@SuppressWarnings("unused")
public class StatusController implements Initializable {

    /**
     * The device model.
     */
    private final Repository<Device> deviceRepository = new DeviceRepository();
    /**
     * The status circle.
     */
    @FXML
    private Circle statusCircle;

    /**
     * Initializes the status controller.
     * Makes a new thread for checking the status based on a scheduled period of time.
     *
     * @param url            The url
     * @param resourceBundle The resource bundle
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Executors.newSingleThreadScheduledExecutor().scheduleAtFixedRate(() -> {
            Device device = deviceRepository.get();

            try (Socket socket = new Socket(device.getHost(), device.getPort())) {
                statusCircle.setFill(Color.GREEN);
                socket.close();
            } catch (Exception e) {
                statusCircle.setFill(Color.RED);
            }
        }, Status.DELAY, Status.PERIOD, TimeUnit.SECONDS);
    }

}
