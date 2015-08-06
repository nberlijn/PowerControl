package nl.nberlijn.powercontrol.controllers;

import nl.nberlijn.powercontrol.models.CommandModel;
import nl.nberlijn.powercontrol.views.CommandView;

public class PowerOffCommandController extends CommandController {

    public PowerOffCommandController(CommandModel commandModel, CommandView commandView) {
        super(commandModel, commandView);
    }

}
