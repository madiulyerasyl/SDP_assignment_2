package org.example;

public class AmazonSpeaker implements FamilySpeaker {

    @Override
    public String getFamily() {
        return "Amazon";
    }

    @Override
    public void playMusic() {
        System.out.println("Amazon speaker is playing music");
    }

    @Override
    public void stopMusic() {
        System.out.println("Amazon speaker stopped music");
    }
}