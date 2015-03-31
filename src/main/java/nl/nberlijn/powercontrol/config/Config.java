package nl.nberlijn.powercontrol.config;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

public enum Config {

    INSTANCE;

    private PropertiesConfiguration propertiesConfiguration;

    Config() {
        try {
            propertiesConfiguration = new PropertiesConfiguration("config.properties");
        } catch (ConfigurationException e) {
            System.err.println(e.getMessage());
        }
    }

    public PropertiesConfiguration getConfiguration() {
        return propertiesConfiguration;
    }

}
