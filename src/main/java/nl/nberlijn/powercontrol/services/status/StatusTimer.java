package nl.nberlijn.powercontrol.services.status;

import javafx.scene.shape.Circle;

import java.util.Timer;

public class StatusTimer extends Timer {

    public StatusTimer(Circle statusCircle) {
        schedule(new StatusTask(statusCircle), 0, 10000);
    }

}
