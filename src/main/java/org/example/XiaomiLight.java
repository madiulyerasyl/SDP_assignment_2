package org.example;

public class XiaomiLight implements FamilyLight {

    @Override
    public String getFamily() {
        return "Xiaomi";
    }

    @Override
    public void turnOn() {
        System.out.println("Xiaomi light is turned on");
    }

    @Override
    public void setBrightness(int level) {
        System.out.println("Xiaomi light brightness is set to " + level + "%");
    }
}