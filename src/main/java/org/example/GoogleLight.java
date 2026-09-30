package org.example;

public class GoogleLight implements FamilyLight {

    @Override
    public String getFamily() {
        return "Google";
    }

    @Override
    public void turnOn() {
        System.out.println("Google light is turned on");
    }

    @Override
    public void setBrightness(int level) {
        System.out.println("Google light brightness is set to " + level + "%");
    }
}
