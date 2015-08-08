package nl.nberlijn.powercontrol.controllers;

import nl.nberlijn.powercontrol.models.CommandModel;

public final class CommandController extends Controller {

    private CommandModel commandModel;

    public CommandController(CommandModel commandModel) {
        this.commandModel = commandModel;
    }

}
