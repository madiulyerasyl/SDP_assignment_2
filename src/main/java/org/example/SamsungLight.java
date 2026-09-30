package org.example;

public class SamsungLight implements FamilyLight {

    @Override
    public String getFamily() {
        return "Samsung";
    }

    @Override
    public void turnOn() {
        System.out.println("Samsung light is turned on");
    }

    @Override
    public void setBrightness(int level) {
        System.out.println("Samsung light brightness is set to " + level + "%");
    }
}