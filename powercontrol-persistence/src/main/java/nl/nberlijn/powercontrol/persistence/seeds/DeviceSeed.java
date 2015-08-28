package nl.nberlijn.powercontrol.persistence.seeds;

import nl.nberlijn.powercontrol.api.persistence.seeder.Seed;
import nl.nberlijn.powercontrol.api.persistence.seeder.Seeder;
import nl.nberlijn.powercontrol.persistence.models.Device;

@Seed
@SuppressWarnings("unused")
public class DeviceSeed implements Seeder<Device> {

    @Override
    public Device seed() {
        Device device = new Device();
        device.setName("Device");
        device.setHost("host.com");
        device.setPort(80);

        return device;
    }

}
