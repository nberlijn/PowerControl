package nl.nberlijn.powercontrol.config;

/**
 * Class representing the properties config.
 *
 * @author Nils Berlijn
 * @version 1.0
 * @since 1.0
 */
@SuppressWarnings("WeakerAccess")
public final class Properties {

    /* Directories */

    /**
     * The properties directory.
     */
    public static final String PROPERTIES_DIR = "properties";

    /* Files */

    /**
     * The device file.
     */
    public static final String DEVICE_FILE = "device";

    /**
     * The commands file.
     */
    public static final String COMMANDS_FILE = "commands";

    /* Extensions */

    /**
     * The properties extension.
     */
    public static final String PROPERTIES_EXTENSION = ".properties";

    /* Directory paths */

    /**
     * The properties directory path.
     */
    public static final String PROPERTIES_DIR_PATH = PROPERTIES_DIR + "/";

    /* File paths */

    /**
     * The device file path.
     */
    public static final String DEVICE_FILE_PATH = PROPERTIES_DIR_PATH + DEVICE_FILE + PROPERTIES_EXTENSION;

    /**
     * The commands file path.
     */
    public static final String COMMANDS_FILE_PATH = PROPERTIES_DIR_PATH + COMMANDS_FILE + PROPERTIES_EXTENSION;

}
