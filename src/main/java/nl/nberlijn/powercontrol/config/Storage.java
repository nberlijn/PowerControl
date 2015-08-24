package nl.nberlijn.powercontrol.config;

import java.io.File;

/**
 * Class representing the storage config.
 *
 * @author Nils Berlijn
 * @version 1.0
 * @since 1.0
 */
public final class Storage {

    public static final String LOCAL_STORAGE_DIR = System.getProperty("user.dir") + File.separator + "storage" + File.separator;
    public static final String STORAGE_EXTENSION = ".xml";

}
