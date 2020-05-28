package com.fundamentals.java;

public class Lesson6Exercises {

    String myString = "HUUMUNGOUS";
    public String bigword(){
        return myString.toLowerCase();
    }

    public void pilcrowSign() {
        char c1 = '\u00B6';
        System.out.println(c1);
    }
    // Example of how to use the StringBuilder class
    public void exampleBuilder() {
        StringBuilder build = new StringBuilder();
        build.append("Jack and Jill\n" +
                "Went up the hill\n" +
                "To fetch a pail of water.\n" +
                "Jack fell down and broke his crown\n" +
                "And Jill came tumbling after.");
        System.out.println(build);
    } // end method exampleBuilder
}