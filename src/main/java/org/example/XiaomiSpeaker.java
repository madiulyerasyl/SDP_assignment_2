package org.example;

public class XiaomiSpeaker implements FamilySpeaker {

    @Override
    public String getFamily() {
        return "Xiaomi";
    }

    @Override
    public void playMusic() {
        System.out.println("Xiaomi speaker is playing music");
    }

    @Override
    public void stopMusic() {
        System.out.println("Xiaomi speaker stopped music");
    }
}