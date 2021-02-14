package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 7:
 *
 *      1) Create a custom exception.
 *      2) Demonstrate a method throwing your custom exception.
 */
import java.util.Scanner;
public class Exercise_07 {
    public static void main(String[] args){
        try{
            ride();
        }catch(HeightException he){
            System.out.println(he.toString());
        }
    }

    public static void ride() throws HeightException{
        System.out.println("Welcome to RideLand");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your height in inches( 12 inches = 1 Foot)");
        int yourHeight = input.nextInt();
        double heightConversion = ((int)yourHeight / 12) + ((yourHeight % 12) * .10);
        if(heightConversion < 6){
            System.out.println("Sorry since you are " + heightConversion + " ft you are below the 6ft requirement");
            throw new HeightException();

        }else{
            System.out.println(("Enjoy every rind at RideLand!!!!"));
        }
    }

}

class HeightException extends Exception{
    @Override
    public String toString() {
        return "HeightException(You must be 6ft or over to get on the rides)";
    }
}