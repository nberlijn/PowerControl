package nl.nberlijn.powercontrol.config;

public final class GUI {

    public static final String VIEWS_DIR = "views";
    public static final String VIEWS_DIR_PATH = "/" + VIEWS_DIR + "/";
    public static final String VIEWS_EXTENSION = ".fxml";
    
    public static final String MAIN_TITLE = App.NAME;
    public static final Integer MAIN_WIDTH = 400;
    public static final Integer MAIN_HEIGHT = 200;
    public static final String MAIN_FILE = "main";
    public static final String MAIN_VIEWS_DIR = "main";
    public static final String MAIN_VIEWS_DIR_PATH = VIEWS_DIR_PATH + MAIN_VIEWS_DIR + "/";
    public static final String MAIN_VIEW_FILE_PATH = MAIN_VIEWS_DIR_PATH + MAIN_FILE + VIEWS_EXTENSION;

    public static final String SETTINGS_TITLE = "Settings";
    public static final Integer SETTINGS_WIDTH = 350;
    public static final Integer SETTINGS_HEIGHT = 350;
    public static final String SETTINGS_FILE = "settings";
    public static final String SETTINGS_VIEWS_DIR = "settings";
    public static final String SETTINGS_VIEWS_DIR_PATH = VIEWS_DIR_PATH + SETTINGS_VIEWS_DIR + "/";
    public static final String SETTINGS_VIEW_FILE_PATH = SETTINGS_VIEWS_DIR_PATH + SETTINGS_FILE + VIEWS_EXTENSION;

}
