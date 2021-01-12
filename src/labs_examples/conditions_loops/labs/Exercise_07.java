package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and using a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 *      Hints:
 *          - there are a few helpful methods in the String class called length(), charAt() and indexOf()
 *          - you'll likely want to use a String that contains all the vowels:
 *              - ie: String vowels = "aeiou";
 *
 */
import java.util.Scanner;
public class Exercise_07 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word:");
        String userWord = input.next();
        //Just in case a user capitalizes any letter in their word, convert the whole string to lowercase
        userWord = userWord.toLowerCase();
        char firstVowel = '\u0000';

        for(int x = 0; x < userWord.length(); x++){
            //Didn't feel like making multiple if statements so I put it into one
            if(userWord.charAt(x) == 'a' || userWord.charAt(x) == 'e' || userWord.charAt(x) == 'i' || userWord.charAt(x) == 'o' || userWord.charAt(x) == 'u'){
                firstVowel = userWord.charAt(x);
                System.out.println("Word: " + userWord);
                System.out.println("First Vowel: " + firstVowel);
                break;
            }else{
                //If you wanted to see step by step which was not a vowel just uncomment below
                //System.out.println("No vowel found at userWord.charAt(" + x + ")");
                continue;
            }
        }

        //Covers instance where no vowel exist
        if(firstVowel == '\u0000'){
            System.out.println("You entered " + userWord + " and that has no vowels");
        }


    }
}
