package labs_examples.fundamentals.labs;


/**
 * Fundamentals Exercise 5: Working with Strings
 *
 *      Please follow the instructions in the comments below
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {

        String str = "hello!";
        // please declare an int variable below, and set it to the value of the length of "str"
        int strLength = str.length();
        System.out.println("Str length = " + strLength);

        String str2 = "hello";
        // please initialize a boolean variable and test whether str is equal to str2
        boolean isEqual = str.equals(str2);
        System.out.println("isEqual = " + isEqual);

        // please concatenate str & str2 and set the result to a new String variable below
        String newStr = str + " " + str2;
        System.out.println("newStr: " + newStr);

        // please demonstrate the use of any other method that is available to us in the String class
        // for example, replace(), substring(), contains(), indexOf() etc
        String sentence = "This is a sentence that will be used to show String method use";
        //Original String
        System.out.println(sentence);
        //Prints out a piece of the original String
        System.out.println(sentence.substring(3,10));
        //Prints out true or false based on what a String contains
        System.out.println(sentence.contains("show"));
        //Prints out the first index where a character appears
        System.out.println(sentence.indexOf('s'));


    }


}