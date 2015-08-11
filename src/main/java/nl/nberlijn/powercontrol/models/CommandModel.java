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
    private String selected;

    public CommandModel() {
        super(Properties.COMMANDS_FILE);
    }

    public CommandModel(String select) {
        super(Properties.COMMANDS_FILE);

        select(select);
    }

    public void select(String select) {
        selected = select;

        name = (String) getProperty(selected + ".name");
        host = (String) getProperty(selected + ".host");
        user = (String) getProperty(selected + ".user");
        password = (String) getProperty(selected + ".password");
        port = Integer.valueOf((String) getProperty(selected+ ".port"));
        timeout = Integer.valueOf((String) getProperty(selected + ".timeout"));
        command = (String) getProperty(selected + ".command");
    }

    public void update() {
        setProperty(selected + ".name", name);
        setProperty(selected + ".host", host);
        setProperty(selected + ".user", user);
        setProperty(selected + ".password", password);
        setProperty(selected + ".port", port);
        setProperty(selected + ".timeout", timeout);
        setProperty(selected + ".command", command);

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
