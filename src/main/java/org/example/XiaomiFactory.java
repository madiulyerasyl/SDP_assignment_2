package org.example;

public class XiaomiFactory implements SmartHomeFactory {

    @Override
    public FamilyCamera createCamera() {
        return new XiaomiCamera();
    }

    @Override
    public FamilyLight createLight() {
        return new XiaomiLight();
    }

    @Override
    public FamilyThermostat createThermostat() {
        return new XiaomiThermostat();
    }

    @Override
    public FamilyDoorLock createDoorLock() {
        return new XiaomiDoorLock();
    }

    @Override
    public FamilySpeaker createSpeaker() {
        return new XiaomiSpeaker();
    }

    @Override
    public FamilySensor createSensor() {
        return new XiaomiSensor();
    }
}