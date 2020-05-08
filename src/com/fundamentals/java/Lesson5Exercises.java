package com.fundamentals.java;

public class Lesson5Exercises {

    // This primitive type has value range of -128 to 127
    byte myByte = 9;

    // This primitive type has value range of -32768 to 32767
    short myShort = 235;

    /* This primitive type has value range of
     * -2,147,483,648 to 2,147,483,647 */
    int myInt = 2354;

    /* This primitive type has value range of
     * -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 */
    long myLong = 56864L;

    // This primitive type has value range of 2.4e-038 to 3.4e+038
    float myFloat = 34.53F;

    // This primitive type has value range of 1.7e-308 to 1.7e+308
    double myDouble = 84.98D;
    double myOtherDouble = 36.43;

    public void showDocalExample() { // Decimal value of 29;
        int value = 29;
        System.out.println(value);
    }

    public void showXocalExample() { // Hexadecimal value of 29
        int value2 = 0x1d;
        System.out.println(value2);
    }

    public void showBocalExample() {    //Binary value of 29
    int value3 = 0b11101;
        System.out.println(value3);
    }

    public void showsWconversion() {
        byte ll2 = myByte; // implicit or widening conversion
        int val = myInt;
        short charlie = myShort;
        long delta = myLong;
        int alpha = myInt;
        float beta = myFloat;
        System.out.println(ll2);
        System.out.println(val);
        System.out.println(charlie);
        System.out.println(delta);
        System.out.println(alpha);
        System.out.println(beta);

    }

    public void showsNconversion() {
        double ll2 = myDouble;
        long val = myLong;
        float charlie = myFloat;
        int delta = myInt;
        long alpha = myLong;
        short beta = myShort;

        System.out.println(ll2);
        System.out.println(val);
        System.out.println(charlie);
        System.out.println(delta);
        System.out.println(alpha);
        System.out.println(beta);
    }

}