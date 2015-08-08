package nl.nberlijn.powercontrol.commands;

public final class CleanCommand implements Command {

    private Device device;

    public CleanCommand(Device device) {
        this.device = device;
    }

    public void execute() {
        device.clean();
    }

}
