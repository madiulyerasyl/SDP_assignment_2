package org.example;

public class SamsungSensor implements FamilySensor {

    @Override
    public String getFamily() {
        return "Samsung";
    }

    @Override
    public void detectMotion() {
        System.out.println("Samsung sensor detected motion");
    }

    @Override
    public void checkStatus() {
        System.out.println("Samsung sensor status is active");
    }
}