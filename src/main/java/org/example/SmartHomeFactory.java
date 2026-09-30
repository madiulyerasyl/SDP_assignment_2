package org.example;

public interface SmartHomeFactory {

    FamilyCamera createCamera();

    FamilyLight createLight();

    FamilyThermostat createThermostat();

    FamilyDoorLock createDoorLock();

    FamilySpeaker createSpeaker();

    FamilySensor createSensor();
}