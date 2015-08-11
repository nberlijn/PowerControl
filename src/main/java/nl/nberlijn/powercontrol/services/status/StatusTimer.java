package nl.nberlijn.powercontrol.services.status;

import javafx.scene.shape.Circle;
import nl.nberlijn.powercontrol.config.Status;

import java.util.Timer;

public class StatusTimer extends Timer {

    public StatusTimer(Circle statusCircle) {
        schedule(new StatusTask(statusCircle), Status.DELAY, Status.PERIOD);
    }

}
