package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose smart home family:");
        System.out.println("xiaomi");
        System.out.println("samsung");
        System.out.println("google");
        System.out.println("amazon");
        System.out.println("apple");
        System.out.println("philips");

        String family = scanner.nextLine();

        SmartHomeFactory factory = FactoryProvider.getFactory(family);

        SmartHomeSystem system = new SmartHomeSystem(factory);

        system.activateAwayMode();
        system.activateEveningMode();
        system.activateSecurityAlert();

        scanner.close();
    }
}