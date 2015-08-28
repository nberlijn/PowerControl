package nl.nberlijn.powercontrol.persistence.models;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "command")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {
        "name",
        "host",
        "user",
        "password",
        "port",
        "timeout",
        "command"
})
public class Command {

    @XmlElement(name = "name")
    private String name;

    @XmlElement(name = "host")
    private String host;

    @XmlElement(name = "user")
    private String user;

    @XmlElement(name = "password")
    private String password;

    @XmlElement(name = "port")
    private Integer port;

    @XmlElement(name = "timeout")
    private Integer timeout;

    @XmlElement(name = "command")
    private String command;

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

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    @Override
    public String toString() {
        return name + " " + host + " " + user + " " + password + " " + port + " " + timeout + " " + command;
    }

}
