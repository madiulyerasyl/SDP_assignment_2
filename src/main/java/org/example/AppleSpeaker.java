package org.example;

public class AppleSpeaker implements FamilySpeaker {

    @Override
    public String getFamily() {
        return "Apple";
    }

    @Override
    public void playMusic() {
        System.out.println("Apple speaker is playing music");
    }

    @Override
    public void stopMusic() {
        System.out.println("Apple speaker stopped music");
    }
}