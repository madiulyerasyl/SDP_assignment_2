package org.example;

public class AppleCamera implements FamilyCamera {

    @Override
    public String getFamily() {
        return "Apple";
    }

    @Override
    public void record() {
        System.out.println("Apple camera is recording");
    }

    @Override
    public void sendAlert() {
        System.out.println("Apple camera sends a HomeKit alert");
    }
}