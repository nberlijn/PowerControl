package nl.nberlijn.powercontrol.config;

/**
 * Class representing the views config.
 *
 * @author Nils Berlijn
 * @version 1.0
 * @since 1.0
 */
@SuppressWarnings("WeakerAccess")
public class Views {

    /* Directories */

    /**
     * The views directory.
     */
    public static final String VIEWS_DIR = "views";

    /**
     * The commands views directory.
     */
    public static final String COMMANDS_VIEWS_DIR = "commands";

    /**
     * The settings views directory.
     */
    public static final String SETTINGS_VIEWS_DIR = "settings";

    /**
     * The settings views forms directory.
     */
    public static final String SETTINGS_VIEWS_FORMS_DIR = "forms";

    /* Files */

    /**
     * The commands file.
     */
    public static final String COMMANDS_FILE = "commands";

    /**
     * The settings file.
     */
    public static final String SETTINGS_FILE = "settings";

    /**
     * The device form file.
     */
    public static final String DEVICE_FORM_FILE = "device_form";

    /**
     * The command form file.
     */
    public static final String COMMAND_FORM_FILE = "commands_form";

    /* Extensions */

    /**
     * The views extension.
     */
    public static final String VIEWS_EXTENSION = ".fxml";

    /* Directory paths */

    /**
     * The views directory path.
     */
    public static final String VIEWS_DIR_PATH = "/" + VIEWS_DIR + "/";

    /**
     * The commands views directory path.
     */
    public static final String COMMANDS_VIEWS_DIR_PATH = VIEWS_DIR_PATH + COMMANDS_VIEWS_DIR + "/";

    /**
     * The settings views directory path.
     */
    public static final String SETTINGS_VIEWS_DIR_PATH = VIEWS_DIR_PATH + SETTINGS_VIEWS_DIR + "/";

    /**
     * The settings views forms directory path.
     */
    public static final String SETTINGS_VIEWS_FORMS_DIR_PATH = SETTINGS_VIEWS_DIR_PATH + SETTINGS_VIEWS_FORMS_DIR + "/";

    /* File paths */

    /**
     * The commands view file path.
     */
    public static final String COMMANDS_VIEW_FILE_PATH = COMMANDS_VIEWS_DIR_PATH + COMMANDS_FILE + VIEWS_EXTENSION;

    /**
     * The settings view file path.
     */
    public static final String SETTINGS_VIEW_FILE_PATH = SETTINGS_VIEWS_DIR_PATH + SETTINGS_FILE + VIEWS_EXTENSION;

    /**
     * The device form file path.
     */
    public static final String DEVICE_FORM_FILE_PATH = SETTINGS_VIEWS_FORMS_DIR_PATH + DEVICE_FORM_FILE + VIEWS_EXTENSION;

    /**
     * The command form file path.
     */
    public static final String COMMAND_FORM_FILE_PATH = SETTINGS_VIEWS_FORMS_DIR_PATH + COMMAND_FORM_FILE + VIEWS_EXTENSION;

}
