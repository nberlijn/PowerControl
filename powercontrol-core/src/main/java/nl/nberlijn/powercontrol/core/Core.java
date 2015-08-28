package nl.nberlijn.powercontrol.core;

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
        new SeedingMachine().seed(Seeders.SEEDS_PACKAGE, Seeders.SEEDS_DIR_PATH);
    }

}
