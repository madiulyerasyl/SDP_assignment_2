package org.example;

public class GoogleThermostat implements FamilyThermostat {

    private int temperature = 22;

    @Override
    public String getFamily() {
        return "Google";
    }

    @Override
    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("Google thermostat temperature is set to " + temperature + "°C");
    }

    @Override
    public void showTemperature() {
        System.out.println("Google thermostat temperature: " + temperature + "°C");
    }
}