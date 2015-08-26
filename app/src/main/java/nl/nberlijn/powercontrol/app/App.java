package nl.nberlijn.powercontrol.app;

import nl.nberlijn.powercontrol.app.gui.GUI;
import nl.nberlijn.powercontrol.kernel.Kernel;

/**
 * Class representing the App.
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
     * Preload Kernel modules and afterwards starts the GUI.
     */
    private static void start() {
        Kernel.preload();
        GUI.start();
    }

}
