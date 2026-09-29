package org.example;

public class Camera implements SmartDevice {

    @Override
    public String getName() {
        return "Smart Camera";
    }

    @Override
    public void turnOn() {
        System.out.println("Camera is turned on");
    }

    @Override
    public void performAction() {
        System.out.println("Camera is monitoring the house");
    }
}