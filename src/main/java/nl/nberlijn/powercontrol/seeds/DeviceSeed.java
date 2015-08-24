package nl.nberlijn.powercontrol.seeds;

import nl.nberlijn.powercontrol.objects.Device;
import nl.nberlijn.powercontrol.kernel.seeder.Seed;
import nl.nberlijn.powercontrol.kernel.seeder.Seeder;

@Seed(location = "storage")
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
