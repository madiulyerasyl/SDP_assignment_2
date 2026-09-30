package org.example;

public class PhilipsLight implements FamilyLight {

    @Override
    public String getFamily() {
        return "Philips";
    }

    @Override
    public void turnOn() {
        System.out.println("Philips light is turned on");
    }

    @Override
    public void setBrightness(int level) {
        System.out.println("Philips light brightness is set to " + level + "%");
    }
}