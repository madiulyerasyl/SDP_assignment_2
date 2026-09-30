package org.example;

public class XiaomiCamera implements FamilyCamera {

    @Override
    public String getFamily() {
        return "Xiaomi";
    }

    @Override
    public void record() {
        System.out.println("Xiaomi camera is recording");
    }

    @Override
    public void sendAlert() {
        System.out.println("Xiaomi camera sends a Mi Home alert");
    }
}