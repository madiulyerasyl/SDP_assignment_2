package org.example;

public class AppleFactory implements SmartHomeFactory {

    @Override
    public FamilyCamera createCamera() {
        return new AppleCamera();
    }

    @Override
    public FamilyLight createLight() {
        return new AppleLight();
    }

    @Override
    public FamilyThermostat createThermostat() {
        return new AppleThermostat();
    }

    @Override
    public FamilyDoorLock createDoorLock() {
        return new AppleDoorLock();
    }

    @Override
    public FamilySpeaker createSpeaker() {
        return new AppleSpeaker();
    }

    @Override
    public FamilySensor createSensor() {
        return new AppleSensor();
    }
}