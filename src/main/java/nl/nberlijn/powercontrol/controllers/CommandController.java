package nl.nberlijn.powercontrol.controllers;

import nl.nberlijn.powercontrol.models.CommandModel;
import nl.nberlijn.powercontrol.views.CommandView;

public abstract class CommandController {

    private CommandModel commandModel;
    private CommandView commandView;

    public CommandController(CommandModel commandModel, CommandView commandView) {
        this.commandModel = commandModel;
        this.commandView = commandView;
    }

    public void updateView() {
        commandView.print(commandModel);
    }

}
