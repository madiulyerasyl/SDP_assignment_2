package org.example;

public class SamsungDoorLock implements FamilyDoorLock {

    @Override
    public String getFamily() {
        return "Samsung";
    }

    @Override
    public void lock() {
        System.out.println("Samsung door lock is locked");
    }

    @Override
    public void unlock() {
        System.out.println("Samsung door lock is unlocked");
    }
}