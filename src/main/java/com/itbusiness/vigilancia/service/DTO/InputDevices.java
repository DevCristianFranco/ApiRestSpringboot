package com.itbusiness.vigilancia.service.DTO;

import java.util.List;

public class InputDevices {
    private List<DeviceMessage> devices;

    public List<DeviceMessage> getDevices() {
        return devices;
    }

    public void setDevices(List<DeviceMessage> devices) {
        this.devices = devices;
    }
}
