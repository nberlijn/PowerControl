package nl.nberlijn.powercontrol.ssh;

interface SSH {

    void connect() throws Exception;
    void disconnect();
    void execute() throws Exception;

}
