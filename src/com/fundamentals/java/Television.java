package com.fundamentals.java;

public class Television {

    public void turnOn() {
        System.out.println("the tv is turned on");
    }
    private int screenSize;
    private float price;
    private int ports;
    private boolean isMountable;


    public Television(int screenSize) {
        this(screenSize, 400.50f, 4, true);
    }

    public Television(int screenSize, float price, int ports, boolean isMountable) {
        this.screenSize = screenSize;
        this.price = price;
        this.ports = ports;
        this.isMountable = isMountable;
    }

    protected void setscreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    protected int getscreenSize() {
        return screenSize;
    }

    protected void setprice(float price) {
        this.price = price;
    }

    protected float getprice() {
        return price;
    }

    protected void setports(int ports) {
        this.ports = ports;
    }

    protected float getports() {
        return ports;
    }

    protected void setisMountable(boolean isMountable) {
        this.isMountable = isMountable;
    }

    protected boolean getisMountable() {
        return isMountable;
    }
}

    /*
Using the Television class, create the attributes below. Include setters
and getters for each attribute. Include 2 constructors in this class. The first
constructor will take 2 parameters. The second constructor will take all the
attributes. Utilize the ‘this’ keyword in the first constructor. Include a method
called turnOn that will print a simple statement ‘the tv is turned on’. Utilize
Attributes: screenSize,price,ports,isMountable*/

