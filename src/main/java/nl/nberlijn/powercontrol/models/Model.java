package nl.nberlijn.powercontrol.models;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

/**
 * Class representing a model.
 *
 * @author Nils Berlijn
 * @version 1.0
 * @since 1.0
 */
abstract class Model {

    /**
     * The properties configuration.
     */
    private PropertiesConfiguration propertiesConfiguration;

    /**
     * A model constructor.
     * Initializes the data from the selected file into this model.
     *
     * @param fileName The file name to select the data from
     */
    Model(String fileName) {
        try {
            propertiesConfiguration = new PropertiesConfiguration(fileName);
        } catch (ConfigurationException e) {
            System.err.println(e.getMessage());
        }
    }

    /**
     * Saves the data.
     */
    void save() {
        try {
            propertiesConfiguration.save();
        } catch (ConfigurationException e) {
            System.err.println(e.getMessage());
        }
    }

    /**
     * Gets a value.
     *
     * @param key The key
     * @return The value
     */
    String getValue(String key) {
        return propertiesConfiguration.getString(key);
    }

    /**
     * Sets a value.
     *
     * @param key   The key
     * @param value The value
     */
    void setValue(String key, Object value) {
        propertiesConfiguration.setProperty(key, value);
    }

}
