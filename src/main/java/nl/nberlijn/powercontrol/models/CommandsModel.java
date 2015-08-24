package nl.nberlijn.powercontrol.models;

import nl.nberlijn.powercontrol.kernel.model.Model;
import nl.nberlijn.powercontrol.objects.Commands;

public class CommandsModel extends Model<Commands> {

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
