package com.fundamentals.java;

/*This class goes over the Lesson 15 content
* Abstract*/
public abstract class Lesson15Abstract implements Lesson15Interface {
    private int volume;
    private int[] numberKeys;
    private int sendKey;
    private String screen;

    public Lesson15Abstract(int vol, int[] nKeys, int sKey, String screen) {
        this.volume = vol;
        this.numberKeys =nKeys;
        this.sendKey = sKey;
        this.screen = screen;
    }// end constructor

    public abstract void receiveCall(); // abstract method no body

    public abstract void sendCall(); // abstract method no body

    public void endCall(){
    System.out.println("Call had ended");
    }// end method endCall from interface



    public int getVolume() {
        return volume;
    }

    public int[] getNumberKeys() {
        return numberKeys;
    }

    public int getSendKey() {
        return sendKey;
    }

    public String getScreen() {
        return screen;
    }
}
