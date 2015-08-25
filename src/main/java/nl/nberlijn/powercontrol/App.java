package nl.nberlijn.powercontrol;

import nl.nberlijn.powercontrol.gui.GUI;
import nl.nberlijn.powercontrol.kernel.Kernel;

/**
 * Class representing the app.
 *
 * @author Nils Berlijn
 * @version 1.0
 * @since 1.0
 */
final class App {

    /**
     * Starts the application.
     *
     * @param args The arguments
     */
    public static void main(String[] args) {
        start();
    }

    /**
     * Starts the kernel and afterwards the gui.
     */
    private static void start() {
        Kernel.start();
        GUI.start();
    }

}
