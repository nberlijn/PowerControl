package nl.nberlijn.powercontrol.ssh;

import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;

public class SSHClient implements SSH {

    private String host;
    private String user;
    private String password;
    private Integer port;
    private Integer timeout;
    private String command;

    private JSch jSch;
    private Session session;

    public SSHClient(String host, String user, String password, Integer port, Integer timeout, String command) {
        this.host = host;
        this.user = user;
        this.password = password;
        this.port = port;
        this.timeout = timeout;
        this.command = command;

        jSch = new JSch();
    }

    public void connect() throws Exception {
        session = jSch.getSession(user, host, port);
        session.setConfig("StrictHostKeyChecking", "no");
        session.setPassword(password);
        session.connect(timeout);
    }

    public void disconnect() {
        session.disconnect();
    }

    public void execute() throws Exception {
            ChannelExec channelExec = (ChannelExec) session.openChannel("exec");
            channelExec.setErrStream(System.err);
            channelExec.setCommand(command);
            channelExec.connect();
            channelExec.disconnect();
    }

}
