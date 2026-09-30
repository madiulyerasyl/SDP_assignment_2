package org.example;

public class AmazonSensor implements FamilySensor {

    @Override
    public String getFamily() {
        return "Amazon";
    }

    @Override
    public void detectMotion() {
        System.out.println("Amazon sensor detected motion");
    }

    @Override
    public void checkStatus() {
        System.out.println("Amazon sensor status is active");
    }
}