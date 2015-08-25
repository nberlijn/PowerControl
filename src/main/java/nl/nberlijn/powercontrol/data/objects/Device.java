package nl.nberlijn.powercontrol.data.objects;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "device")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {
        "name",
        "host",
        "port"
})
public class Device {

    @XmlElement(name = "name")
    private String name;

    @XmlElement(name = "host")
    private String host;

    @XmlElement(name = "port")
    private Integer port;

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

    @Override
    public String toString() {
        return name + " " + host + " " + port;
    }

}
