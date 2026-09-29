package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Choose family (xiaomi, samsung, google): ");
        String family = scanner.nextLine();

        Device camera;
        Device light;
        Device thermostat;

        if (family.equalsIgnoreCase("xiaomi")) {
            camera = new Device("Camera", "Xiaomi");
            light = new Device("Light", "Xiaomi");
            thermostat = new Device("Thermostat", "Xiaomi");
        } else if (family.equalsIgnoreCase("samsung")) {
            camera = new Device("Camera", "Samsung");
            light = new Device("Light", "Samsung");
            thermostat = new Device("Thermostat", "Samsung");
        } else if (family.equalsIgnoreCase("google")) {
            camera = new Device("Camera", "Google");
            light = new Device("Light", "Google");
            thermostat = new Device("Thermostat", "Google");
        } else {
            System.out.println("Unknown family");
            return;
        }

        camera.start();
        light.start();
        thermostat.start();
    }
}