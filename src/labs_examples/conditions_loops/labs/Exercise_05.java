package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 5: Calculator
 *
 *      Take two numbers from the user, an upper and lower bound. Using a "for-loop", calculate the sum
 *      of numbers from the lower bound to the upper bound. Also, calculate the average of numbers.
 *      Print the results to the console.
 *
 *      For example, if a user enters 1 and 100, the output should be:
 *
 *      The sum is: 5050
 *      The average is: 50.5
 *
 *
 */
import java.util.Scanner;
public class Exercise_05 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to start at:");
        int lowerBound = input.nextInt();
        System.out.println("Enter a number to stop at:");
        int upperBound = input.nextInt();

        double sum = 0;
        int count = 0;
        for(int x = lowerBound; x <= upperBound; x++){
            sum += x;
            count++;
        }

        System.out.println("The sum is: " + sum);
        double average = sum / count;
        System.out.println("The average is: " + average);
    }
}
