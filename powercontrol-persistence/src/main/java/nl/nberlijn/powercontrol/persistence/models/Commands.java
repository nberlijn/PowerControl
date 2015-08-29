package nl.nberlijn.powercontrol.persistence.models;

import nl.nberlijn.powercontrol.core.persistence.models.XMLModel;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Class representing the Commands.
 *
 * @author Nils Berlijn
 * @version 1.0
 * @since 1.0
 */
@XmlRootElement(name = "commands")
public class Commands extends XMLModel {

    /**
     * The commands.
     */
    @XmlElement(name = "command")
    private List<Command> commands;

    /**
     * Gets the commands.
     *
     * @return The commands
     */
    public List<Command> getCommands() {
        return commands;
    }

    /**
     * Sets the commands.
     *
     * @param commands The commands
     */
    public void setCommands(List<Command> commands) {
        this.commands = commands;
    }

    /**
     * Returns a representation of the Commands.
     *
     * @return The commands
     */
    @Override
    public String toString() {
        return commands.toString();
    }

}
