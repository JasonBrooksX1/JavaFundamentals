package com.fundamentals.java;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;


/* This class was created when the project
 * was created */
public class Main {
    public static int num = 0;

    /* static {
        System.out.println("Static Block 1");
        num = 42;
    }// end static block

    static {
        System.out.println("Static Block 2");
        num = 63;
    }// end static block

    */

    public static void main(String[] args) {
        OrderTaker();
        //lesson17Examples();
        //lesson16Examples();
        //lesson15Examples();
        //lesson14Examples();
        //lesson12Examples();
        //myCar();
        //lesson11Exercise();
        //lesson11Examples();
        //lesson10Examples();
        //lesson9Exercises();
        //lesson9Examples();
        //beerSong();
        //lesson8Exercises();
        //lesson8Examples();
        //Lesson7Exercises();
        //lesson7Examples();
        //Lesson6Exercises();
        //lesson6Examples();
        //lesson5Exercises();
        //lesson5Examples();
        // write your code here
        //System.out.println("Hello Java");
        //System.out.println("This is my first sentence");
        //System.out.println("I am new to Java");
        //System.out.println("This Java course is cool");
        //System.out.println("I am learning stuff every day");
        //myHouseExample();
    } // End main method

    public static void OrderTaker() {
        OrderTaker taker = new OrderTaker();
        taker.welcomeMessage();
    }


    public static void lesson18Examples() {
        Lesson18 my18 = new Lesson18();
        //my18.ExampleThrows();
        //my18.ExampleException();
        //my18.myArrayException();

    }

    public static void lesson17Examples() {
        Lesson17 my17 = new Lesson17();
        //my17.exampleArrayList1();
        //my17.exampleArrayList2();
        //my17.exampleHashSet();
        my17.exampleHashMap();

    } // end method lesson17Examples();

    public static void lesson16Examples() {
        Lesson16 my16 = new Lesson16();
        my16.showEnum();

        my16.myFavoriteFlavor(Lesson16.IceCreamFlavors.CHOCOLATE);

        Lesson16Enum d1[] = Lesson16Enum.values();
        for(Lesson16Enum day : d1) {
            System.out.println(day.name() + " at index " + day.ordinal() +
                    " day number = " + day.getDayNum());
        }// end for loop

    }// end method lesson16Examples

    public static void lesson15Examples() {
        int[] myKeys = {0,1,2,3,4,5,6,7,8,9};
        Lesson15Child abs = new Lesson15Child(20, myKeys,0,"Color");
        abs.receiveCall(); // defined in child
        abs.sendCall(); // defined in child
        abs.endCall(); //defined in parent from interface
    }

    public static void lesson14Examples() {
        // Can not change value of a final variable
        //Lesson14.MY_FIRST_FINAL = 10;
        int sum = Lesson14.MY_FIRST_FINAL * 2;
        System.out.println(sum);

        Lesson14.myStaticMethod(10);
        System.out.println("Block number is " + num);
    } // end method lesson14Examples

    public static void lesson12Examples() {
        Condo myCondo = new Condo();
        myCondo.doorOpenClose(); //from House parent class
        myCondo.setBacony("railing"); //from Condo class

        // Lesson 13 on overloading
        House myHouse = new House();
        myHouse.doorOpenClose("Close");
    } // end method lesson12Examples

        public static void myCar () {
            Car myCar = new Car("suicide");
            System.out.println("The doors swing backward ");
        }// end my car

    public static void lesson11Exercise() {
Television tv = new Television(43);
float myprice = tv.getprice();
        System.out.println(myprice);
        System.out.println(tv.getports());
tv.getisMountable();
tv.turnOn();

    }

        public static void lesson11Examples () {
            House house = new House("Blue");
            //house.foundation = "concrete";
            house.setFoundation("concrete");
            //house.roofType = "shingle";
            house.setRoofType("shingle");
            System.out.println("The foundation is made of " + house.getFoundation());
        }// end method lesson11Examples

        public static void lesson10Examples () {
            House yourHouse = new House();
            yourHouse.doorOpenClose();
            //yourHouse.windowOpenClose(); // cannot access
            yourHouse.openGarage();
            Lesson6 myTen = new Lesson6();
            //myTen.showProtected(); //cannot access
            //myTen.showLesson(); //cannot access
            //end method lesson10Examples
        }// end method lesson 10Examples

