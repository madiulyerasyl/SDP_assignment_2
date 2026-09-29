package org.example;

public class Thermostat implements SmartDevice {

    @Override
    public String getName() {
        return "Smart Thermostat";
    }

    @Override
    public void turnOn() {
        System.out.println("Thermostat is turned on");
    }

    @Override
    public void performAction() {
        System.out.println("Thermostat is controlling the temperature");
    }
}