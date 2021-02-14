package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 1:
 *
 *      1) Demonstrate a try/catch.
 *
 */
public class Exercise_01{
    public static void main(String[] args){
        try{
            int[] ages = {31, 34, 38};
            for(int x = 0; x < 4; x++){
                System.out.println("Age: " + ages[x]);
            }
        }catch(ArrayIndexOutOfBoundsException aie){
            System.out.println("Exception Details:");
            System.out.println("Index " + aie.getMessage() + " is not in scope");
            System.out.println("Index " + aie.getLocalizedMessage() + " is not in scope");
        }
    }
}

