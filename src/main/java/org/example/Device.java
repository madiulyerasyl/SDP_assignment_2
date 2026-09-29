package org.example;

public class Device {
    private String type;
    private String family;

    public Device(String type, String family) {
        this.type = type;
        this.family = family;
    }

    public void start() {
        System.out.println(family + " " + type + " started");
    }

    public String getType() {
        return type;
    }

    public String getFamily() {
        return family;
    }
}