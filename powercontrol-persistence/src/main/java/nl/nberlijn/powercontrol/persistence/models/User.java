package nl.nberlijn.powercontrol.persistence.models;

import nl.nberlijn.powercontrol.api.persistence.models.Model;

import javax.xml.bind.annotation.*;

/**
 * Class representing an User.
 *
 * @author Nils Berlijn
 * @version 1.0
 * @since 1.0
 */
@XmlRootElement(name = "user")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {
        "user",
        "password"
})
public class User implements Model {

    /**
     * The user.
     */
    @XmlElement(name = "user")
    private String user;

    /**
     * The password.
     */
    @XmlElement(name = "password")
    private String password;

    /**
     * Gets the user.
     *
     * @return The user
     */
    public String getUser() {
        return user;
    }

    /**
     * Sets the user.
     *
     * @param user The user
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * Gets the password.
     *
     * @return The password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the password.
     *
     * @param password The password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Returns a representation of the Host.
     *
     * @return The user
     */
    @Override
    public String toString() {
        return user + " " + password;
    }

}
