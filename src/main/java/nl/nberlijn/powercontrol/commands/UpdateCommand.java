package nl.nberlijn.powercontrol.commands;

public final class UpdateCommand implements Command {

    private Device device;

    public UpdateCommand(Device device) {
        this.device = device;
    }

    public void execute() {
        device.update();
    }

}
