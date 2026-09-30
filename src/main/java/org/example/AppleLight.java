package org.example;

public class AppleLight implements FamilyLight {

    @Override
    public String getFamily() {
        return "Apple";
    }

    @Override
    public void turnOn() {
        System.out.println("Apple light is turned on");
    }

    @Override
    public void setBrightness(int level) {
        System.out.println("Apple light brightness is set to " + level + "%");
    }
}