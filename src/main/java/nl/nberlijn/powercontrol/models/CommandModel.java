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

    public CommandModel(String select) {
        super(Properties.COMMANDS_DIR_PATH + select + Properties.PROPERTIES_EXTENSION);

        name = getProperty("name");
        host = getProperty("host");
        user = getProperty("user");
        password = getProperty("password");
        port = Integer.valueOf(getProperty("port"));
        timeout = Integer.valueOf(getProperty("timeout"));
        command = getProperty("command");
    }

    public void update() {
        setProperty("name", name);
        setProperty("host", host);
        setProperty("user", user);
        setProperty("password", password);
        setProperty("port", String.valueOf(port));
        setProperty("timeout", String.valueOf(timeout));
        setProperty("command", command);

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
