package org.example;

public class XiaomiDoorLock implements FamilyDoorLock {

    @Override
    public String getFamily() {
        return "Xiaomi";
    }

    @Override
    public void lock() {
        System.out.println("Xiaomi door lock is locked");
    }

    @Override
    public void unlock() {
        System.out.println("Xiaomi door lock is unlocked");
    }
}