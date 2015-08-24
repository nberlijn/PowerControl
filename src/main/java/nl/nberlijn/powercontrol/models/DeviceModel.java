package nl.nberlijn.powercontrol.models;

import nl.nberlijn.powercontrol.kernel.model.Model;
import nl.nberlijn.powercontrol.objects.Device;

public class DeviceModel extends Model<Device> {

    public DeviceModel() {
        super(Device.class);
    }

    public Device getDevice() {
        return getObject();
    }

    public void updateDevice(Device device) {
        setObject(device);
    }

}
