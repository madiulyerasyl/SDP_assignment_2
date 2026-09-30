package org.example;

public class GoogleSensor implements FamilySensor {

    @Override
    public String getFamily() {
        return "Google";
    }

    @Override
    public void detectMotion() {
        System.out.println("Google sensor detected motion");
    }

    @Override
    public void checkStatus() {
        System.out.println("Google sensor status is active");
    }
}