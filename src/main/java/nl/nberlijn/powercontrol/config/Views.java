package nl.nberlijn.powercontrol.config;

public class Views {

    public static final String COMMANDS_FILE = "commands";
    public static final String SETTINGS_FILE = "settings";
    public static final String DEVICE_FORM_FILE = "device_form";
    public static final String COMMAND_FORM_FILE = "commands_form";

    public static final String COMMANDS_VIEWS_DIR = "commands";
    public static final String SETTINGS_VIEWS_DIR = "settings";
    public static final String SETTINGS_VIEWS_FORMS_DIR = "forms";

    public static final String VIEWS_DIR = "views";
    public static final String VIEWS_EXTENSION = ".fxml";

    public static final String VIEWS_DIR_PATH = "/" + VIEWS_DIR + "/";
    public static final String COMMANDS_VIEWS_DIR_PATH = VIEWS_DIR_PATH + COMMANDS_VIEWS_DIR + "/";
    public static final String SETTINGS_VIEWS_DIR_PATH = VIEWS_DIR_PATH + SETTINGS_VIEWS_DIR + "/";
    public static final String SETTINGS_VIEWS_FORMS_DIR_PATH = SETTINGS_VIEWS_DIR_PATH + SETTINGS_VIEWS_FORMS_DIR + "/";

    public static final String COMMANDS_VIEW_FILE_PATH = COMMANDS_VIEWS_DIR_PATH + COMMANDS_FILE + VIEWS_EXTENSION;
    public static final String SETTINGS_VIEW_FILE_PATH = SETTINGS_VIEWS_DIR_PATH + SETTINGS_FILE + VIEWS_EXTENSION;
    public static final String DEVICE_FORM_FILE_PATH = SETTINGS_VIEWS_FORMS_DIR_PATH + DEVICE_FORM_FILE + VIEWS_EXTENSION;
    public static final String COMMAND_FORM_FILE_PATH = SETTINGS_VIEWS_FORMS_DIR_PATH + COMMAND_FORM_FILE + VIEWS_EXTENSION;

}
