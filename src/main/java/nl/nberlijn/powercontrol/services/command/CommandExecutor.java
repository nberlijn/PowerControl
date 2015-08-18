package nl.nberlijn.powercontrol.services.command;

import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;

import nl.nberlijn.powercontrol.models.Command;

/**
 * Class representing a command executor.
 *
 * @author Nils Berlijn
 * @version 1.0
 * @since 1.0
 */
class CommandExecutor extends JSch {

    /**
     * The command model.
     */
    private final Command command;

    /**
     * A command executor constructor.
     * Initializes the command model.
     *
     * @param command The command model
     */
    public CommandExecutor(Command command) {
        this.command = command;
    }

    /**
     * Executes a command over SSH.
     *
     * @return If the executing has been succeeded
     */
    public Boolean execute() {
        try {
            Session session = getSession(command.getUser(), command.getHost(), command.getPort());
            session.setConfig("StrictHostKeyChecking", "no");
            session.setPassword(command.getPassword());
            session.connect(command.getTimeout());

            ChannelExec channelExec = (ChannelExec) session.openChannel("exec");
            channelExec.setErrStream(System.err);
            channelExec.setCommand(command.getCommand());
            channelExec.connect();
            channelExec.disconnect();

            session.disconnect();

            return true;
        } catch (JSchException e) {
            return false;
        }
    }

}
