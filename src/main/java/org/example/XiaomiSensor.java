package org.example;

public class XiaomiSensor implements FamilySensor {

    @Override
    public String getFamily() {
        return "Xiaomi";
    }

    @Override
    public void detectMotion() {
        System.out.println("Xiaomi sensor detected motion");
    }

    @Override
    public void checkStatus() {
        System.out.println("Xiaomi sensor status is active");
    }
}