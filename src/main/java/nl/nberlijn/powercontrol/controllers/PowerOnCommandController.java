package nl.nberlijn.powercontrol.controllers;

import nl.nberlijn.powercontrol.models.CommandModel;
import nl.nberlijn.powercontrol.views.CommandView;

public class PowerOnCommandController extends CommandController {

    public PowerOnCommandController(CommandModel commandModel, CommandView commandView) {
        super(commandModel, commandView);
    }

}
