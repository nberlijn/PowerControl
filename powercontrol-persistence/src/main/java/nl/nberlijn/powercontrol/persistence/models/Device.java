package nl.nberlijn.powercontrol.persistence.models;

import nl.nberlijn.powercontrol.api.persistence.models.Model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
@XmlAccessorType(XmlAccessType.FIELD)
public class Device implements Model {

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
