package labs_examples.arrays.labs;

/**
 *  More labs_examples.arrays
 *
 *      Using the array below, take in a number from 1-10 from the user and print out the index of that
 *      element.
 *
 */
import java.util.Scanner;
public class Exercise_02 {

    public static void main(String[] args) {

        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        // write code here
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number between 1 - 10:");
        int index = input.nextInt();
        while(index < 1 || index > 10){
            System.out.println("Sorry you exceeded the range, enter a number between 1 - 10:");
            index = input.nextInt();
        }
        //Since arrays first index is 0 I need to subtract one from the index the user entered
        System.out.println("The value of index " + index + " in the array is " + array[index - 1]);



    }
}