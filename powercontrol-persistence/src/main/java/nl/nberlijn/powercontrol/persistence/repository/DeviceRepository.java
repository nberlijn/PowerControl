package nl.nberlijn.powercontrol.persistence.repository;

import nl.nberlijn.powercontrol.core.persistence.repository.XMLRepository;
import nl.nberlijn.powercontrol.persistence.models.Device;

/**
 * Class representing the Device Repository.
 *
 * @author Nils Berlijn
 * @version 1.0
 * @since 1.0
 */
public class DeviceRepository extends XMLRepository<Device> {

    /**
     * A Device Repository constructor.
     * Initializes the Superclass.
     */
    public DeviceRepository() {
        super("storage", Device.class);
    }

}
