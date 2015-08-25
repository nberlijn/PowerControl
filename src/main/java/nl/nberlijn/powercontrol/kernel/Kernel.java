package nl.nberlijn.powercontrol.kernel;

import nl.nberlijn.powercontrol.kernel.seeder.SeedingMachine;

import static nl.nberlijn.powercontrol.kernel.config.Seeders.*;

/**
 * Class representing the kernel.
 *
 * @author Nils Berlijn
 * @version 1.0
 * @since 1.0
 */
public final class Kernel {

    /**
     * Starts the kernel.
     */
    public static void start() {
        new SeedingMachine().seed(SEEDS_PACKAGE, SEEDS_DIR_PATH);
    }

}
