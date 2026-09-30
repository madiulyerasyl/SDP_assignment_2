package org.example;

public class SamsungThermostat implements FamilyThermostat {

    private int temperature = 22;

    @Override
    public String getFamily() {
        return "Samsung";
    }

    @Override
    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("Samsung thermostat temperature is set to " + temperature + "°C");
    }

    @Override
    public void showTemperature() {
        System.out.println("Samsung thermostat temperature: " + temperature + "°C");
    }
}