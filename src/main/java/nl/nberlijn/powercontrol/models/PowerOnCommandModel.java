package nl.nberlijn.powercontrol.models;

import nl.nberlijn.powercontrol.config.Config;

public final class PowerOnCommandModel extends CommandModel {

    public PowerOnCommandModel() {
        super(Config.INSTANCE.POWER_ON);
    }

}
