package org.example;

public class AmazonCamera implements FamilyCamera {

    @Override
    public String getFamily() {
        return "Amazon";
    }

    @Override
    public void record() {
        System.out.println("Amazon camera is recording");
    }

    @Override
    public void sendAlert() {
        System.out.println("Amazon camera sends an Alexa alert");
    }
}