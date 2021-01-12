package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 9: break
 *
 *      Demonstrate the use of the "break" statement to exit a loop.
 *
 */

public class Exercise_09 {
    public static void main(String[] args){
        for(int x = 0; x < 100; x++){
            System.out.println(x);
            if(x == 5){
                System.out.println("Uh oh if x = 5 the loop will stop");
                break;
            }
        }
    }
}
