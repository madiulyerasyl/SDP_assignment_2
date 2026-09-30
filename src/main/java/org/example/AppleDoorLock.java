package org.example;

public class AppleDoorLock implements FamilyDoorLock {

    @Override
    public String getFamily() {
        return "Apple";
    }

    @Override
    public void lock() {
        System.out.println("Apple door lock is locked");
    }

    @Override
    public void unlock() {
        System.out.println("Apple door lock is unlocked");
    }
}