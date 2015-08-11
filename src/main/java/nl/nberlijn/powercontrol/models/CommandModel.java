package nl.nberlijn.powercontrol.models;

import nl.nberlijn.powercontrol.config.Properties;

public class CommandModel extends Model {

    private String name;
    private String host;
    private String user;
    private String password;
    private Integer port;
    private Integer timeout;
    private String command;

    public CommandModel() {
        super(Properties.INSTANCE.COMMANDS);
    }

    public CommandModel(String select) {
        super(Properties.INSTANCE.COMMANDS);

        select(select);
    }

    public void select(String select) {
        setSelected(select);

        name = (String) getProperty(getSelected() + ".name");
        host = (String) getProperty(getSelected() + ".host");
        user = (String) getProperty(getSelected() + ".user");
        password = (String) getProperty(getSelected() + ".password");
        port = Integer.valueOf((String) getProperty(getSelected() + ".port"));
        timeout = Integer.valueOf((String) getProperty(getSelected() + ".timeout"));
        command = (String) getProperty(getSelected() + ".command");
    }

    public void update() {
        setProperty(getSelected() + ".name", name);
        setProperty(getSelected() + ".host", host);
        setProperty(getSelected() + ".user", user);
        setProperty(getSelected() + ".password", password);
        setProperty(getSelected() + ".port", port);
        setProperty(getSelected() + ".timeout", timeout);
        setProperty(getSelected() + ".command", command);

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

}
