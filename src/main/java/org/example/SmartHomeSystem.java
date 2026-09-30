package org.example;

public class SmartHomeSystem {

    private final FamilyCamera camera;
    private final FamilyLight light;
    private final FamilyThermostat thermostat;
    private final FamilyDoorLock doorLock;
    private final FamilySpeaker speaker;
    private final FamilySensor sensor;

    public SmartHomeSystem(SmartHomeFactory factory) {
        camera = factory.createCamera();
        light = factory.createLight();
        thermostat = factory.createThermostat();
        doorLock = factory.createDoorLock();
        speaker = factory.createSpeaker();
        sensor = factory.createSensor();
    }

    public void activateAwayMode() {
        System.out.println("\n--- AWAY MODE ---");
        doorLock.lock();
        sensor.checkStatus();
        camera.record();
    }

    public void activateEveningMode() {
        System.out.println("\n--- EVENING MODE ---");
        light.turnOn();
        light.setBrightness(60);
        thermostat.setTemperature(22);
        speaker.playMusic();
    }

    public void activateSecurityAlert() {
        System.out.println("\n--- SECURITY ALERT ---");
        sensor.detectMotion();
        camera.record();
        camera.sendAlert();
        doorLock.lock();
    }
}