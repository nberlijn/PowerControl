package nl.nberlijn.powercontrol.commands;

public final class PowerOffCommand implements Command {

    private Device device;

    public PowerOffCommand(Device device) {
        this.device = device;
    }

    public void execute() {
        device.powerOff();
    }

}
