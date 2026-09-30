package org.example;

public class PhilipsSpeaker implements FamilySpeaker {

    @Override
    public String getFamily() {
        return "Philips";
    }

    @Override
    public void playMusic() {
        System.out.println("Philips speaker is playing music");
    }

    @Override
    public void stopMusic() {
        System.out.println("Philips speaker stopped music");
    }
}