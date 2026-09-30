package org.example;

public class XiaomiThermostat implements FamilyThermostat {

    private int temperature = 22;

    @Override
    public String getFamily() {
        return "Xiaomi";
    }

    @Override
    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("Xiaomi thermostat temperature is set to " + temperature + "°C");
    }

    @Override
    public void showTemperature() {
        System.out.println("Xiaomi thermostat temperature: " + temperature + "°C");
    }
}