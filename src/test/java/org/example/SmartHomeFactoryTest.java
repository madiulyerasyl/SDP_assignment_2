package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SmartHomeFactoryTest {

    @Test
    void xiaomiFactoryCreatesCorrectProducts() {
        SmartHomeFactory factory = new XiaomiFactory();

        assertInstanceOf(XiaomiCamera.class, factory.createCamera());
        assertInstanceOf(XiaomiLight.class, factory.createLight());
        assertInstanceOf(XiaomiThermostat.class, factory.createThermostat());
        assertInstanceOf(XiaomiDoorLock.class, factory.createDoorLock());
        assertInstanceOf(XiaomiSpeaker.class, factory.createSpeaker());
        assertInstanceOf(XiaomiSensor.class, factory.createSensor());
    }

    @Test
    void samsungFactoryCreatesCorrectProducts() {
        SmartHomeFactory factory = new SamsungFactory();

        assertInstanceOf(SamsungCamera.class, factory.createCamera());
        assertInstanceOf(SamsungLight.class, factory.createLight());
        assertInstanceOf(SamsungThermostat.class, factory.createThermostat());
        assertInstanceOf(SamsungDoorLock.class, factory.createDoorLock());
        assertInstanceOf(SamsungSpeaker.class, factory.createSpeaker());
        assertInstanceOf(SamsungSensor.class, factory.createSensor());
    }

    @Test
    void googleFactoryCreatesCorrectProducts() {
        SmartHomeFactory factory = new GoogleFactory();

        assertInstanceOf(GoogleCamera.class, factory.createCamera());
        assertInstanceOf(GoogleLight.class, factory.createLight());
        assertInstanceOf(GoogleThermostat.class, factory.createThermostat());
        assertInstanceOf(GoogleDoorLock.class, factory.createDoorLock());
        assertInstanceOf(GoogleSpeaker.class, factory.createSpeaker());
        assertInstanceOf(GoogleSensor.class, factory.createSensor());
    }

    @Test
    void amazonFactoryCreatesCorrectProducts() {
        SmartHomeFactory factory = new AmazonFactory();

        assertInstanceOf(AmazonCamera.class, factory.createCamera());
        assertInstanceOf(AmazonLight.class, factory.createLight());
        assertInstanceOf(AmazonThermostat.class, factory.createThermostat());
        assertInstanceOf(AmazonDoorLock.class, factory.createDoorLock());
        assertInstanceOf(AmazonSpeaker.class, factory.createSpeaker());
        assertInstanceOf(AmazonSensor.class, factory.createSensor());
    }

    @Test
    void xiaomiProductsAreCompatible() {
        SmartHomeFactory factory = new XiaomiFactory();

        assertEquals("Xiaomi", factory.createCamera().getFamily());
        assertEquals("Xiaomi", factory.createLight().getFamily());
        assertEquals("Xiaomi", factory.createThermostat().getFamily());
        assertEquals("Xiaomi", factory.createDoorLock().getFamily());
        assertEquals("Xiaomi", factory.createSpeaker().getFamily());
        assertEquals("Xiaomi", factory.createSensor().getFamily());
    }

    @Test
    void samsungProductsAreCompatible() {
        SmartHomeFactory factory = new SamsungFactory();

        assertEquals("Samsung", factory.createCamera().getFamily());
        assertEquals("Samsung", factory.createLight().getFamily());
        assertEquals("Samsung", factory.createThermostat().getFamily());
        assertEquals("Samsung", factory.createDoorLock().getFamily());
        assertEquals("Samsung", factory.createSpeaker().getFamily());
        assertEquals("Samsung", factory.createSensor().getFamily());
    }

    @Test
    void googleProductsAreCompatible() {
        SmartHomeFactory factory = new GoogleFactory();

        assertEquals("Google", factory.createCamera().getFamily());
        assertEquals("Google", factory.createLight().getFamily());
        assertEquals("Google", factory.createThermostat().getFamily());
        assertEquals("Google", factory.createDoorLock().getFamily());
        assertEquals("Google", factory.createSpeaker().getFamily());
        assertEquals("Google", factory.createSensor().getFamily());
    }

    @Test
    void runtimeSelectionReturnsXiaomiFactory() {
        SmartHomeFactory factory = FactoryProvider.getFactory("xiaomi");

        assertInstanceOf(XiaomiFactory.class, factory);
    }

    @Test
    void runtimeSelectionReturnsSamsungFactory() {
        SmartHomeFactory factory = FactoryProvider.getFactory("samsung");

        assertInstanceOf(SamsungFactory.class, factory);
    }

    @Test
    void runtimeSelectionReturnsGoogleFactory() {
        SmartHomeFactory factory = FactoryProvider.getFactory("google");

        assertInstanceOf(GoogleFactory.class, factory);
    }

    @Test
    void runtimeSelectionReturnsAmazonFactory() {
        SmartHomeFactory factory = FactoryProvider.getFactory("amazon");

        assertInstanceOf(AmazonFactory.class, factory);
    }

    @Test
    void unknownFamilyThrowsException() {
        assertThrows(
                IllegalArgumentException.class,
                () -> FactoryProvider.getFactory("unknown")
        );
    }

    @Test
    void emptyFamilyThrowsException() {
        assertThrows(
                IllegalArgumentException.class,
                () -> FactoryProvider.getFactory("")
        );
    }
}