package nl.nberlijn.powercontrol.persistence.models;

import nl.nberlijn.powercontrol.core.persistence.models.XMLModel;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Class representing a Device.
 *
 * @author Nils Berlijn
 * @version 1.0
 * @since 1.0
 */
@XmlRootElement(name = "device")
public class Device extends XMLModel {

    @XmlElement(name = "host")
    private Host host;

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
     * Returns a representation of the Device.
     *
     * @return The Device
     */
    @Override
    public String toString() {
        return host.toString();
    }

}
