package org.example;

public class PhilipsFactory implements SmartHomeFactory {

    @Override
    public FamilyCamera createCamera() {
        return new PhilipsCamera();
    }

    @Override
    public FamilyLight createLight() {
        return new PhilipsLight();
    }

    @Override
    public FamilyThermostat createThermostat() {
        return new PhilipsThermostat();
    }

    @Override
    public FamilyDoorLock createDoorLock() {
        return new PhilipsDoorLock();
    }

    @Override
    public FamilySpeaker createSpeaker() {
        return new PhilipsSpeaker();
    }

    @Override
    public FamilySensor createSensor() {
        return new PhilipsSensor();
    }
}