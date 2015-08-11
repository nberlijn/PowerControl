package nl.nberlijn.powercontrol.models;

import nl.nberlijn.powercontrol.config.Properties;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

public abstract class Model {

    private PropertiesConfiguration propertiesConfiguration;

    public Model(String fileName) {
        try {
            propertiesConfiguration = new PropertiesConfiguration(Properties.DIR + fileName + Properties.EXTENSION);
        } catch (ConfigurationException e) {
            System.err.println(e.getMessage());
        }
    }

    protected void save() {
        try {
            propertiesConfiguration.save();
        } catch (ConfigurationException e) {
            System.err.println(e.getMessage());
        }
    }

    protected Object getProperty(String key) {
        return propertiesConfiguration.getProperty(key);
    }

    protected void setProperty(String key, Object value) {
        propertiesConfiguration.setProperty(key, value);
    }

}
