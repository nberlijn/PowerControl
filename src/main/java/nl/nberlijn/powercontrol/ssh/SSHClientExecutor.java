package nl.nberlijn.powercontrol.ssh;

import nl.nberlijn.powercontrol.models.Command;

public final class SSHClientExecutor extends SSHClient {

    public SSHClientExecutor(Command command) {
        super(command.getHost(), command.getUser(), command.getPassword(), command.getPort(), command.getTimeout(), command.getCommand());
    }

    @Override
    public void execute() throws Exception {
        connect();

        super.execute();

        disconnect();
    }

}
