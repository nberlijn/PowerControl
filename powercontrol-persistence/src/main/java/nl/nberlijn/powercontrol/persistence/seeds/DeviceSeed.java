package nl.nberlijn.powercontrol.persistence.seeds;

import nl.nberlijn.powercontrol.api.persistence.seeder.enums.Seed;
import nl.nberlijn.powercontrol.api.persistence.seeder.Seeder;
import nl.nberlijn.powercontrol.persistence.models.Device;
import nl.nberlijn.powercontrol.persistence.models.Host;

/**
 * Class representing a Device Seed.
 *
 * @author Nils Berlijn
 * @version 1.0
 * @since 1.0
 */
@Seed
@SuppressWarnings("unused")
public class DeviceSeed implements Seeder<Device> {

    /**
     * Seeds a Device.
     *
     * @return a device
     */
    @Override
    public Device seed() {
        Device device = new Device();

        Host host = new Host();
        host.setName("Device");
        host.setHost("host.com");
        host.setPort(80);

        device.setHost(host);

        return device;
    }

}
