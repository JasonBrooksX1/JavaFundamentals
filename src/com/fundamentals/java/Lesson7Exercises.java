package com.fundamentals.java;
import java.util.Scanner;
/*
 *The content of this class goes over the Lesson 7 content
 *Java Operators
 **/
public class Lesson7Exercises {

    // This method takes in numbers from the user and adds it.
    public void addTwoNumbers() {
        int x, y, z;
        System.out.println("Enter two integers to calculate their sum.");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        y = in.nextInt();
        z = x + y;
        System.out.println("Tne Sum of entered values =" + z);
    } // end method addTwoNumbers


    // This method covers Assignment Operators for basic math
    public void exampleAssignment() {
        int able = 1, may = 1;
        able += may;
        System.out.println(able);
        able *= may;
        System.out.println(may);
        may %= able;
        System.out.println(may);
        may ^= able;
        System.out.println(may);
    } // end method exampleAssignment

     public void mathStuff() {
    int able = 1, may = 1;
    able += may;
        System.out.println(able);
    able *= may;
        System.out.println(may);
    may %= able;
        System.out.println(may);
    may ^= able;
        System.out.println(may);
}
/* 3. Write a method that will display the results from the math problem
 *  example below. Fill in any missing pieces to get the different outputs.**/
/* Example:**/
/*    10 + 32 * 12 / 3 **/

public void mathScramble() {
        int total = 10 + 32 * 12 / 3;
        System.out.println(total);
        int total2 = (10 + 32) * 12 / 3;
        System.out.println(total2);
}
}
