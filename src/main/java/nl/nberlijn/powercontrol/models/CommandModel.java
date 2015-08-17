package nl.nberlijn.powercontrol.models;

import nl.nberlijn.powercontrol.config.Properties;

/**
 * Class representing a command model.
 *
 * @author Nils Berlijn
 * @version 1.0
 * @since 1.0
 */
public class CommandModel extends Model {

    /**
     * The name.
     */
    private String name;

    /**
     * The host.
     */
    private String host;

    /**
     * The user.
     */
    private String user;

    /**
     * The password.
     */
    private String password;

    /**
     * The port.
     */
    private Integer port;

    /**
     * The timeout.
     */
    private Integer timeout;

    /**
     * The command.
     */
    private String command;

    /**
     * The command model constructor.
     * Initializes the selected command into this model.
     *
     * @param select The command to select
     */
    public CommandModel(String select) {
        super(Properties.COMMANDS_DIR_PATH + select.replace(" ", "_").toLowerCase() + Properties.PROPERTIES_EXTENSION);

        name = getValue("name");
        host = getValue("host");
        user = getValue("user");
        password = getValue("password");
        port = Integer.valueOf(getValue("port"));
        timeout = Integer.valueOf(getValue("timeout"));
        command = getValue("command");
    }

    /**
     * Stores the data from this model.
     */
    public void store() {
        setValue("name", name);
        setValue("host", host);
        setValue("user", user);
        setValue("password", password);
        setValue("port", String.valueOf(port));
        setValue("timeout", String.valueOf(timeout));
        setValue("command", command);

        save();
    }

    /**
     * Gets the name.
     *
     * @return The name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name.
     *
     * @param name The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the host.
     *
     * @return The host
     */
    public String getHost() {
        return host;
    }

    /**
     * Sets the host.
     *
     * @param host The host
     */
    public void setHost(String host) {
        this.host = host;
    }

    /**
     * Gets the user.
     *
     * @return The user
     */
    public String getUser() {
        return user;
    }

    /**
     * Sets the user.
     *
     * @param user The user
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * Gets the password.
     *
     * @return The password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the password.
     *
     * @param password The password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Gets the port.
     *
     * @return The port
     */
    public Integer getPort() {
        return port;
    }

    /**
     * Sets the port.
     *
     * @param port The port
     */
    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * Gets the timeout.
     *
     * @return The timeout
     */
    public Integer getTimeout() {
        return timeout;
    }

    /**
     * Sets the timeout.
     *
     * @param timeout The timeout
     */
    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    /**
     * Gets the commands.
     *
     * @return The command
     */
    public String getCommand() {
        return command;
    }

    /**
     * Sets the command.
     *
     * @param command The command
     */
    public void setCommand(String command) {
        this.command = command;
    }

}
