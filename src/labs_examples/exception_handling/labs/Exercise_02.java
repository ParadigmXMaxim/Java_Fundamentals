package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 2:
 *
 *      Demonstrate a try/catch with multiple catch statements.
 *
 */
import java.util.Scanner;
import java.util.InputMismatchException;
public class Exercise_02 {
    public static void main(String[] args) {
       try{
           Scanner input = new Scanner(System.in);

           System.out.println("Enter two integers to divide by");
           int num1 = input.nextInt();
           int num2 = input.nextInt();

           int divideTwoNum = num1 / num2;
           System.out.println(num1 + " / " + num2 + " = " + divideTwoNum);
       }catch(InputMismatchException ime){
           System.out.println("You did not enter a integer");
           System.out.println(ime.getMessage());
       }catch(ArithmeticException ae){
           System.out.println("You cannot divide by zero");
           System.out.println(ae.getMessage());
       }catch(Exception e){
           System.out.println("Not sure what you did but stop it!!!");
           System.out.println(e.getMessage());
       }





    }
}
