package nl.nberlijn.powercontrol.kernel;

import nl.nberlijn.powercontrol.kernel.config.Seeders;
import nl.nberlijn.powercontrol.kernel.seeder.SeedingMachine;

/**
 * Class representing the Kernel.
 *
 * @author Nils Berlijn
 * @version 1.0
 * @since 1.0
 */
public final class Kernel {

    /**
     * Preload Kernel modules.
     */
    public static void preload() {
        new SeedingMachine().seed(Seeders.SEEDS_PACKAGE, Seeders.SEEDS_DIR_PATH);
    }

}
