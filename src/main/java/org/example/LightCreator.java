package org.example;

public class LightCreator extends DeviceCreator {

    @Override
    public SmartDevice createDevice() {
        return new Light();
    }
}