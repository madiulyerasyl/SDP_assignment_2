package org.example;

public class SamsungFactory implements SmartHomeFactory {

    @Override
    public FamilyCamera createCamera() {
        return new SamsungCamera();
    }

    @Override
    public FamilyLight createLight() {
        return new SamsungLight();
    }

    @Override
    public FamilyThermostat createThermostat() {
        return new SamsungThermostat();
    }

    @Override
    public FamilyDoorLock createDoorLock() {
        return new SamsungDoorLock();
    }

    @Override
    public FamilySpeaker createSpeaker() {
        return new SamsungSpeaker();
    }

    @Override
    public FamilySensor createSensor() {
        return new SamsungSensor();
    }
}