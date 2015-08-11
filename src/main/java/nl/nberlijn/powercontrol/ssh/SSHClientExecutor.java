package nl.nberlijn.powercontrol.ssh;

import nl.nberlijn.powercontrol.models.CommandModel;

public final class SSHClientExecutor extends SSHClient {

    public SSHClientExecutor(CommandModel commandModel) {
        super(commandModel.getHost(), commandModel.getUser(), commandModel.getPassword(), commandModel.getPort(), commandModel.getTimeout(), commandModel.getCommand());
    }

    @Override
    public void execute() throws Exception {
        connect();

        super.execute();

        disconnect();
    }

}
