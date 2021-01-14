package labs_examples.arrays.labs;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */
import java.util.Scanner;
public class Exercise_01 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double[] numbers = new double[10];
        double sum = 0; //variable to hold sum
        double average; //Used to store average after array is populated

        //Populate the array with numbers and add value to sum
        for(int x = 0; x < numbers.length; x++){
            System.out.println("Please enter a number value for index " + x);
            numbers[x] = input.nextDouble();
            sum += numbers[x];
        }

        average = sum / numbers.length;
        System.out.println("Sum: " + sum);
        //Can remove Math.floor() if you prefer the original double
        System.out.println("Average: " + Math.floor(average));
    }
}