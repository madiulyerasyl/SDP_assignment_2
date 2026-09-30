package org.example;

public class Main {

    public static void main(String[] args) {

        SmartHomeFactory factory = new XiaomiFactory();

        SmartHomeSystem system = new SmartHomeSystem(factory);

        system.activateAwayMode();
        system.activateEveningMode();
        system.activateSecurityAlert();
    }
}