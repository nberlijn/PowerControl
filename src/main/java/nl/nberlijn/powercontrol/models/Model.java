package nl.nberlijn.powercontrol.models;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

public abstract class Model {

    private PropertiesConfiguration propertiesConfiguration;

    public Model(String fileName) {
        try {
            propertiesConfiguration = new PropertiesConfiguration(fileName);
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

    protected String getProperty(String key) {
        return propertiesConfiguration.getString(key);
    }

    protected void setProperty(String key, Object value) {
        propertiesConfiguration.setProperty(key, value);
    }

}
