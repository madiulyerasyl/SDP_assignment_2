package org.example;

public class PhilipsCamera implements FamilyCamera {

    @Override
    public String getFamily() {
        return "Philips";
    }

    @Override
    public void record() {
        System.out.println("Philips camera is recording");
    }

    @Override
    public void sendAlert() {
        System.out.println("Philips camera sends a smart home alert");
    }
}