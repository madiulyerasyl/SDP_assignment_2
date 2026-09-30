package org.example;

public class AppleThermostat implements FamilyThermostat {

    private int temperature = 22;

    @Override
    public String getFamily() {
        return "Apple";
    }

    @Override
    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("Apple thermostat temperature is set to " + temperature + "°C");
    }

    @Override
    public void showTemperature() {
        System.out.println("Apple thermostat temperature: " + temperature + "°C");
    }
}