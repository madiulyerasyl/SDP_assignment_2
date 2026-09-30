package org.example;

public class PhilipsSensor implements FamilySensor {

    @Override
    public String getFamily() {
        return "Philips";
    }

    @Override
    public void detectMotion() {
        System.out.println("Philips sensor detected motion");
    }

    @Override
    public void checkStatus() {
        System.out.println("Philips sensor status is active");
    }
}