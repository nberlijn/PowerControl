package nl.nberlijn.powercontrol.models;

import nl.nberlijn.powercontrol.config.Config;

public final class PowerOffCommandModel extends CommandModel {

    public PowerOffCommandModel() {
        super(Config.INSTANCE.POWER_OFF);
    }

}
