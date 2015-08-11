package nl.nberlijn.powercontrol.services.status;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

import java.net.Socket;
import java.util.TimerTask;

public class StatusTask extends TimerTask {

    private Circle statusCircle;

    public StatusTask(Circle statusCircle) {
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
        try (Socket socket = new Socket("nberlijn.nl", 80)) {
            socket.close();
        } catch (Exception e) {
            return false;
        }

        return true;
    }

}
