package nl.nberlijn.powercontrol;

import nl.nberlijn.powercontrol.gui.GUI;
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
        /*
        log.error("Something's wrong here");

        // Delete all files from the logs directory.
        File[] files = new File("logs").listFiles();

        for (File file: files) {
            file.delete();
        }

        // Initialize the log file.
        FileHandler fileHandler = new FileHandler("logs/log.log");
        Log.addHandler(fileHandler);

        Formatter simpleFormatter = new SimpleFormatter();
        fileHandler.setFormatter(simpleFormatter);

        LOG.info("Logger successful initialized.");
        */

       start();
    }

    /**
     * Preload Kernel modules and afterwards starts the GUI.
     */
    private static void start() {
        // LOGGER.info("Starting the application.");

        Kernel.preload();
        GUI.start();
    }

}
