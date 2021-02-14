package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 5:
 *
 *      Demonstrate how to throw an exception.
 *
 */
import java.util.Scanner;
public class Exercise_05 {
    public static void main(String[] args) {
        Scanner response = new Scanner(System.in);
        System.out.println("Enter two numbers to be divided");
        int num1 = response.nextInt();
        int num2 = response.nextInt();
        try{
            int result = divide(num1,num2);
            System.out.println(num1 + " / " + num2 + " = " + result);
        }catch(ArithmeticException ae){
            System.out.println("Not sure if you knew but you can not divide by zero");
            System.out.println(ae.getMessage());
        }
    }

    public static int divide(int num1, int num2) throws ArithmeticException{
        try{
            int outcome = num1 / num2;
            return outcome;
        }catch(ArithmeticException ae){
            System.out.println(ae.getMessage());
            throw new ArithmeticException();
        }
    }
}