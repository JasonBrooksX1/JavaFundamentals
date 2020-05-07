package com.fundamentals.java;

public class Car {
    private String body;
    private String doors;
    private String windows;
    private int wheels;
    private int lights;

    public Car() {
        this("Blue");
    } // end constructor

    public Car(String doors) {
        this("Red","suicide", doors,4);
    }// end constructor

    public Car(String body, String doors, String windows, int wheels) {
        this.body = body;
        this.doors = doors;
        this.windows = windows;
        this.wheels = wheels;
    }// end constructor


    protected void setBody(String body) {
        //foundation = value;
        this.body = body;
    }// end property method setFoundation


    // Properties for door
    protected void setRoofType(String value) {
        doors = value;
    }

    protected String getRoofType() {
        return doors;
    }

    /*Properties of Door Color*/
    protected void stDoorColor(String value) {
        doors= value;
    }

    protected String getDoorColor() {
        return doors;
    }

    /* Properties of Window Size*/
    protected void setWindowSize(int value) {
        wheels = value;
    }

    protected int getWindowSize() { return lights; }

    }