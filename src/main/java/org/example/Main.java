package org.example;

public class Main {

    public static void main(String[] args) {

        DeviceCreator cameraCreator = new CameraCreator();
        DeviceCreator lightCreator = new LightCreator();
        DeviceCreator thermostatCreator = new ThermostatCreator();

        System.out.println("CAMERA:");
        cameraCreator.operateDevice();

        System.out.println("\nLIGHT:");
        lightCreator.operateDevice();

        System.out.println("\nTHERMOSTAT:");
        thermostatCreator.operateDevice();
    }
}