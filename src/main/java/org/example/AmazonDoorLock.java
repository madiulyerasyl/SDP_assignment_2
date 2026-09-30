package org.example;

public class AmazonDoorLock implements FamilyDoorLock {

    @Override
    public String getFamily() {
        return "Amazon";
    }

    @Override
    public void lock() {
        System.out.println("Amazon door lock is locked");
    }

    @Override
    public void unlock() {
        System.out.println("Amazon door lock is unlocked");
    }
}