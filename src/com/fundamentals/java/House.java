package com.fundamentals.java;

/* This class is part of Lesson 4
* My Application Overview */
public class House {
    String foundation;
    String roofType;
    String doorColor;
    int windowSize;

    public void doorOpenClose() {
        System.out.println("The door is open");
        windowOpenClose();

}// end method doorOpenClose

    /* The below methods are demonstrating lesson 10 Access modifiers*/
    //
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

} // end class House
