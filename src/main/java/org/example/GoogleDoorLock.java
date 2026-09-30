package org.example;

public class GoogleDoorLock implements FamilyDoorLock {

    @Override
    public String getFamily() {
        return "Google";
    }

    @Override
    public void lock() {
        System.out.println("Google door lock is locked");
    }

    @Override
    public void unlock() {
        System.out.println("Google door lock is unlocked");
    }
}