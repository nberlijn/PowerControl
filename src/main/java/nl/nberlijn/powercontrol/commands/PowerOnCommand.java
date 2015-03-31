package nl.nberlijn.powercontrol.commands;

public final class PowerOnCommand implements Command {

    private Device device;

    public PowerOnCommand(Device device) {
        this.device = device;
    }

    public void execute() {
        device.powerOn();
    }

}
