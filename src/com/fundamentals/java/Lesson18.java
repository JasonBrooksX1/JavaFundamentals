package com.fundamentals.java;

/*This class goes over the lesson 18 content
* Exception Handling */

public class Lesson18 {
    House ranch;


    public void ExampleException() {
        try {
            System.out.println(ranch.getWindowSize());
        } catch (NullPointerException e) {
            System.out.println("A null pointer was call" + e.getMessage());
        } finally {
            System.out.println("The finally block was called");
        }// end try / catch / finally
    }// end method exampleException

    public void myArrayException() {
        String[] names = {"243", "424", "542"};
        try {
            byte b = Byte.parseByte(names[1]);
            System.out.println(b);
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Please provide at least 1 argument");
        } catch (NumberFormatException ed) {
            System.out.println("That is not a number");
        } catch (StackOverflowError e) {
            System.out.println("You have given me more than a byte");
        } catch (Exception ea) {
            System.out.println("I dunno what you did " + ea.toString());
        }
    } // end method myArrayException

}//end class Lesson18
