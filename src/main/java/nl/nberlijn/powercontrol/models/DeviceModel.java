package nl.nberlijn.powercontrol.models;

import nl.nberlijn.powercontrol.config.Properties;

/**
 * Class representing a device model.
 *
 * @author Nils Berlijn
 * @version 1.0
 * @since 1.0
 */
public class DeviceModel extends Model {

    /**
     * The name.
     */
    private String name;

    /**
     * The host.
     */
    private String host;

    /**
     * The port.
     */
    private Integer port;

    /**
     * The device model constructor.
     * Initializes the device into this model.
     */
    public DeviceModel() {
        super(Properties.DEVICE_FILE_PATH);

        name = getValue("name");
        host = getValue("host");
        port = Integer.valueOf(getValue("port"));
    }

    /**
     * Stores the data from this model.
     */
    public void store() {
        setValue("name", name);
        setValue("host", host);
        setValue("port", String.valueOf(port));

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

}
