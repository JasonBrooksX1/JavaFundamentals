package com.fundamentals.java;

public class Lesson8Exercises {

    public void myIfElseExample(int alpha, int beta) {
        System.out.println("Before if Statement");
        if (alpha != beta) {
            System.out.println("Values are not equal");
        } else {
            System.out.println("The values are equal");
        } // end if else
        System.out.println("End of if statement");
    } //Write a method that takes two string parameters with no return type.
    //Using an if/else statement, compare the two strings to each other. Using
    //println statements, display whether or not they are equal /

    //This method demonstrates a switch statement with case
    public void mySwitchExample(char grade) {
        switch (grade) {
            case 'E':
            case 'e':
                System.out.println("grade = Excellent");
                break;
            case 'V':
            case 'v':
                System.out.println("grade = Very Good");
            case 'G':
            case 'g':
                System.out.println("grade = Good");
                break;
            case 'A':
            case 'a':
                System.out.println("grade = Average");
                break;
            case 'F':
            case 'f':
                System.out.println("grade = Fail");
                break;
            default:
                System.out.println("not a grade");
                break;
        }// end switch
    }

    public void myForLoopExample() {
        for (int i = 0; i < 31; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            } // end if


        } // Write a method that will take no parameters or return type. Using a loop,
        // display all the numbers divisible by 3 from 0 to 30. Utilize a modulus to
        // obtain your results.
    }
}
