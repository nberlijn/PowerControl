package nl.nberlijn.powercontrol.models;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

abstract class Model {

    private PropertiesConfiguration propertiesConfiguration;

    Model(String fileName) {
        try {
            propertiesConfiguration = new PropertiesConfiguration(fileName);
        } catch (ConfigurationException e) {
            System.err.println(e.getMessage());
        }
    }

    void save() {
        try {
            propertiesConfiguration.save();
        } catch (ConfigurationException e) {
            System.err.println(e.getMessage());
        }
    }

    String getProperty(String key) {
        return propertiesConfiguration.getString(key);
    }

    void setProperty(String key, Object value) {
        propertiesConfiguration.setProperty(key, value);
    }

}
