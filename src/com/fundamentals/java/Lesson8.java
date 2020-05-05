package com.fundamentals.java;

public class Lesson8 {
    //This method goes over the basic if
    public void basicIfStatement(int value1, int value2) {
        System.out.println("Before if Statement");
        if (value1 == value2) {
            System.out.println("Values are equal");
        }// end if
        System.out.println("After if Statement");
    }// end method basicIfStatement

    //This method goes over the basic if else
    public void basicIfElseExample(int alpha, int beta) {
        System.out.println("Before if Statement");
        if (alpha != beta) {
            System.out.println("Values are not equal");
        } else {
            System.out.println("The values are equal");
        } // end if else
        System.out.println("End of if statement");
    } // end method basicIfElseExample

    // This method goes over if else chain
    public void basicIfElseChainExample(int charlie) {
        System.out.println("Before if statement");
        if (charlie < 30) {
            System.out.println("The value is less than 30");
        } else if (charlie < 40) {
            System.out.println("The value is greater than 30, but less then 40");
        } else {
            System.out.println("The value is greater than 40");
        }
        System.out.println("After if statement");
    } // end method basicIfElseChainExample

    // This method goes over And and Or conditions
    public void basicIfAndOrExample(int delta) {
        System.out.println("Before if statement");
        if (delta > 100 || delta < 50) {
            System.out.println("The value is not between 100 and 50");
        } // end if

        // if delta modulus 2 is 0 and greater than 30
        if (delta % 2 == 0 && delta > 30) {
            System.out.println("The value is greater than 30 and its an even number");
        } // end if
    } // end method basicIfAndOrExample

    //This method demonstrates a switch statement with case
    public void basicSwitchExample(int day) {
        switch (day) {
            case 1:
                System.out.println("Day = 1");
                break;
            case 2:
                System.out.println("Day = 2");
            case 3:
            case 4:
                System.out.println("Day = 3 or 4");
                break;
            default:
                System.out.println("day is greater thn 4");
                break;
        }// end switch
    }// end method basicSwitchExample

    //This method goes over the while loop
    public void basicWhileExmample() {
        int val = 0; // initialized value
        while(val < 10) {
            System.out.println(val);
            val++;
        }// end while
    }// end method basicWhileExample

    // This method goes over the do while loop
    public void basicDoWhileExample() {
        int able = 0; // initialized value
        do{
            System.out.println(able);
            able++; //increment
        }while(able < 10); //condition
    }// end class Lesson8

} // end class Lesson8
