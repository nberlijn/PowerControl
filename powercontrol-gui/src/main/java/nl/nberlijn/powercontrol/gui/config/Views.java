package nl.nberlijn.powercontrol.gui.config;

import nl.nberlijn.powercontrol.core.config.App;
import nl.nberlijn.powercontrol.utils.Extensions;
import nl.nberlijn.powercontrol.utils.Symbols;

/**
 * Class representing the views config.
 *
 * @author Nils Berlijn
 * @version 1.0
 * @since 1.0
 */
@SuppressWarnings("unused")
public class Views {

    /* Directories */

    /**
     * The views location.
     */
    public static final String VIEWS_DIR = "views";

    /**
     * The commands views location.
     */
    public static final String COMMANDS_VIEWS_DIR = "commands";

    /**
     * The settings views location.
     */
    public static final String SETTINGS_VIEWS_DIR = "settings";

    /**
     * The settings views forms location.
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
    public static final String VIEWS_EXTENSION = Extensions.FXML;

    /* Directory paths */

    /**
     * The views location path.
     */
    public static final String VIEWS_DIR_PATH = Symbols.SEPARATOR + VIEWS_DIR + Symbols.SEPARATOR;

    /**
     * The commands views location path.
     */
    public static final String COMMANDS_VIEWS_DIR_PATH = VIEWS_DIR_PATH + COMMANDS_VIEWS_DIR + Symbols.SEPARATOR;

    /**
     * The settings views location path.
     */
    public static final String SETTINGS_VIEWS_DIR_PATH = VIEWS_DIR_PATH + SETTINGS_VIEWS_DIR + Symbols.SEPARATOR;

    /**
     * The settings views forms location path.
     */
    public static final String SETTINGS_VIEWS_FORMS_DIR_PATH = SETTINGS_VIEWS_DIR_PATH + SETTINGS_VIEWS_FORMS_DIR + Symbols.SEPARATOR;

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

    /* Commands */

    /**
     * The commands title.
     */
    public static final String COMMANDS_VIEW_TITLE = App.NAME;

    /**
     * The commands width.
     */
    public static final Integer COMMANDS_VIEW_WIDTH = 400;

    /**
     * The commands height.
     */
    public static final Integer COMMANDS_VIEW_HEIGHT = 125;

    /* Settings */

    /**
     * The settings title.
     */
    public static final String SETTINGS_VIEW_TITLE = "Settings";

    /**
     * The settings width.
     */
    public static final Integer SETTINGS_VIEW_WIDTH = 350;

    /**
     * The settings height.
     */
    public static final Integer SETTINGS_VIEWS_HEIGHT = 475;

}
