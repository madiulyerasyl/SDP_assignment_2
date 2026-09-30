package org.example;

public class GoogleFactory implements SmartHomeFactory {

    @Override
    public FamilyCamera createCamera() {
        return new GoogleCamera();
    }

    @Override
    public FamilyLight createLight() {
        return new GoogleLight();
    }

    @Override
    public FamilyThermostat createThermostat() {
        return new GoogleThermostat();
    }

    @Override
    public FamilyDoorLock createDoorLock() {
        return new GoogleDoorLock();
    }

    @Override
    public FamilySpeaker createSpeaker() {
        return new GoogleSpeaker();
    }

    @Override
    public FamilySensor createSensor() {
        return new GoogleSensor();
    }
}