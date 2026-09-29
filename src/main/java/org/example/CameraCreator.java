package org.example;

public class CameraCreator extends DeviceCreator {

    @Override
    public SmartDevice createDevice() {
        return new Camera();
    }
}