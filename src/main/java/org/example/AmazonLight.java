package org.example;

public class AmazonLight implements FamilyLight {

    @Override
    public String getFamily() {
        return "Amazon";
    }

    @Override
    public void turnOn() {
        System.out.println("Amazon light is turned on");
    }

    @Override
    public void setBrightness(int level) {
        System.out.println("Amazon light brightness is set to " + level + "%");
    }
}