package nl.nberlijn.powercontrol.core;

import nl.nberlijn.powercontrol.api.persistence.seeder.Machine;
import nl.nberlijn.powercontrol.core.config.Seeders;
import nl.nberlijn.powercontrol.core.persistence.seeder.SeedingMachine;

/**
 * Class representing the Core.
 *
 * @author Nils Berlijn
 * @version 1.0
 * @since 1.0
 */
public final class Core {

    /**
     * Preload Core modules.
     */
    public static void preload() {
        Machine seedingMachine = new SeedingMachine(Seeders.SEEDS_PACKAGE, Seeders.MODELS_PACKAGE, Seeders.OUTPUT_DIR);
        seedingMachine.start();
    }

}
