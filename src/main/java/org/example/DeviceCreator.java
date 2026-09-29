package org.example;

public abstract class DeviceCreator {

    // Factory Method
    public abstract SmartDevice createDevice();

    // Business logic
    public void operateDevice() {
        SmartDevice device = createDevice();

        System.out.println("Preparing: " + device.getName());
        device.turnOn();
        device.performAction();
    }
}