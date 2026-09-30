package org.example;

public class FactoryProvider {

    public static SmartHomeFactory getFactory(String family) {

        if (family.equalsIgnoreCase("xiaomi")) {
            return new XiaomiFactory();
        }

        if (family.equalsIgnoreCase("samsung")) {
            return new SamsungFactory();
        }

        if (family.equalsIgnoreCase("google")) {
            return new GoogleFactory();
        }

        if (family.equalsIgnoreCase("amazon")) {
            return new AmazonFactory();
        }

        if (family.equalsIgnoreCase("apple")) {
            return new AppleFactory();
        }

        if (family.equalsIgnoreCase("philips")) {
            return new PhilipsFactory();
        }

        throw new IllegalArgumentException("Unknown family: " + family);
    }
}