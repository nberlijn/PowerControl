package nl.nberlijn.powercontrol.ssh;

import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;

public class SSHClient implements SSH {

    private final String host;
    private final String user;
    private final String password;
    private final Integer port;
    private final Integer timeout;
    private final String command;

    private final JSch jSch;
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
