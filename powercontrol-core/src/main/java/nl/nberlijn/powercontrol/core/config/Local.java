package nl.nberlijn.powercontrol.core.config;

/**
 * Class representing the local config.
 *
 * @author Nils Berlijn
 * @version 1.0
 * @since 1.0
 */
@SuppressWarnings("unused")
public final class Local {

    public static final String LOCAL_DIR = System.getProperty("user.dir");

    public static final String LOCAL_STORAGE_DIR = "storage";

    public static final String LOCAL_DIR_PATH = LOCAL_DIR + Symbols.SEPARATOR;

    public static final String LOCAL_STORAGE_DIR_PATH = LOCAL_DIR_PATH + Symbols.SEPARATOR + LOCAL_STORAGE_DIR + Symbols.SEPARATOR;

}
