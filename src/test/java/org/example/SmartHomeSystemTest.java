package org.example;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class SmartHomeSystemTest {

    @Test
    void awayModeUsesCorrectDevices() {
        SmartHomeFactory factory = new XiaomiFactory();
        SmartHomeSystem system = new SmartHomeSystem(factory);

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(output));

        system.activateAwayMode();

        String result = output.toString();

        assertTrue(result.contains("Xiaomi door lock is locked"));
        assertTrue(result.contains("Xiaomi sensor status is active"));
        assertTrue(result.contains("Xiaomi camera is recording"));

        System.setOut(originalOut);
    }

    @Test
    void eveningModeUsesCorrectDevices() {
        SmartHomeFactory factory = new SamsungFactory();
        SmartHomeSystem system = new SmartHomeSystem(factory);

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(output));

        system.activateEveningMode();

        String result = output.toString();

        assertTrue(result.contains("Samsung light is turned on"));
        assertTrue(result.contains("Samsung thermostat temperature is set to 22"));
        assertTrue(result.contains("Samsung speaker is playing music"));

        System.setOut(originalOut);
    }

    @Test
    void securityAlertUsesCorrectDevices() {
        SmartHomeFactory factory = new GoogleFactory();
        SmartHomeSystem system = new SmartHomeSystem(factory);

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(output));

        system.activateSecurityAlert();

        String result = output.toString();

        assertTrue(result.contains("Google sensor detected motion"));
        assertTrue(result.contains("Google camera is recording"));
        assertTrue(result.contains("Google camera sends a Google Home alert"));
        assertTrue(result.contains("Google door lock is locked"));

        System.setOut(originalOut);
    }
}