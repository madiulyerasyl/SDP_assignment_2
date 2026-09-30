package org.example;

public class AppleSensor implements FamilySensor {

    @Override
    public String getFamily() {
        return "Apple";
    }

    @Override
    public void detectMotion() {
        System.out.println("Apple sensor detected motion");
    }

    @Override
    public void checkStatus() {
        System.out.println("Apple sensor status is active");
    }
}