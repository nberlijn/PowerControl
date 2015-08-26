package nl.nberlijn.powercontrol.app.data.models;

import nl.nberlijn.powercontrol.kernel.models.JAXBModel;
import nl.nberlijn.powercontrol.app.data.objects.Device;

public class DeviceModel extends JAXBModel<Device> {

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