    public static void lesson9Exercises () {
        Lesson9Exercises myNinex = new Lesson9Exercises();
        //myNinex.basicIntArray();
        //myNinex.basicStringArray();
        //myNinex.basicTwoDimensionalArray();
        //myNinex.basicJaggedArray();
    }// end method lesson9Examples

        public static void lesson9Examples () {
            Lesson9 myNine = new Lesson9();
            myNine.basicIntArray();
            myNine.basicStringArray();
            myNine.basicTwoDimensionalArray();
            myNine.basicJaggedArray();
        }// end method lesson9Examples

        public static void beerSong () {
            BottlesOfBeerSong song = new BottlesOfBeerSong();
            song.timeToSing();
    }
    public static void lesson8Exercises () {
        Lesson8Exercises myEightx = new Lesson8Exercises();
        //myEightx.myIfElseExample(1,2);
        //myEightx.mySwitchExample('A');
        //myEightx.myForLoopExample();
        //System.out.println(myEight.basicBranchingExample(7));
    }
        public static void lesson8Examples () {
            Lesson8 myEight = new Lesson8();
            //myEight.basicIfStatement(2, 2);
            //myEight.basicIfElseExample(4, 4);
            //myEight.basicIfElseChainExample(33);
            //myEight.basicIfAndOrExample(108);
            //myEight.basicSwitchExample(2);
            //myEight.basicWhileExmample();
            //myEight.basicForLoopExample();
            //System.out.println(myEight.basicBranchingExample(7));
        } // end method lesson8Examples

    public static void Lesson7Exercises() {
        Lesson7Exercises mySevenx = new Lesson7Exercises();
        //mySevenx.basicMath();
        //mySevenx.exampleModulus();
        mySevenx.mathScramble();
        //mySevenx.exampleAssignment();
        //mySevenx.exampleLeftShift();
        //mySevenx.exampleRightShift();
        //mySevenx.exampleAND();
        //mySevenx.exampleXOR();
        //mySevenx.exampleRelational();
        //mySevenx.exampleIncrement();
        //mySevenx.exampleDecrement();
    }// end method lesson7Exercises

        public static void lesson7Examples () {
            Lesson7 mySeven = new Lesson7();
            //mySeven.basicMath();
            //mySeven.exampleModulus();
            mySeven.addTwoNumbers();
            //mySeven.exampleAssignment();
            //mySeven.exampleLeftShift();
            //mySeven.exampleRightShift();
            //mySeven.exampleAND();
            //mySeven.exampleXOR();
            //mySeven.exampleRelational();
            //mySeven.exampleIncrement();
            //mySeven.exampleDecrement();
        }// end method lesson7Examples


        public static void Lesson6Exercises () {
            Lesson6Exercises zybok = new Lesson6Exercises();
            System.out.println(zybok.bigword());
            zybok.pilcrowSign();
            zybok.exampleBuilder();

        } // end method Pilcrow

        public static void lesson6Examples () {
            Lesson6 mySix = new Lesson6();
            //mySix.exampleCharAt();
            //mySix.exampleConcat("has awesome donuts");
            //mySix.exampleEquals("LaMars");
            //System.out.println(mySix.exampleLowercase());
            //System.out.println(mySix.exampleUppercase());
            mySix.exampleBuilder("Chocolate", 2);
            //mySix.exampleChar();
            //mySix.exampleEscape();
        } // End method lesson6Examples

        public static void lesson5Exercises () {
            Lesson5Exercises my5exp = new Lesson5Exercises();
            my5exp.showDocalExample();
            my5exp.showXocalExample();
            my5exp.showBocalExample();
            //my5exp.showLocalExample();
            //int example = my5exp.showLocalWithReturn(5, 7); // return to a variable
            //System.out.println(example); // print variable from line above
            //System.out.println(my5exp.showLocalWithReturn(2, 9)); // direct return of int
            //my5exp.showInstanceVariable();
            //my5exp.showsConversions();
            my5exp.showsWconversion();
            my5exp.showsNconversion();

        } // end method lesson5Exercises

        public static void lesson5Examples () {
            Lesson5 myFive = new Lesson5();
            myFive.showLocalExample();
            int example = myFive.showLocalWithReturn(5, 7); // return to a variable
            System.out.println(example); // print variable from line above
            System.out.println(myFive.showLocalWithReturn(2, 9)); // direct return of int
            myFive.showInstanceVariable();

        } // end method lesson5Examples

        public static void myHouseExample () {
            House myHouse = new House();
            myHouse.doorOpenClose();
        } // End myHouseExample
    } // end class Main
