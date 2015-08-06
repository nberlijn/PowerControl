package nl.nberlijn.powercontrol.models;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

public abstract class Model {

    private PropertiesConfiguration propertiesConfiguration;

    public Model(String config) {
        try {
            propertiesConfiguration = new PropertiesConfiguration(config);
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

    protected void save() {
        try {
            propertiesConfiguration.save();
        } catch (ConfigurationException e) {
            System.err.println(e.getMessage());
        }
    }

}
