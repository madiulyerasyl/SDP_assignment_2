package org.example;

public class GoogleCamera implements FamilyCamera {

    @Override
    public String getFamily() {
        return "Google";
    }

    @Override
    public void record() {
        System.out.println("Google camera is recording");
    }

    @Override
    public void sendAlert() {
        System.out.println("Google camera sends a Google Home alert");
    }
}