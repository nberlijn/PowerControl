package nl.nberlijn.powercontrol.utils;

import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;

public final class SSH {

    public static Boolean execute(String user, String host, Integer port, String password, Integer timeout, String command) {
        try {
            JSch jSch = new JSch();

            Session session = jSch.getSession(user, host, port);
            session.setConfig("StrictHostKeyChecking", "no");
            session.setPassword(password);
            session.connect(timeout);

            ChannelExec channelExec = (ChannelExec) session.openChannel("exec");
            channelExec.setErrStream(System.err);
            channelExec.setCommand(command);
            channelExec.connect();
            channelExec.disconnect();

            session.disconnect();

            return true;
        } catch (JSchException e) {
            return false;
        }
    }

}
