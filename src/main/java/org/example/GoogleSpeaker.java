package org.example;

public class GoogleSpeaker implements FamilySpeaker {

    @Override
    public String getFamily() {
        return "Google";
    }

    @Override
    public void playMusic() {
        System.out.println("Google speaker is playing music");
    }

    @Override
    public void stopMusic() {
        System.out.println("Google speaker stopped music");
    }
}