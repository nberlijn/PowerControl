package nl.nberlijn.powercontrol.models;

import nl.nberlijn.powercontrol.config.Properties;

public class DeviceModel extends Model {

    private String name;
    private String host;
    private Integer port;

    public DeviceModel() {
        super(Properties.DEVICE_FILE_PATH);

        name = getValue("name");
        host = getValue("host");
        port = Integer.valueOf(getValue("port"));
    }

    public void update() {
        setValue("name", name);
        setValue("host", host);
        setValue("port", String.valueOf(port));

        save();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

}
