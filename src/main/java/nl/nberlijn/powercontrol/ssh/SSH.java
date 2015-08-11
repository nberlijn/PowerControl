package nl.nberlijn.powercontrol.ssh;

public interface SSH {

    void connect() throws Exception;
    void disconnect();
    void execute() throws Exception;

}
