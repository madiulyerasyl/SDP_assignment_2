package org.example;

public class ThermostatCreator extends DeviceCreator {

    @Override
    public SmartDevice createDevice() {
        return new Thermostat();
    }
}