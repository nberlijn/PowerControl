package nl.nberlijn.powercontrol.gui;

import nl.nberlijn.powercontrol.core.Core;

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
     * Preload core modules and afterwards starts the GUI.
     */
    private static void start() {
        Core.preload();
        GUI.start();
    }

}
