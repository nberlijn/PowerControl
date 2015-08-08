package nl.nberlijn.powercontrol.controllers;

import javafx.fxml.FXML;
import nl.nberlijn.powercontrol.commands.*;

public final class CommandsController extends Controller {

    Device device = new Device();

    private Command powerOn;
    private Command powerOff;
    private Command update;
    private Command clean;

    private Invoker switcher;

    public CommandsController() {
        device = new Device();
        powerOn = new PowerOnCommand(device);
        powerOff = new PowerOffCommand(device);
        update = new UpdateCommand(device);
        clean = new CleanCommand(device);
        switcher = new Invoker();
    }

    @FXML
    public void powerOn() {
        switcher.execute(powerOn);
    }

    @FXML
    public void powerOff() {
        switcher.execute(powerOff);
    }

    @FXML
    public void update() {
        switcher.execute(update);
    }

    @FXML
    public void clean() {
        switcher.execute(clean);
    }

}
