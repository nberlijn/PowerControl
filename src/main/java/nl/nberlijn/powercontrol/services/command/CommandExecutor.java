package nl.nberlijn.powercontrol.services.command;

import nl.nberlijn.powercontrol.data.objects.Command;
import nl.nberlijn.powercontrol.kernel.tools.SSH;

/**
 * Class representing a command executor.
 *
 * @author Nils Berlijn
 * @version 1.0
 * @since 1.0
 */
class CommandExecutor {

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
        return SSH.execute(command.getUser(), command.getHost(), command.getPort(), command.getPassword(), command.getTimeout(), command.getCommand());
    }

}
