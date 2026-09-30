package org.example;

public class AmazonFactory implements SmartHomeFactory {

    @Override
    public FamilyCamera createCamera() {
        return new AmazonCamera();
    }

    @Override
    public FamilyLight createLight() {
        return new AmazonLight();
    }

    @Override
    public FamilyThermostat createThermostat() {
        return new AmazonThermostat();
    }

    @Override
    public FamilyDoorLock createDoorLock() {
        return new AmazonDoorLock();
    }

    @Override
    public FamilySpeaker createSpeaker() {
        return new AmazonSpeaker();
    }

    @Override
    public FamilySensor createSensor() {
        return new AmazonSensor();
    }
}