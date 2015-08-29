package nl.nberlijn.powercontrol.persistence.models;

import nl.nberlijn.powercontrol.core.persistence.models.XMLModel;

import javax.xml.bind.annotation.*;

/**
 * Class representing a Command.
 *
 * @author Nils Berlijn
 * @version 1.0
 * @since 1.0
 */
@XmlRootElement(name = "command")
@XmlType(propOrder = {
        "host",
        "user",
        "timeout",
        "command"
})
public class Command extends XMLModel {

    /**
     * The host.
     */
    @XmlElement(name = "host")
    private Host host;

    /**
     * The user.
     */
    @XmlElement(name = "user")
    private User user;

    /**
     * The timeout.
     */
    @XmlElement(name = "timeout")
    private Integer timeout;

    /**
     * The command.
     */
    @XmlElement(name = "command")
    private String command;

    /**
     * Gets the host.
     *
     * @return The host
     */
    public Host getHost() {
        return host;
    }

    /**
     * Sets the host.
     *
     * @param host The host
     */
    public void setHost(Host host) {
        this.host = host;
    }

    /**
     * Gets the user.
     *
     * @return The user
     */
    public User getUser() {
        return user;
    }

    /**
     * Sets the user.
     *
     * @param user The user
     */
    public void setUser(User user) {
        this.user = user;
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
     * Gets the command.
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

    /**
     * Returns a representation of the Command.
     *
     * @return The command
     */
    @Override
    public String toString() {
        return host.toString() + user.toString() + " " + timeout + " " + command;
    }

}
