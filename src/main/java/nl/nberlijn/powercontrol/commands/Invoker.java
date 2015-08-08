package nl.nberlijn.powercontrol.commands;

public final class Invoker {

    public void execute(Command command) {
        command.execute();
    }

}
