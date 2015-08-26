package nl.nberlijn.powercontrol.data.seeds;

import nl.nberlijn.powercontrol.data.objects.Device;
import nl.nberlijn.powercontrol.kernel.seeder.Seed;
import nl.nberlijn.powercontrol.kernel.seeder.Seeder;

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
