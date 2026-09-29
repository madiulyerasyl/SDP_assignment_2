package org.example;

public class Light implements SmartDevice {

    @Override
    public String getName() {
        return "Smart Light";
    }

    @Override
    public void turnOn() {
        System.out.println("Light is turned on");
    }

    @Override
    public void performAction() {
        System.out.println("Light is illuminating the room");
    }
}