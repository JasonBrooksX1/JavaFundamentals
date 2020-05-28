package com.fundamentals.java;

public class Lesson9Exercises {

    // This method shows array of String
    public void basicStringArray() {
        String[] stringArray = new String[4];
        stringArray[0] = "Chocolate";
        stringArray[1] = "Strawberry";
        stringArray[2] = "Razzzberry";
        stringArray[3] = "Bacon";

        for (int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]);
        }/* 1. Write a method that takes no parameters or return type. Write a single
        dimensional string array of ice cream flavors and print out the results of that
        array using a loop. */

    }

    // This method shows 2D array
    public void basicTwoDimensionalArray() {
        int[][] myArray = {{38, 28}, {42, 37}, {27, 38}, {27, 23}, {14, 30}, {40, 43}, {10, 45}, {23, 30}, {37, 21}, {14, 26},
                {51, 54}, {40, 33}, {24, 27}, {29, 28}, {31, 38}, {3, 35}, {13, 31}, {37, 31}};

        String home = "home", away = "away", msg = "";

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                if (i % 1 == 0) {
                    msg = away + "" + myArray[i][j];
                    if (i % 2 == 0) {
                        msg = home + "" + myArray[i][j];
                    }
                    System.out.println(msg);
                }// end inner for loop
            }// end outer for loop
        }/*1. Write a method that takes no parameters or return type. Write a
    two-dimensional array using the int data type. Using a search engine, fill in
    each dimension with the Chiefs football scores from the 2019 regular
    season. Using a loop, print out the results. The first dimension will be the
    home team while the second dimension will be the away team.*/
    }
}