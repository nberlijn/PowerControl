package nl.nberlijn.powercontrol.controllers.main;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import nl.nberlijn.powercontrol.config.Status;
import nl.nberlijn.powercontrol.models.DeviceModel;

import java.net.Socket;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class StatusController implements Initializable {

    @FXML
    private Circle statusCircle;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Executors.newSingleThreadScheduledExecutor().scheduleAtFixedRate(() -> {
            DeviceModel deviceModel = new DeviceModel();

            try (Socket socket = new Socket(deviceModel.getHost(), deviceModel.getPort())) {
                statusCircle.setFill(Color.GREEN);
                socket.close();
            } catch (Exception e) {
                statusCircle.setFill(Color.RED);
            }
        }, Status.DELAY, Status.PERIOD, TimeUnit.SECONDS);
    }

}
