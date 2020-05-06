package com.fundamentals.java;

import com.funfamentals.lesson10.Lesson10;

/* This class was created when the project
 * was created */
public class Main {

    public static void main(String[] args) {
        lesson10Examples();
        //lesson9Examples();
        //beerSong();
        //lesson8Examples();
        //lesson7Examples();
        //lesson6Examples();
        //lesson5Examples();
        // write your code here
        //System.out.println("Hello Java");
        //System.out.println("This is my first sentence");
        //System.out.println("I am new to Java");
        //System.out.println("This Java course is cool");
        //System.out.println("I am learning stuff every day");

        //myHouseExample();
    } // End main method

    public static void lesson10Examples() {
        House yourHouse = new House();
        yourHouse.doorOpenClose();
        //yourHouse.windowOpenClose(); // cannot access
        yourHouse.openGarage();
        Lesson10 myTen = new Lesson10();
        //myTen.showProtected(); //cannot access
        //myTen.showLesson(); //cannot access
        //end method lesson10Examples
    }// end method lesson 10Examples

    public static void lesson9Examples() {
        Lesson9 myNine = new Lesson9();
        myNine.basicIntArray();
        myNine.basicStringArray();
        myNine.basicTwoDimensionalArray();
        myNine.basicJaggedArray();
    }// end method lesson9Examples

    public static void beerSong() {
        BottlesOfBeerSong song = new BottlesOfBeerSong();
        song.timeToSing();
    }

    public static void lesson8Examples() {
        Lesson8 myEight = new Lesson8();
        myEight.basicIfStatement(2,2);
        myEight.basicIfElseExample(4, 4);
        myEight.basicIfElseChainExample(33);
        myEight.basicIfAndOrExample(108);
        myEight.basicSwitchExample(2);
        myEight.basicWhileExmample();
        myEight.basicForLoopExample();
        System.out.println(myEight.basicBranchingExample(7));
    } // end method lesson8Examples

    public static void lesson7Examples() {
        Lesson7 mySeven = new Lesson7();
        mySeven.basicMath();
        mySeven.exampleModulus();
        //myseven.addTwoNumbers();
        mySeven.exampleAssignment();
        mySeven.exampleLeftShift();
        mySeven.exampleRightShift();
        mySeven.exampleAND();
        mySeven.exampleXOR();
        mySeven.exampleRelational();
        mySeven.exampleIncrement();
        mySeven.exampleDecrement();
    }// end method lesson7Examples

    public static void lesson6Examples() {
        Lesson6 mySix = new Lesson6();
        mySix.exampleCharAt();
        mySix.exampleConcat("has awesome donuts");
        mySix.exampleEquals("LaMars");
        System.out.println(mySix.exampleLowercase());
        System.out.println(mySix.exampleUppercase());
        mySix.exampleBuilder("Chocolate", 2);
        mySix.exampleChar();
        mySix.exampleEscape();
    } // End method lesson6Examples

    public static void lesson5Examples() {
        Lesson5 myFive = new Lesson5();
        myFive.showLocalExample();
        int example = myFive.showLocalWithReturn(5, 7); // return to a variable
        System.out.println(example); // print variable from line above
        System.out.println(myFive.showLocalWithReturn(2, 9)); // direct return of int
        myFive.showInstanceVariable();

    } // end method lesson5Examples

    public static void myHouseExample() {
        House myHouse = new House();
        myHouse.doorOpenClose();
    } // End myHouseExample
} // end class Main
