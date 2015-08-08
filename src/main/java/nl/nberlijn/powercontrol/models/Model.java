package nl.nberlijn.powercontrol.models;

import nl.nberlijn.powercontrol.config.Properties;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

public abstract class Model {

    private PropertiesConfiguration propertiesConfiguration;
    private String selected;

    public Model(String fileName) {
        try {
            propertiesConfiguration = new PropertiesConfiguration(Properties.INSTANCE.DIR + fileName + ".properties");
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

    protected String getSelected() {
        return selected;
    }

    protected void setSelected(String selected) {
        this.selected = selected;
    }

    protected Object getProperty(String key) {
        return propertiesConfiguration.getProperty(key);
    }

    protected void setProperty(String key, Object value) {
        propertiesConfiguration.setProperty(key, value);
    }

}
