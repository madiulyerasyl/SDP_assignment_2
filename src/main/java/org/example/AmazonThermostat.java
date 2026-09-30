package org.example;

public class AmazonThermostat implements FamilyThermostat {

    private int temperature = 22;

    @Override
    public String getFamily() {
        return "Amazon";
    }

    @Override
    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("Amazon thermostat temperature is set to " + temperature + "°C");
    }

    @Override
    public void showTemperature() {
        System.out.println("Amazon thermostat temperature: " + temperature + "°C");
    }
}