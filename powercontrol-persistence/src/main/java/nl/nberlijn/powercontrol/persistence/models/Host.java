package nl.nberlijn.powercontrol.persistence.models;

import nl.nberlijn.powercontrol.api.persistence.models.Model;

import javax.xml.bind.annotation.*;

/**
 * Class representing a Host.
 *
 * @author Nils Berlijn
 * @version 1.0
 * @since 1.0
 */
@XmlRootElement(name = "host")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {
        "name",
        "host",
        "port"
})
public class Host implements Model {

    /**
     * The name.
     */
    @XmlElement(name = "name")
    private String name;

    /**
     * The host.
     */
    @XmlElement(name = "host")
    private String host;

    /**
     * The port.
     */
    @XmlElement(name = "port")
    private Integer port;

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
     * Returns a representation of the Host.
     *
     * @return The host
     */
    @Override
    public String toString() {
        return name + " " + host + " " + port;
    }

}
