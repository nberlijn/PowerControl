package nl.nberlijn.powercontrol.app.data.models;

import nl.nberlijn.powercontrol.kernel.models.JAXBModel;
import nl.nberlijn.powercontrol.app.data.objects.Commands;

public class CommandsModel extends JAXBModel<Commands> {

    public CommandsModel() {
        super(Commands.class);
    }

    public Commands getCommands() {
        return getObject();
    }

    public void updateCommands(Commands commands) {
        setObject(commands);
    }

}
