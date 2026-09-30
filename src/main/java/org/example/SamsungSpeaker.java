package org.example;

public class SamsungSpeaker implements FamilySpeaker {

    @Override
    public String getFamily() {
        return "Samsung";
    }

    @Override
    public void playMusic() {
        System.out.println("Samsung speaker is playing music");
    }

    @Override
    public void stopMusic() {
        System.out.println("Samsung speaker stopped music");
    }
}