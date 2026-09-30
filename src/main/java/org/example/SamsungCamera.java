package org.example;

public class SamsungCamera implements FamilyCamera {

    @Override
    public String getFamily() {
        return "Samsung";
    }

    @Override
    public void record() {
        System.out.println("Samsung camera is recording");
    }

    @Override
    public void sendAlert() {
        System.out.println("Samsung camera sends a SmartThings alert");
    }
}