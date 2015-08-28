package nl.nberlijn.powercontrol.persistence.repository;

import nl.nberlijn.powercontrol.core.persistence.repository.JAXBRepository;
import nl.nberlijn.powercontrol.persistence.models.Device;

public class DeviceRepository extends JAXBRepository<Device> {

    public DeviceRepository() {
        super(Device.class);
    }

}
