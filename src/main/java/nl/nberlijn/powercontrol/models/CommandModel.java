package nl.nberlijn.powercontrol.models;

public abstract class CommandModel extends Model {

    private String name;
    private String host;
    private String user;
    private String password;
    private Integer port;
    private Integer timeout;
    private String command;

    public CommandModel(String config) {
        super(config);

        name = (String) getProperty("name");
        host = (String) getProperty("host");
        user = (String) getProperty("user");
        password = (String) getProperty("password");
        port = Integer.valueOf((String) getProperty("port"));
        timeout = Integer.valueOf((String) getProperty("timeout"));
        command = (String) getProperty("command");
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

    @Override
    public void save() {
        setProperty("name", name);
        setProperty("host", host);
        setProperty("user", user);
        setProperty("password", password);
        setProperty("port", port);
        setProperty("timeout", timeout);
        setProperty("command", command);

        super.save();
    }

}
