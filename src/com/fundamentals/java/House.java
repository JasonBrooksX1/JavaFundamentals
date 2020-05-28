package com.fundamentals.java;

/* This class is part of Lesson 4
* My Application Overview */
public class House {
    private String foundation;
    private String roofType;
    private String doorColor;
    private int windowSize;
    private int garageDoorNumber;

    public House() {
        this("Blue");
    } // end constructor

    public House(String doorColor) {
        this("wood","composite", doorColor,30);
        System.out.println("The door color is "+ doorColor);
    }// end constructor

    public House(String doorColor, int windowSize) {
        this("concrete", "Shingle", doorColor, windowSize);
    }

    public House(String foundation, String roofType, String doorColor, int windowSize) {
        this.foundation = foundation;
        this.roofType = roofType;
        this.doorColor = doorColor;
        this.windowSize = windowSize;
    }// end constructor

    /* Properties for Foundation */
    protected void setFoundation(String foundation) {
        //foundation = value;
        this.foundation = foundation;
    }// end property method setFoundation

    protected String getFoundation() {
        return foundation;
    }// end property method getFoundation

    // Properties for Roof Type
    protected void setRoofType(String value) {
        roofType = value;
    }// end property method setRoofType

    protected String getRoofType() {
        return roofType;
    }// end property method getRoofType

    /*Properties of Door Color*/
    protected void stDoorColor(String value) {
        doorColor= value;
    }// end property method setDoorColor

    protected String getDoorColor() {
        return doorColor;
}// end property method getDoorColor

    /* Properties of Window Size*/
    protected void setWindowSize(int value) {
        windowSize = value;
    }// end property method setWindowSize

    protected int getWindowSize() {
        return windowSize;
    }// end property method getWindowSize


    //original method
    public void doorOpenClose() {
        System.out.println("The door is open");
}// end method doorOpenClose

    //overload method
    public void doorOpenClose(String message) {
        System.out.println(message);
    }// end method doorOpenClose

    /* The below methods are demonstrating lesson 10 Access modifiers*/
    // private means only accessable from the class
    private void windowOpenClose() {
    System.out.println("The window is open or closed");
    }// end method windowOpenClose

    void openGarage() {
        System.out.println("Open the garage");
    } // end method OpenGarage

    //protected, only accessible in the same package, or subclass of another package
    protected void closeGarage() {
        System.out.println("Close the garage");
    }// end method closeGarage

    public int getGarageDoorNumber() {
        return garageDoorNumber;
    }

    public void setGarageDoorNumber(int garageDoorNumber) {
        this.garageDoorNumber = garageDoorNumber;
    }
} // end class House
