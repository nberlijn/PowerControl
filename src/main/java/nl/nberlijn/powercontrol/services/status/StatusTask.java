package nl.nberlijn.powercontrol.services.status;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import nl.nberlijn.powercontrol.models.DeviceModel;

import java.net.Socket;
import java.util.TimerTask;

class StatusTask extends TimerTask {

    private final DeviceModel deviceModel;
    private final Circle statusCircle;

    public StatusTask(Circle statusCircle) {
        this.deviceModel = new DeviceModel();
        this.statusCircle = statusCircle;
    }

    @Override
    public void run() {
        updateStatus();
    }

    private void updateStatus() {
        if (ping()) {
            statusCircle.setFill(Color.GREEN);
        } else {
            statusCircle.setFill(Color.RED);
        }
    }

    private Boolean ping() {
        try (Socket socket = new Socket(deviceModel.getHost(), deviceModel.getPort())) {
            socket.close();
        } catch (Exception e) {
            return false;
        }

        return true;
    }

}
