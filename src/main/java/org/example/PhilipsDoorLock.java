package org.example;

public class PhilipsDoorLock implements FamilyDoorLock {

    @Override
    public String getFamily() {
        return "Philips";
    }

    @Override
    public void lock() {
        System.out.println("Philips door lock is locked");
    }

    @Override
    public void unlock() {
        System.out.println("Philips door lock is unlocked");
    }
}